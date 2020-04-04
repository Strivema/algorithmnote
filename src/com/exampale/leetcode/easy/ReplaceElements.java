package com.exampale.leetcode.easy;

/**
 * @author Marie
 * @date 2020/4/4 12:45 AM
 **/
public class ReplaceElements {
    /**
     * 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
     * <p>
     * 完成所有替换操作后，请你返回这个数组。
     *
     * @param arr
     * @return
     */
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int[] res = new int[len];
        res[len - 1] = -1;
        for (int i = len - 2; i >= 0; i--) {
            res[i] = Math.max(res[i + 1], arr[i + 1]);
        }

        return res;
    }

}
