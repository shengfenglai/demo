package com.lsf.proxy;

/**
 * Created by shengfeng on 2016/11/18.
 */
public class RealSubject implements Subject {


    public String sayHello(String name) {
        return "hello" + name;
    }

    public String sayBye() {
        return "good bye";
    }
}

