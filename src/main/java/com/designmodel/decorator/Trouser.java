package com.designmodel.decorator;

/**
 * @author ys
 * @Description
 * @Date 2019/5/7 14:06
 */
public class Trouser extends Dress {
    @Override
    public void show() {
        super.show();
        System.out.println("垮裤");
    }
}
