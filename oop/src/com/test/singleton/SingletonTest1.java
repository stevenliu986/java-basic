package com.test.singleton;

/**
 * ClassName: SingletonTest1
 * Package: com.test.singleton
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 10/01/2023
 * <p>
 * 单例设计模式：
 * 1. 就是采取一定的方法来保证整个的软件系统中对某个类只能存在一个对象实例
 * 2. 实现：饿汉式和懒汉式
 */
public class SingletonTest1 {
    private static Bank1 bank1;

    public static void main(String[] args) {

        Bank1 bank1 = Bank1.getInstance();
    }
}

/**
 * 饿汉式
 */
class Bank1 {
    /**
     * 私有化构造器
     */
    private Bank1() {
    }

    /**
     * 内部创建类的对象，要求此对象也必须声明为静态的
     */
    private static Bank1 instance = new Bank1();

    /**
     * 提供公共方法返回类的对象
     */
    public static Bank1 getInstance() {
        return instance;
    }
}

/**
 * 懒汉式
 */
class Bank2 {
    /**
     * 私有化构造器
     */
    private Bank2() {
    }

    /**
     * 声明当前类对象
     */
    private static Bank2 instance = null;

    /**
     * 声明public、static的返回当前类对象的方法
     */
    public static Bank2 getInstance() {
        if (instance == null) {
            instance = new Bank2();
        }
        return instance;
    }
}