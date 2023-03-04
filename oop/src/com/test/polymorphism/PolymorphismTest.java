package com.test.polymorphism;

/**
 * ClassName: PolymorphismTest
 * Package: com.test.polymorphism
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 9/01/2023
 * <p>
 * 面向对象特征之三：多态性 - 一个事物的多种形态。父类的引用指向子类的对象。
 */
public class PolymorphismTest {
    public static void main(String[] args) {
        Person p1 = new Woman();
        p1.eat();
        Person p2 = new Man();
        p2.eat();
        System.out.println("******************");
        Person p3 = new Person();
        p3.func(new Man());
    }
}
