package com.test.templateTest;

/**
 * ClassName: TemplateTest
 * Package: com.test.templateTest
 * Description: 模板方法设计模式
 *
 * @Author: Steven_LIU
 * @Create: 10/01/2023
 */
public class TemplateTest {
    public static void main(String[] args) {
        SubTemplate s = new SubTemplate();
        s.spendTime();
    }
}
abstract class Template {
    public void spendTime(){
        long start = System.currentTimeMillis();
        this.code();
        long finish = System.currentTimeMillis();
        System.out.println("time is " + (finish - start) + " seconds.");
    }

    abstract void code();
}

class SubTemplate extends Template {
    int result;
    @Override
    void code() {
        for (long i = 0; i < 100000000000L; i++){
            result += i;
        }
    }
}
