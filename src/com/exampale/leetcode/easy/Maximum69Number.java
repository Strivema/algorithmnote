package com.exampale.leetcode.easy;

/**
 * @author Marie
 * @date 2020/4/7 11:49 PM
 **/
public class Maximum69Number {
    /**
     * 给你一个仅由数字 6 和 9 组成的正整数 num。
     * <p>
     * 你最多只能翻转一位数字，将 6 变成 9，或者把 9 变成 6 。
     * <p>
     * 请返回你可以得到的最大数字。
     *
     * @param num
     * @return
     */
    public int maximum69Number(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '6') {
                chars[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(chars));

    }

}
