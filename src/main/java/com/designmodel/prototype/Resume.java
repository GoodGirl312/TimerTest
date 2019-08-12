package com.designmodel.prototype;

import lombok.Data;

/**
 * @author ys
 * @Description
 * @Date 2019/5/8 9:54
 */
@Data
public class Resume implements Cloneable{
    private String name ;
    private int age;
    private String sex;
    private WorkExperience workExperience;

    public Resume() {
    }

    public Resume(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    @Override
    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
