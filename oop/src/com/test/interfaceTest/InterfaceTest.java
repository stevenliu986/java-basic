package com.test.interfaceTest;

/**
 * ClassName: InterfaceTest
 * Package: com.test.interfaceTest
 * Description: 接口的使用
 *  1. 接口使用interface来定义
 *  2. 接口和类是并列的两个结构
 *  3. 如何定义接口，定义接口中的成员：
 *      3.1 JDK7及以前只能定义全局常量和抽象方法
 *      3.2 JDK8：坠子定义全局常量和抽象方法外，还可以定义静态方法等。
 *  4. 接口中不能定义构造器。
 *  5. Java类可实现多个接口： class A extends B implements C, D, E
 *  6. 接口可以多继承：interface A extends B, C
 *
 * @Author: Steven_LIU
 * @Create: 10/01/2023
 */
public class InterfaceTest {
}

interface Flyable{
    // 全局常量
    int MAX_SPEED = 7900;
    int MIN_SPEED = 1;

    /**
     * 抽象方法
     */
    void fly();
    void stop();
}

class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("飞机飞得好快啊！");
    }

    @Override
    public void stop() {
        System.out.println("飞机降落了。");
    }
}


