package com.exampale.leetcode.easy;

/**
 * @author Marie
 * @date 2020/4/8 12:11 AM
 **/
public class ToLowerCase {
    /**
     * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
     *
     * @param str
     * @return
     */
    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] += 'a' - 'A';
            }
        }
        return String.valueOf(chars);

    }

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(new ToLowerCase().toLowerCase(str));
    }

}
