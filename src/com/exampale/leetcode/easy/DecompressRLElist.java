package com.exampale.leetcode.easy;

/**
 * @author Marie
 * @date 2020/3/26 9:59 PM
 **/
public class DecompressRLElist {
    /**
     * 给你一个以行程长度编码压缩的整数列表 nums 。
     * <p>
     * 考虑每对相邻的两个元素 freq, val] = [nums[2*i], nums[2*i+1]] （其中 i >= 0 ），
     * 每一对都表示解压后子列表中有 freq 个值为 val 的元素，你需要从左到右连接所有子列表以生成解压后的列表。
     *
     * @param nums
     * @return
     */
    public int[] decompressRLElist(int[] nums) {

        int resLen = 0;
        for (int i = 0; i < nums.length; i += 2) {
            resLen += nums[i];
        }
        int[] res = new int[resLen];
        int index = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int temp = nums[i];
            while (temp != 0) {
                res[index] = nums[i + 1];
                temp--;
                index++;
            }
        }

        return res;
    }

    public int[] decompressRLElist2(int[] nums) {

        int resLen = 0;
        for (int i = 0; i < nums.length; i += 2) {
            resLen += nums[i];
        }
        int[] res = new int[resLen];
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if ((i & 1) == 1) {
                int temp = nums[i - 1];
                while (temp != 0) {
                    res[index] = nums[i];
                    temp--;
                    index++;
                }

            }
        }

        return res;
    }

}
