package com.test.polymorphism;

/**
 * ClassName: Man
 * Package: com.test.polymorphism
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 9/01/2023
 */
public class Man extends Person {
    boolean isSmoking;

    public void makeMoney() {
        System.out.println("男人负责挣钱养家。");
    }

    @Override
    public void eat() {
        System.out.println("男人多吃肉，长肌肉。");
    }

    @Override
    public void walk() {
        System.out.println("男人霸气地走路。");
    }
}
