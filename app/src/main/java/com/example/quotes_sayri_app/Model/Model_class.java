package com.example.quotes_sayri_app.Model;

public class Model_class {



int i;
    int imge;
    String name;
    int img;
    int set_img;
    String love;
    int switch_img;

    public int getImge() {
        return imge;
    }
    public int getSwitch_img() {
        return switch_img;
    }

    public void setSwitch_img(int switch_img) {
        this.switch_img = switch_img;
    }

    public int getSet_img() {
        return set_img;
    }

    public void setSet_img(int set_img) {
        this.set_img = set_img;
    }

    public Model_class(String name, int img, int set_img) {
        this.name = name;
        this.img = img;
        this.set_img = set_img;


    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Model_class(String love, int i) {
        this.love = love;
        this.i=i;

    }

    public void setImge(int imge) {
        this.imge = imge;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public String getName() {

        return name;
    }

    void setName(String name) {

        this.name = name;
    }


    public int getImg() {
        return img;

    }

    public void setImg(int img) {
        this.img = img;

    }
}
