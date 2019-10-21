package com.exampale.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ray.Ma
 * @date 2019/10/18 17:04
 */
public class StreamExpress {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("ddd2");
        stringList.add("aaa2");
        stringList.add("bbb1");
        stringList.add("aaa1");
        stringList.add("bbb3");
        stringList.add("ccc");
        stringList.add("bbb2");
        stringList.add("ddd1");

        stringList.stream().filter(s -> s.startsWith("a")).forEach(System.out::println);




    }
}
