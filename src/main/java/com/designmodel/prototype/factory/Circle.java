package com.designmodel.prototype.factory;

/**
 * @author ys
 * @Description
 * @Date 2019/5/8 10:21
 * 圆形
 */
public class Circle extends Shape{

    public Circle() {
        this.type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Circle: i'm circle");
    }
}
