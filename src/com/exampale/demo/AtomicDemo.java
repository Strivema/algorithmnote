package com.exampale.demo;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Ray.Ma
 * @date 2019/8/23 15:19
 */
public class AtomicDemo {
    public static void main(String[] args) {
        int i = new AtomicInteger(1).get();
        int temp = 0;
        AtomicInteger atomicInteger = new AtomicInteger(0);

        temp = atomicInteger.getAndSet(3);
        System.out.println(atomicInteger);
        temp = atomicInteger.getAndIncrement();
        System.out.println(atomicInteger);
        temp = atomicInteger.getAndAdd(3);
        System.out.println(i);
        System.out.println(atomicInteger);
    }
}
