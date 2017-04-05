package com.lsf.object;

//tom猫抓住了jack老鼠，jack哭了
public class CatCatchMouseTest {

    public static void main(String[] args) {
        Cat cat = new Cat("tom");
        Mouse mouse = new Mouse("jack");
        cat.catchMouse(mouse);
    }

}

class Cat {

    String name;

    public Cat(String name) {
        this.name = name;
    }

    public void catchMouse(Mouse mouse) {
        System.out.println("cat catch the mouse");
        mouse.cry();
    }
}

class Mouse {

    String name;

    public Mouse(String name) {
        this.name = name;
    }

    public void cry() {
        System.out.println("mouse crying~");
    }
}
