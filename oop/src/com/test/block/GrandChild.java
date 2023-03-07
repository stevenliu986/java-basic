package com.test.block;

/**
 * ClassName: GrandChild
 * Package: com.test.block
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 10/01/2023
 */
public class GrandChild extends Son1 {
    static {
        System.out.println("777777777777");
    }
    {
        System.out.println("888888888888888");
    }

    public GrandChild() {
        System.out.println("9999999999999");
    }

    public static void main(String[] args) {
        new GrandChild();
        // new Son1();
        // new Father1();
    }
}

class Father1 {
    static {
        System.out.println("111111111111");
    }
    {
        System.out.println("2222222222222");
    }

    public Father1() {
        System.out.println("33333333333333333");
    }
}

class Son1 extends Father1 {
    static {
        System.out.println("444444444444444444");
    }
    {
        System.out.println("5555555555555555");
    }

    public Son1() {
        System.out.println("66666666666666666");
    }
}
