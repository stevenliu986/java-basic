package com.test.block;

/**
 * ClassName: BlockTest
 * Package: com.test.block
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 10/01/2023
 */
class Father{
    static {
        System.out.println("111111111111");
    }

    {
        System.out.println("222222222222");
    }
    public Father(){
        System.out.println("3333333333333");
    }
}

public class Son extends Father {
    static {
        System.out.println("4444444444444");
    }
    {
        System.out.println("5555555555555");
    }
    public Son(){
        System.out.println("6666666666666");
    }

    public static void main(String[] args) {
        // System.out.println("777777777777777");
        // System.out.println("***************");
        // new Son();
        // System.out.println("***************");
        // new Son();
        // System.out.println("***************");
        new Father();
    }
}
