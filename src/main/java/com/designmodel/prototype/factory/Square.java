package com.designmodel.prototype.factory;

/**
 * @author ys
 * @Description
 * @Date 2019/5/8 10:21
 * 正方形
 */
public class Square extends Shape{

    public Square() {
        this.type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Square: i'm square");
    }
}
