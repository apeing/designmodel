package com.example.Prototype;

public class Square extends Shape{
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
    public Square(){
        type = "Square";
    }
}
