package com.lsf.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by shengfeng on 2016/11/18.
 */
public class InvocationHandlerImpl implements InvocationHandler {

    private Subject subject;

    public InvocationHandlerImpl(Subject subject) {
        this.subject = subject;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("代理前-----------");

        Object readValue = method.invoke(subject,args);

        System.out.println("代理后-----------");
        return readValue;
    }
}
