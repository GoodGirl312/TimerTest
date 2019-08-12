package com.designmodel.prototype.factory;

/**
 * @author ys
 * @Description
 * @Date 2019/5/8 10:21
 * 正方形
 */
public class Rectangle extends Shape{
    public Rectangle() {
        this.type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Rectangle: i'm rectangle");
    }
}
