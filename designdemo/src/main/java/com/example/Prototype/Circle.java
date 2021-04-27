package com.example.Prototype;

public class Circle extends Shape {
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
    public Circle(){
        type = "Circle";
    }
}
