package com.test.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectionTest {

  // 反射前， 对于Person类的操作
  @Test
  public void test01() {
    // 1. 创建Person类的对象
    Person person1 = new Person("张三", 25);

    person1.age = 20;
    System.out.println(person1.toString());
  }

  // 反射后，对于Person类的操作
  @Test
  public void test02() throws Exception {
    Class clazz = Person.class;

    // 通过反射创建Person类的对象
    Constructor cons = clazz.getConstructor(String.class, Integer.class);
    Object obj = cons.newInstance("Tom", 15);
    Person person01 = (Person) obj; 
    System.out.println(person01.toString());

    // 通过反射调用对象的方法和属性
    Field age = clazz.getDeclaredField("age");
    age.set(person01, 31);
    System.out.println(person01.toString());
    
    // 调用方法
    Method show = clazz.getDeclaredMethod("show");
    show.invoke(person01);

    System.out.println("************************");

    // 通过反射，可以调用Person类的私有结构，比如：私有构造器，方法，属性等

    // 调用Person类的私有构造器
    Constructor cons1 = clazz.getDeclaredConstructor(String.class);
    cons1.setAccessible(true);
    Person person02 = (Person) cons1.newInstance("Jerry");
    System.out.println(person02);


    // 调用Person类的私有属性
    Field name = clazz.getDeclaredField("name");
    name.setAccessible(true);
    name.set(person01, "想听你");

    // 调用Person类的私有方法
    Method showAge = clazz.getDeclaredMethod("showAge", Integer.class);
    showAge.setAccessible(true);
    showAge.invoke(person02, 45);
  }

  /**
   * 获取Class的实例的方式
   */
  @Test
  public void test03() throws ClassNotFoundException {
    // 方式一：调用运行时类的属性 - .class
    Class<Person> clazz01 = Person.class;
    System.out.println(clazz01);

    // 方式二：调用运行时类的对象，调用getClass()
    Person person01 = new Person();
    Class clazz02 = person01.getClass();
    System.out.println(clazz02);

    // 方式三：调用Class的静态方法 - forName(String classPath)
    Class clazz03 = Class.forName("com.test.reflection.Person");
    System.out.println(clazz03);

    // 方式四：使用类的加载器 - ClassLoader
    ClassLoader classLoader = ReflectionTest.class.getClassLoader();
    Class clazz04 = classLoader.loadClass("com.test.reflection.Person");
    System.out.println(clazz04);
  }
}
