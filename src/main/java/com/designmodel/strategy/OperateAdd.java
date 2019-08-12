package com.designmodel.strategy;

/**
 * @author ys
 * @Description
 * @Date 2019/5/7 10:19
 */
public class OperateAdd extends OperateStrategy {
    @Override
    public double operate(double num1, double num2) {
        return num1 + num2;
    }
}
