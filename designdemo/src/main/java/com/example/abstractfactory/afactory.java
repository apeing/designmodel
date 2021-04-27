package com.example.abstractfactory;

public class afactory {
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
    //使用getcolor方法获取颜色类型的对象
    public color getcolor(String type){
        if(type == "blue"){
            return new blue();
        }else if(type == "red"){
            return new red();
        }else if(type == "yellow"){
            return new yellow();
        }else{
            return null;
        }
    }
}
