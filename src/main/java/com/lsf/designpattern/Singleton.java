package com.lsf.designpattern;

public class Singleton {

    /*
     * 
     * 这是第一种，饿汉式 ，线程安全，但是效率低
     * 
     * private Singleton() {
     * 
     * }
     * 
     * private static Singleton singleton = new Singleton();
     * 
     * public static Singleton getInstance() { return singleton; }
     * 
     * 
     */

    /*
     * 这是第二种，饱汉式，线程不安全，如果要线程安全的话，必须给getInstance这个方法加锁
     * 
     * private Singleton() {
     * 
     * }
     * 
     * private static Singleton singleton;
     * 
     * public static Singleton getInstance() { if (singleton == null) {
     * singleton = new Singleton(); }
     * 
     * return singleton;
     * 
     * }
     *
     * 
     */

    // 第三种是单例模式的最优方案，线程安全而且效率高
    // 使用同步代码块（对象未初始化时，使用同步代码块，保证多线程访问时对象在第一次创建后，不再重复被创建）

    private Singleton() {

    }

    // 当一个共享变量被volatile修饰时，它会保证修改的值会立即被更新到主存，当有其他线程需要读取时，它会去内存中读取新值。
    private static volatile Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null) {

            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }

}
