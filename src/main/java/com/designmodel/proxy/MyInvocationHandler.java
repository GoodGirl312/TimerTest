package com.designmodel.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ys
 * @Description
 * @Date 2019/5/7 15:31
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object object;

    public MyInvocationHandler(Object o) {
        this.object = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object, args);
    }

    public static void main(String[] args) {
        //创建需要被代理的类
        Pursuer s = new Pursuer();

        // 创建被代理类的委托类,之后想要调用被代理类的方法时，都会委托给这个类的invoke(Object proxy, Method method, Object[] args)方法
        MyInvocationHandler h = new MyInvocationHandler(s);
        //生成代理类
        PursueAction proxy = (PursueAction) Proxy.newProxyInstance(s.getClass().getClassLoader(), s.getClass().getInterfaces(), h);
        //通过代理类调用 被代理类的方法
        proxy.giveDolls();
        System.out.println("end");
    }
}
