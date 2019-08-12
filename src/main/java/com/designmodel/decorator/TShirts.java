package com.designmodel.decorator;

/**
 * @author ys
 * @Description
 * @Date 2019/5/7 14:05
 */
public class TShirts extends Dress {
    @Override
    public void show() {
        super.show();
        System.out.println("T恤");
    }
}
