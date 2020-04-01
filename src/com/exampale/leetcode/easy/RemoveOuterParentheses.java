package com.exampale.leetcode.easy;

import java.util.Stack;

/**
 * @author Marie
 * @date 2020/4/1 11:08 PM
 **/
public class RemoveOuterParentheses {
    /**
     * 有效括号字符串为空 ("")、"(" + A + ")" 或 A + B，其中 A 和 B 都是有效的括号字符串
     * ，+ 代表字符串的连接。例如，""，"()"，"(())()" 和 "(()(()))" 都是有效的括号字符串。
     *
     * @param S
     * @return
     */
    public String removeOuterParentheses(String S) {
        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int start = 0;
        int end = 0;
        boolean flag = false;
        char ch;
        for (int i = 0; i < S.length(); i++) {
            ch = S.charAt(i);
            if (ch == '(') {
                stack.push(ch);
                if (!flag) {
                    start = i;
                    flag = true;
                }

            }
            if (ch == ')') {
                stack.pop();
                if (stack.isEmpty()) {
                    end = i;
                    res.append(S.substring(start + 1, end));
                    flag = false;
                    start = end;
                }
            }
        }
        return res.toString();

    }

    /**
     * 方法二：计数法
     * @param S
     * @return
     */

    public String removeOuterParentheses1(String S) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        for (Character c : S.toCharArray()) {
            if (c == ')') count--;
            if (count > 0) res.append(c);
            if (c == '(') count++;
        }
        return res.toString();

    }

}
