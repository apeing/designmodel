package com.example.factory;

public class shapefactory {
    //使用 getShape 方法获取形状类型的对象
    public shape getshape(String type){
        if(type == "circle"){
            return new circle();
        }else if(type == "rectangle"){
            return new rectangle();
        }else if(type == "square"){
            return new square();
        }else{
            return null;
        }
    }
}
