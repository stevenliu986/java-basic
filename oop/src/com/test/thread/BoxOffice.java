package com.test.thread;

/**
 * ClassName: BoxOffice
 * Package: com.test.thread
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 12/01/2023
 */
class BoxOffice extends Thread{
    private static int ticket = 100;

    @Override
    public void run() {
        while (true){
            if (ticket > 0){
                System.out.println(getName() + ": 卖票，票号为：" + ticket--);
            }
        }
    }
}
