package com.example.myproject;

public class Foods {
    int id;
    String name;
    String price;

    public Foods(int id, String price, String name){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

}
