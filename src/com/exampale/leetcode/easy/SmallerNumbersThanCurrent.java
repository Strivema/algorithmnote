package com.exampale.leetcode.easy;

/**
 * @author Marie
 * @date 2020/3/23 10:39 PM
 **/
public class SmallerNumbersThanCurrent {

    /**
     * 给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。
     *
     * 换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。
     *
     * 以数组形式返回答案。
     *
     */

    /**
     * 暴力法
     *
     * @param nums
     * @return
     */

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int len = nums.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] > nums[j])
                    res[i]++;
            }
        }
        return res;
    }

    /**
     * 计数排序思路
     *
     * @param nums
     * @return
     */
    public int[] smallerNumbersThanCurrent2(int[] nums) {
        int[] ans = new int[101];
        for (int num : nums) {
            ans[num]++;
        }
        for (int i = 1; i < ans.length; i++) {
            ans[i] = ans[i] + ans[i - 1];
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            if (nums[i] > 0) {
                res[i] = ans[nums[i] - 1];
            }
        }
        return res;

    }


}
