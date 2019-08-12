package com.designmodel.decorator;

/**
 * @author ys
 * @Description
 * @Date 2019/5/7 13:57
 */
public class Dress extends Person {

    protected Person person;

    public void decrate(Person p){
        this.person = p;
    }

    @Override
    public void show() {
        if(person!=null){
            person.show();
        }
    }
}
