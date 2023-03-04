package com.test.abstractTest;

/**
 * ClassName: AbstractTest
 * Package: com.test.abstractTest
 * Description: abstract关键字的使用
 * 可以用来修饰类和方法，
 * abstract修饰类：抽象类
 * 这个类就不能进行实例化了，抽象类中一定有构造器，便于子类实例化时调用。
 * 开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作。
 * <p>
 * abstract修饰方法：抽象方法
 *  抽象方法只有方法的声明而没有方法体。
 * <p>
 *  abstract使用上的注意点：不能修饰属性、构造器、私有方法、静态方法、
 *      final修饰的方法/类
 *
 * @Author: Steven_LIU
 * @Create: 10/01/2023
 */
public class AbstractTest {
    public static void main(String[] args) {
        method(new Person() {
            @Override
            public void eat() {
                System.out.println("匿名子类的匿名对象 - 吃饭！");
            }

            @Override
            public void walk() {
                System.out.println("匿名子类的匿名对象 - 走路！");
            }
        });
    }

    public static void method(Person person){
        person.eat();
        person.walk();
    }
}

abstract class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 抽象方法
     */
    public abstract void eat();

    /**
     * 抽象方法
     */
    public abstract void walk();
}

class Student extends Person{
    @Override
    public void eat() {
        System.out.println("学生要吃有营养的食物");
    }

    @Override
    public void walk() {
        System.out.println("学生要多锻炼身体");
    }
}
