package com.designmodel.template;

/**
 * @author ys
 * @Description
 * @Date 2019/5/8 11:12
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("学生甲：");
        Student student = new Student();
        student.ques1();
        student.ques2();
        student.ques3();

        System.out.println("学生乙：");
        Student2 student2 = new Student2();
        student2.ques1();
        student2.ques2();
        student2.ques3();
    }
}
