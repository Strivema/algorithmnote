package com.exampale.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Ray.Ma
 * @date 2019/10/18 13:33
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if ("2".equals(item)) {
                iterator.remove();
            }
        }

        // 这样写有问题：会抛出concurrentModificationException
//        fail-fast 机制
        for (String item : list) {
            if ("2".equals(item)) {
                list.remove(item);
            }
        }
        System.out.println(list);

    }
}
