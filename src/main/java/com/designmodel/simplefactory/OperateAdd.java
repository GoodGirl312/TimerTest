package com.designmodel.simplefactory;

/**
 * @author ys
 * @Description
 * @Date 2019/5/7 10:19
 */
public class OperateAdd extends Operator{
    @Override
    public double operate(double num1, double num2) {
        return num1 + num2;
    }
}
