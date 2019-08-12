package com.designmodel.strategy;

import java.util.Scanner;

/**
 * @author ys
 * @Description
 * @Date 2019/5/7 9:49
 */
public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数值：");
        double numOne = Integer.parseInt(scanner.nextLine());
        System.out.println("请输入第二个数值：");
        double numTwo = Integer.parseInt(scanner.nextLine());
        System.out.println("请输入操作符（+、-、*、/）：");
        String oper = scanner.nextLine();
        double result = 0;

        OperatorContextStrategy operator = new OperatorContextStrategy(oper);
        try {
            result = operator.getResult(numOne, numTwo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);

    }
}
