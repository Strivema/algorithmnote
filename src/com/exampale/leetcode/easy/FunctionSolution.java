package com.exampale.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marie
 * @date 2019/10/28 9:53 PM
 **/
public class FunctionSolution {

    private static final int NUM = 1000;

    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0, j = NUM; i < NUM; ) {
            if (customfunction.f(i, j) == z) {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                temp.add(j);
                res.add(temp);
                i++;
            } else {
                if (j == 1) {
                    i++;
                    j = NUM;
                } else {
                    j--;
                }
            }

        }

        return res;
    }

}


