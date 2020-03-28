package com.exampale.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Marie
 * @date 2020/3/28 9:33 PM
 **/
public class NumJewelsInStones {
    /**
     * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 
     * S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
     * <p>
     * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
     *
     * @param J
     * @param S
     * @return
     */
    public int numJewelsInStones(String J, String S) {
        int res = 0;
        Set<Character> set = new HashSet<>();
        for (char charJ : J.toCharArray()) {
            set.add(charJ);
        }
        for (char charS : S.toCharArray()) {
            if (set.contains(charS)) {
                res++;
            }
        }
        return res;

    }

}
