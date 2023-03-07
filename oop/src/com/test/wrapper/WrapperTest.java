package com.test.wrapper;

import org.junit.Test;

/**
 * ClassName: WrapperTest
 * Package: com.test.wrapper
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 9/01/2023
 *
 *          String类，包装类与基本数据类型间的转换
 *
 */
public class WrapperTest {
    /**
     * 基本数据类型 => 包装类
     */
    @Test
    public void test1() {
        // 自动装箱
        Integer integer1 = 10;
        // 自动拆箱
        int num1 = integer1;
        System.out.println(integer1);
        System.out.println(num1);

        Float f1 = 12.3F;
    }

    /**
     * 基本数据类型,包装类 => String类
     */
    @Test
    public void test2() {
        int num1 = 10;
        String str1 = num1 + "";
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);
        System.out.println(str1);
        System.out.println(str2);
    }

    /**
     * String类 => 基本数据类型,包装类
     */
    @Test
    public void test3() {
        String str1 = "123";
        int num1 = Integer.parseInt(str1);
        double d1 = Double.parseDouble(str1);
        float f1 = Float.parseFloat(str1);
        System.out.println(num1);
        System.out.println(d1);
        System.out.println(f1);
    }

    @Test
    public void test4() {
        Object o1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(o1);
    }

    @Test
    public void test5() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);
    }
}
