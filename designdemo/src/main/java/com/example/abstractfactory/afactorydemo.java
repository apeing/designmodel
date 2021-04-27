package com.example.abstractfactory;

public class afactorydemo {
    public static void main(String[] args) {
        afactory af = new afactory();
        shape shape1 = af.getshape("circle");
        shape1.draw();
        shape shape2 = af.getshape("square");
        shape2.draw();
        color color1 = af.getcolor("red");
        color1.fill();
        color color2 = af.getcolor("yellow");
        color2.fill();
    }
}
