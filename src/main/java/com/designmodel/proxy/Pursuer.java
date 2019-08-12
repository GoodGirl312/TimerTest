package com.designmodel.proxy;

/**
 * @author ys
 * @Description
 * @Date 2019/5/7 14:55
 * 追求者
 */
public class Pursuer implements PursueAction{

    String  name;

    public Pursuer() {
    }

    public Pursuer(String  name) {
        this.name = name;
    }

    @Override
    public void giveFlowers(){
        System.out.println("送鲜花");
    }
    @Override
    public void giveChocolate(){
        System.out.println("送巧克力");
    }
    @Override
    public void giveDolls(){
        System.out.println("送洋娃娃");
    }
}
