package com.lsf.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by shengfeng on 2016/11/18.
 */
public class ProxyTest {

    public static void main(String[] args) {
        Subject realSubject = new RealSubject();

        InvocationHandler handler = new InvocationHandlerImpl(realSubject);

        Subject subject = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), handler);

        System.out.println(subject.sayHello("shengfeng"));

        System.out.println(subject.sayBye());
    }
}
