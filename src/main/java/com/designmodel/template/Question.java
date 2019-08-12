package com.designmodel.template;

/**
 * @author ys
 * @Description
 * @Date 2019/5/8 10:58
 */
abstract class Question {

    void ques1() {
        System.out.println("1+1 = " + answer1());
    }
    void ques2() {
        System.out.println("1+2 = " + answer2());
    }
    void ques3() {
        System.out.println("1+3 = " + answer3());
    }

    abstract int answer1();
    abstract int answer2();
    abstract int answer3();
}
