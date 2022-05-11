package com.ultimate.ui.Home;

public class HomeModel {
    private int pic1, pic2;
    private  String text1, text2;
    private String id;

    public HomeModel(int pic1, int pic2, String text1, String text2, String id) {
        this.pic1 = pic1;
        this.pic2 = pic2;
        this.text1 = text1;
        this.text2 = text2;
        this.id = id;
    }

    public int getPic1() {
        return pic1;
    }

    public void setPic1(int pic1) {
        this.pic1 = pic1;
    }

    public int getPic2() {
        return pic2;
    }

    public void setPic2(int pic2) {
        this.pic2 = pic2;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
