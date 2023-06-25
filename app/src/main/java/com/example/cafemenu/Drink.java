package com.example.cafemenu;

public class Drink {
    private String name;
    private String desc;
    private int img;

    public static Drink[] drinks = {
        new Drink("Espresso","Very bitter drink that contains enough caffeine to keep you up for days!",R.drawable.esspresso),
        new Drink("Americano","Originating from America, packs all the necessary energy for an explosive evening ",R.drawable.americano),
        new Drink("Arabic","Best coffee from the middle east",R.drawable.arabic),
        new Drink("Americano with cream","Americano just with cream",R.drawable.americano_with_cream),
        new Drink("Americano with drawing","Americano with some cream and a drawing in it",R.drawable.americano_with_shapes),
    };

    private Drink(String name,String desc, int img){
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
