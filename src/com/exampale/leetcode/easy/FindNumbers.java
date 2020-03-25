package com.exampale.leetcode.easy;

/**
 * @author Marie
 * @date 2020/3/25 10:46 PM
 **/
public class FindNumbers {
    /**
     * 给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。
     *
     * @param nums
     * @return 枚举，字符串
     */
    public int findNumbers1(int[] nums) {
        int res = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                res++;
            }
        }
        return res;

    }

    /**
     * @param nums
     * @return 枚举，log10
     */
    public int findNumbers2(int[] nums) {
        int res = 0;
        for (int num : nums) {
            if ((int) (Math.log10(num) + 1) % 2 == 0) {
                res++;
            }
        }
        return res;

    }

    public int findNumbers3(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] < 100 && nums[i] >= 10) || (nums[i] >= 1000 && nums[i] < 10000)) {
                res++;
            }
        }
        return res;
    }

    public int findNumbers4(int[] nums) {
        int res = 0;
        int digit = 1;
        for (int num : nums) {
            int temp = num;
            while (temp >= 10) {
                temp /= 10;
                digit++;
            }
            if (digit % 2 == 0) {
                res++;
            }
        }
        return res;
    }

}
