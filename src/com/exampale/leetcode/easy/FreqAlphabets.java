package com.exampale.leetcode.easy;

/**
 * @author Marie
 * @date 2020/4/15 11:28 PM
 **/
public class FreqAlphabets {
    /**
     * 给你一个字符串 s，它由数字（'0' - '9'）和 '#' 组成。我们希望按下述规则将 s 映射为一些小写英文字符：
     * <p>
     * 字符（'a' - 'i'）分别用（'1' - '9'）表示。
     * 字符（'j' - 'z'）分别用（'10#' - '26#'）表示。 
     * 返回映射之后形成的新字符串。
     *
     * @return
     */
    public String freqAlphabets(String s) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                res.append((char) ('a' + Integer.parseInt(s.substring(i, i + 2)) - 1));
                i += 2;

            } else {
                res.append((char) ('a' + Integer.parseInt(s.substring(i, i + 1)) - 1));

            }
        }

        return res.toString();
    }

}
