package com.exampale.leetcode.easy;

/**
 * @author Marie
 * @date 2020/3/22 9:49 PM
 **/
public class NumOfSteps {
    /**
     * 给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。
     * 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1
     * @param num
     * @return
     */
    public int numberOfSteps(int num) {
        int res = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num >> 1;
            } else {
                num = num - 1;
            }
            res++;
        }
        return res;
    }

}
