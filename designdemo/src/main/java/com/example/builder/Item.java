package com.example.builder;

public interface Item {
    //名称
    public String name();
    //包装
    public Packing packing();
    //价格
    public float price();
}
