package com.exampale.leetcode.easy;

/**
 * @author Marie
 * @date 2020/4/17 11:40 PM
 **/
public class HeightChecker {
    /**
     * 学校在拍年度纪念照时，一般要求学生按照 非递减 的高度顺序排列。
     * <p>
     * 请你返回能让所有学生以 非递减 高度排列的最小必要移动人数。
     *
     * @param heights
     * @return
     */
    public int heightChecker(int[] heights) {
        int[] ans = new int[101];
        for (int heigh : heights) {
            ans[heigh]++;
        }
        int res = 0;
        for (int i = 1, j = 0; i < ans.length; i++) {
            while (ans[i]-- != 0) {
                if (heights[j++] != i)
                    res++;
            }
        }
        return res;

    }

}
