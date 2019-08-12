package com.designmodel.strategy;

/**
 * @author ys
 * @Description
 * @Date 2019/5/7 9:48
 */
public class OperatorContextStrategy {

    OperateStrategy operateStrategy = null;

    public OperatorContextStrategy(String type) {
        switch (type) {
            case "+":
                operateStrategy = new OperateAdd();
                break;
            case "-":
                operateStrategy = new OperateSub();
                break;
            case "*":
                operateStrategy = new OperateMul();
                break;
            case "/":
                operateStrategy = new OperateDiv();
            default:
                break;
        }
    }

    public double getResult(double num1, double num2) throws Exception{
        return operateStrategy.operate(num1, num2);
    }
}
