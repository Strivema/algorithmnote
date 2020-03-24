package com.exampale.leetcode.easy;

/**
 * @author Marie
 * @date 2020/3/24 9:36 PM
 **/
public class SubtractProductAndSum {
    /**
     * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
     *
     * @param n
     * @return
     */

    public int subtractProductAndSum(int n) {
        int mul = 1;
        int add = 0;
        while (n != 0) {
            int digit = n % 10;
            n = n / 10;
            mul = mul * digit;
            add = add + digit;
        }
        return mul - add;
    }

}
