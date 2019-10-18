package com.exampale.design;

/**
 * @author Ray.Ma
 * @date 2019/10/18 13:44
 */
public class MinNumber {
    private static <T extends Number & Comparable<? super T>> T min(T[] values) {
        if (values == null || values.length == 0) return null;
        T min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (min.compareTo(values[i]) > 0) min = values[i];
        }
        return min;
    }
}
