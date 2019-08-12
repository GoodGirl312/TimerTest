package com.designmodel.simplefactory;

/**
 * @author ys
 * @Description
 * @Date 2019/5/7 10:19
 */
public class OperateDiv extends Operator {
    @Override
    public double operate(double num1, double num2) throws Exception {
        if (num2 == 0) {
            throw new Exception("被除数不能为0！");
        }
        return num1 / num2;
    }
}
