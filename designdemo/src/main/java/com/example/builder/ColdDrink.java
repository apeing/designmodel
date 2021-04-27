package com.example.builder;

public abstract class ColdDrink implements Item {
    //包装方法
    public Packing packing() {
        return new Bottle();
    }
    //价格
    public abstract float price();
}
