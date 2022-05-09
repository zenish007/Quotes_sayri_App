package com.example.quotes_sayri_app.Controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quotes_sayri_app.Model.Model_class;
import com.example.quotes_sayri_app.R;
import com.example.quotes_sayri_app.Sayri;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


public class My_Rv_Adpter1 extends RecyclerView.Adapter<My_Rv_Adpter1.ViewData> {

    Activity activity;
    List<Model_class> l2 = new ArrayList<>();
    public int i =0;

    public My_Rv_Adpter1(Sayri sayri, List<Model_class> l2) {

        activity = sayri;
        this.l2 = l2;

    }


    @NonNull
    @Override
    public My_Rv_Adpter1.ViewData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.item2, parent, false);

        return new ViewData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewData holder, @SuppressLint("RecyclerView") int position) {
        String Text = l2.get(position).getLove();
        holder.txt_item2.setText(l2.get(position).getLove());
        holder.Screen_View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (i<12)
                {
                    holder.Screen_View.setImageResource(l2.get(i).getI());

                    i++;
                    if (i>=12)
                    {
                        i=0;
                    }
                }
            }
        });
//        holder.Screen_View.setImageResource(l2.get(position).getSwitch_img());
        holder.like_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, "lik", Toast.LENGTH_SHORT).show();

            }
        });

        holder.copy_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Copy("",Text );
                Toast.makeText(activity, "Copied", Toast.LENGTH_SHORT).show();

            }
        });



    }

    @Override
    public int getItemCount() {
        return l2.size();
    }


    void Copy(String s, String text) {
        ClipboardManager clipboard = (ClipboardManager) activity.getSystemService(activity.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText(s, text);
        clipboard.setPrimaryClip(clip);
    }

    public class ViewData extends RecyclerView.ViewHolder {
        private final CardView card_sayri;
        private final TextView txt_item2;
        private final ImageView Screen_View;
        private final ImageView like_btn;
        private final LinearLayout copy_btn;

        public ViewData(@NonNull View itemView) {
            super(itemView);
            card_sayri = itemView.findViewById(R.id.card_sayri);
            txt_item2 = itemView.findViewById(R.id.txt_item2);
            Screen_View = itemView.findViewById(R.id.Screen_View);
            like_btn = itemView.findViewById(R.id.like_btn);
            copy_btn = itemView.findViewById(R.id.copy_btn);
        }
    }
}
