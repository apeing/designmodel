package com.example.builder;

public class VegBurger extends Burger {

    public String name() {
        return "VegBurger";
    }

    public float price() {
        return (float) 25.1;
    }
}
