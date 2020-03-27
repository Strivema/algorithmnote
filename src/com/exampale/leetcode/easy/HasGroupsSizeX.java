package com.exampale.leetcode.easy;

import java.util.Arrays;

/**
 * @author Marie
 * @date 2020/3/27 9:40 PM
 **/
public class HasGroupsSizeX {


    public boolean hasGroupsSizeX(int[] deck) {
        int[] res = new int[10000];
        for (int num : deck) {
            res[num]++;
        }
        return Arrays.stream(res).reduce(this::gcd).getAsInt() > 1;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }


}
