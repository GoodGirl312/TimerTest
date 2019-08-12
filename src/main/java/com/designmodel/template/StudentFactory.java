package com.designmodel.template;

/**
 * @author ys
 * @Description
 * @Date 2019/5/8 11:12
 */
public class StudentFactory {

    private static Student student;

    public StudentFactory() {
        if (student == null) {
            student = new Student();
        }
    }

    public Student getStudent() {
        return student;
    }
}
