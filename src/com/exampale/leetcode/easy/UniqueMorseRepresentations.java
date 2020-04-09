package com.exampale.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Marie
 * @date 2020/4/9 11:45 PM
 **/
public class UniqueMorseRepresentations {
    /**
     * 国际摩尔斯密码定义一种标准编码方式，
     * 将每个字母对应于一个由一系列点和短线组成的字符串， 比如: "a" 对应 ".-", "b" 对应 "-...", "c" 对应 "-.-.", 等等。
     *
     * @param words
     * @return
     */

    public int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.",
                "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--.."};

        Set<String> res = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(MORSE[c - 'a']);
            }
            res.add(sb.toString());
        }
        return res.size();
    }

}
