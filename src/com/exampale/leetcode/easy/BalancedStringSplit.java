package com.exampale.leetcode.easy;

/**
 * @author Marie
 * @date 2020/3/31 10:40 PM
 **/
public class BalancedStringSplit {
    /**
     * 在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
     * <p>
     * 给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
     * <p>
     * 返回可以通过分割得到的平衡字符串的最大数量。
     * <p>
     *
     * @param s
     * @return
     */

    public int balancedStringSplit(String s) {
        int res = 0;
        int cout = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'L')
                cout++;
            if (chars[i] == 'R')
                cout--;
            if (cout == 0) {
                res++;
            }
        }
        return res;
    }

}
