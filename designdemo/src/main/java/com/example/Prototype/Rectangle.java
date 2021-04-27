package com.example.Prototype;

public class Rectangle extends Shape {

    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
    public Rectangle(){
        type = "Rectangle";
    }
}
