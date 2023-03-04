package com.test.extend;

/**
 * ClassName: com.test.oop.Person
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 9/01/2023
 */
public class Person {
    String name;
    int id;

    public Person() {
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void eat(){
        System.out.println("吃饭。");
    }
}
