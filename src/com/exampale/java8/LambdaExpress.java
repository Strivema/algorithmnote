package com.exampale.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Ray.Ma
 * @date 2019/10/18 14:18
 */
public class LambdaExpress {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("peter", "anna", "mike", "xenia");

        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });


        Collections.sort(strings, (a, b) -> b.compareTo(a));

        strings.sort((a, b) -> b.compareTo(a));

        System.out.println(strings);
    }

    public void express() {

    }
}
