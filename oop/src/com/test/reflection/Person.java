package com.test.reflection;

public class Person {
  private String name;
  public Integer age;

  public Person() {
  }

  public Person(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  private Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + age + "]";
  }

  public void show() {
    System.out.println("我是一个好人。");
  }

  private String showNationality(String nation) {
    System.out.println("我是一个" + nation + "人");
    return nation;
  }

  private Integer showAge(Integer age){
    System.out.println("我的年龄是" + age + "周岁。");
    return age;
  }
}
