package com.exampale.demo;

/**
 * @author Ray.Ma
 * @date 2019/10/16 15:53
 */
public class StaticDemo {
    public static void main(String[] args) {

    }

    public static void fuc1() {
        new StaticDemo().fuc2();
        System.out.println();
    }

    public void fuc2() {
        fuc1();
    }

    public void fun3() {
        fuc2();
    }


}
