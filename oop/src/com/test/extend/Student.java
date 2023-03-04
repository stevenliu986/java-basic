package com.test.extend;

/**
 * ClassName: com.test.oop.Student
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 9/01/2023
 */
public class Student extends com.test.extend.Person {
    String major;
    int id;

    public Student() {
    }

    public Student(String major) {
        this.major = major;
    }

    public Student(String name, String major, int id) {
        super(name, id);
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生要吃有营养的食物。");
    }
}
