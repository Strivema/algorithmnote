package com.exampale.leetcode.easy;

/**
 * @author Marie
 * @date 2019/10/28 9:34 PM
 **/
public class GuessNumber {
    private static final int NUM = 3;

    public int game(int[] guess, int[] answer) {
        int res = 0;
        for (int i = 0; i < NUM; i++) {
            if (guess[i] == answer[i]) {
                res++;
            }
        }
        return res;
    }

}
