package com.exampale.leetcode.easy;

/**
 * @author Marie
 * @date 2020/4/16 10:59 PM
 **/
public class SortString {
    /**
     * 从 s 中选出 最小 的字符，将它 接在 结果字符串的后面。
     * 从 s 剩余字符中选出 最小 的字符，且该字符比上一个添加的字符大，将它 接在 结果字符串后面。
     * 重复步骤 2 ，直到你没法从 s 中选择字符。
     * 从 s 中选出 最大 的字符，将它 接在 结果字符串的后面。
     * 从 s 剩余字符中选出 最大 的字符，且该字符比上一个添加的字符小，将它 接在 结果字符串后面。
     * 重复步骤 5 ，直到你没法从 s 中选择字符。
     * 重复步骤 1 到 6 ，直到 s 中所有字符都已经被选过
     *
     * @param s
     * @return
     */
    public String sortString(String s) {
        int[] count = new int[100];
        for (char chars : s.toCharArray()) {
            count[chars - 'a']++;
        }
        StringBuilder res = new StringBuilder();
        while (res.length() != s.length()) {
            for (int i = 0; i < count.length; i++) {
                if (count[i] == 0) {
                    continue;
                }
                res.append((char) (i + 'a'));
                count[i]--;
            }
            for (int i = count.length - 1; i >= 0; i--) {
                if (count[i] == 0) {
                    continue;
                }
                res.append((char) (i + 'a'));
                count[i]--;
            }
        }
        return res.toString();
    }

}
