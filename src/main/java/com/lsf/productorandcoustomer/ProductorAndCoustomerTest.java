package com.lsf.productorandcoustomer;

import java.util.ArrayList;
import java.util.List;

public class ProductorAndCoustomerTest {

    public static void main(String args[]) {
        Repository repository = new Repository();
        Productor p = new Productor(repository, "p1");
        Coustomer c1 = new Coustomer(repository, "c1");
        Coustomer c2 = new Coustomer(repository, "c2");
        p.start();// 开启线程
        c1.start();// 开启线程
        c2.start();// 开启线程
    }
}

// Iphone这个类
class Iphone {

    String name;

    public Iphone(String name) {
        this.name = name; // 对成员变量初始化
    }

    public String toString() {
        return name; // 重写toString方法
    }
}

// 放iphone这个方法
class Repository {

    List<Iphone> list = new ArrayList<Iphone>();

    public synchronized void addIphone(Iphone iphone) {
        while (list.size() == 5) { // 当符合条件的时候进入死循环
            try {
                this.wait();
            } catch (InterruptedException e) {

            }
        }
        this.notifyAll();// 唤醒所有的线程
        list.add(0, iphone);// 把iphone加进去
    }

    // 拿iphone这个方法
    public synchronized Iphone getIphone() {
        while (list.size() == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {

            }
        }
        this.notifyAll();
        Iphone iphone = list.get(list.size() - 1);
        list.remove(list.size() - 1);// 拿到之后还要移除
        return iphone;
    }
}

// 生产者类
class Productor extends Thread {

    Repository repository;
    String name;

    public Productor(Repository repository, String name) {
        this.repository = repository;
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 200; i++) {
            Iphone iphone = new Iphone("iphone" + i);
            repository.addIphone(iphone);
            System.out.println("生产者" + this.name + "生产了" + iphone);
            try {
                Productor.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {

            }
        }
    }
}

// 消费者类
class Coustomer extends Thread {

    Repository repository;
    String name;

    public Coustomer(Repository repository, String name) {
        this.repository = repository;
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 100; i++) {
            Iphone iphone = repository.getIphone();
            System.out.println("消费者" + this.name + "消费了" + iphone);
            try {
                Coustomer.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {

            }
        }
    }
}
