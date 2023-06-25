package com.example.cafemenu;

public class Sandwhich {
    private String name;
    private String desc;
    private int img;

    public static Sandwhich[] sandwhiches = {
            new Sandwhich("Peanut Butter and Jelly","Peanut butter and jelly on some toast.",R.drawable.pb_and_j),
            new Sandwhich("Salami","Toasted Salami and mayonnaise.",R.drawable.salami_and_mayo),
            new Sandwhich("Hummus","Pita bread with hummus in it.",R.drawable.hummus_and_pita_bread),
    };

    private Sandwhich(String name,String desc, int img){
        this.name=name;
        this.desc=desc;
        this.img=img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String toString(){ return name;}

}
