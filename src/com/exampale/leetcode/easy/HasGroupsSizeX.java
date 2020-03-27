package com.exampale.leetcode.easy;

import java.util.Arrays;

/**
 * @author Marie
 * @date 2020/3/27 9:40 PM
 **/
public class HasGroupsSizeX {


    /**
     * 给定一副牌，每张牌上都写着一个整数。
     * <p>
     * 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
     * <p>
     * 每组都有 X 张牌。
     * 组内所有的牌上都写着相同的整数。
     * 仅当你可选的 X >= 2 时返回 true。
     * <p>
     *
     * @param deck
     * @return
     */
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
