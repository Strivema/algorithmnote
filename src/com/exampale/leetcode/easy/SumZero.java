package com.exampale.leetcode.easy;

/**
 * @author Marie
 * @date 2020/4/8 11:13 PM
 **/
public class SumZero {
    /**
     * @param n
     * @return
     */
    public int[] sumZero(int n) {
        int res[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            res[i] = i;
            sum += i;
        }
        res[n - 1] = -sum;
        return res;
    }

}
