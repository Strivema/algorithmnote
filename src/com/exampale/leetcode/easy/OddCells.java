package com.exampale.leetcode.easy;

/**
 * @author Marie
 * @date 2020/4/4 8:51 PM
 **/
public class OddCells {
    public int oddCells(int n, int m, int[][] indices) {
        int[] row = new int[n];
        int[] col = new int[m];
        int res = 0;
        for (int i = 0; i < indices.length; i++) {
            row[indices[i][0]]++;
            col[indices[i][1]]++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (((row[i] + col[j]) & 1) == 1)
                    res++;
            }
        }
        return res;

    }

}
