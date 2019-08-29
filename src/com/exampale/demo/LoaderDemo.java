package com.exampale.demo;

/**
 * @author Ray.Ma
 * @date 2019/8/29 10:53
 */
public class LoaderDemo {
    public static void main(String[] args) {
        System.out.println(LoaderDemo.class.getClassLoader());

        System.out.println(LoaderDemo.class.getClassLoader().getParent());

        System.out.println(LoaderDemo.class.getClassLoader().getParent().getParent());
    }
}
