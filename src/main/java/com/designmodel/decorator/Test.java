package com.designmodel.decorator;

/**
 * @author ys
 * @Description
 * @Date 2019/5/7 14:07
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person("小菜");
        System.out.println("装扮后的小菜");

        TShirts tShirts = new TShirts();
        Trouser trouser = new Trouser();
        Shoes shoes = new Shoes();

        tShirts.decrate(person);
        trouser.decrate(tShirts);
        shoes.decrate(trouser);

        shoes.show();
    }

}
