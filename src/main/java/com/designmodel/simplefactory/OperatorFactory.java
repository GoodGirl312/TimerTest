package com.designmodel.simplefactory;

/**
 * @author ys
 * @Description
 * @Date 2019/5/7 9:48
 */
public class OperatorFactory {

    Operator operator;
    public Operator getOperator(String type) {
        switch (type) {
            case "+":
                operator = new OperateAdd();
                break;
            case "-":
                operator = new OperateSub();
                break;
            case "*":
                operator = new OperateMul();
                break;
            case "/":
                operator = new OperateDiv();
            default:
                break;
        }
        return operator;
    }
}
