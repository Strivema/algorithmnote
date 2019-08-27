package com.exampale.demo;

/**
 * @author Ray.Ma
 * @date 2019/8/23 15:43
 */
public class SynchronizedDemo {
    public static void main(String[] args) {
        new SynchronizedDemo().method();

        new Thread();

        new ThreadLocal<>();
    }

    public void method() {
        synchronized (this) {
            System.out.println("this is a test synchronized");
        }
    }
}
