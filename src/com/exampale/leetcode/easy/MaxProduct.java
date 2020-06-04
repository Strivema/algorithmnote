package com.exampale.leetcode.easy;

/**
 * @author Marie
 * @date 2020/6/4 11:45 PM
 **/
public class MaxProduct {
    /**
     * 给你一个整数数组 nums，请你选择数组的两个不同下标 i 和 j，使 (nums[i]-1)*(nums[j]-1) 取得最大值。
     * <p>
     * 请你计算并返回该式的最大值
     *
     * @param nums
     * @return
     */
    public int maxProduct(int[] nums) {
        int i = 0;
        int j = 0;
        for (int num : nums) {
            if (num > i) {
                j = i;
                i = num;
            } else if (num > j) {
                j = num;
            }
        }
        return (i - 1) * (j - 1);
    }

}
