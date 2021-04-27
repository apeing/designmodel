package com.example.factory;

public class factorydemo {
    public static void main(String[] args) {
        shapefactory fdemo = new shapefactory();
        //circle
        shape dshape = fdemo.getshape("circle");
        dshape.draw();
        //rectangle
        shape shape2 = fdemo.getshape("rectangle");
        shape2.draw();
        //null
        shape shape3 = fdemo.getshape("cd");
        if(shape3 != null)
            shape3.draw();
        else System.out.println("shape3 为空");
    }
}
