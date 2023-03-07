package com.test.polymorphism;

/**
 * ClassName: Person
 * Package: com.test.polymorphism
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 9/01/2023
 */
public class Person {
    String name;
    int age;

    public void eat() {
        System.out.println("人：吃饭");
    }

    public void walk() {
        System.out.println("人：走路");
    }

    public void func(Person person) {
        person.eat();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }
}
