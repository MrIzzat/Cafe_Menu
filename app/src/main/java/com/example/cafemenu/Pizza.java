package com.example.cafemenu;

public class Pizza {

    private String name;
    private String desc;
    private int img;

    public static Pizza[] pizzas = {
            new Pizza("Margerihta","Pizza made with four kinds of cheese!",R.drawable.cheese_pizza),
            new Pizza("Chicken","Pizza containing chicken olives and onions",R.drawable.chicken_pizza),
            new Pizza("Vegetable","Pizza with olives green peppers and bell peppers",R.drawable.vegetable_pizza),
    };

    private Pizza(String name,String desc, int img){
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
