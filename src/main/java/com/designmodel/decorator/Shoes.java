package com.designmodel.decorator;

/**
 * @author ys
 * @Description
 * @Date 2019/5/7 14:07
 */
public class Shoes extends Dress{
    @Override
    public void show() {
        super.show();
        System.out.println("皮鞋");
    }
}
