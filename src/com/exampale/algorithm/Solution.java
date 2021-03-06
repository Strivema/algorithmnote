package com.exampale.algorithm;

/**
 * @author Ray.Ma
 * @date 2019/10/18 14:44
 */
public class Solution {
    double dp[][][];

    /**
     * @param N  NxN 的国际象棋棋盘,最左上角的格子记为 (0, 0)，最右下角的记为 (N-1, N-1)
     * @param K K次移动
     * @param r 初始位 r
     * @param c 初始位c
     * @return {@link double}
     * @description
     * @author Ray.Ma
     * @date 2019/10/18 15:07
     */
    public double res(int N, int K, int r, int c) {
        if (K == 0) return 1.0d;
        dp = new double[N][N][K + 1];
        return dfs(N, K, r, c);
    }

    public double dfs(int N, int K, int r, int c) {
        if (dp[r][c][K] - 0.0d > 0.000001d) return dp[r][c][K];
        if (K == 1) return Kis(N, r, c);
        else {
            double res = 0.0d;
            if (r + 2 < N && c + 1 < N) res = res + dfs(N, K - 1, r + 2, c + 1);
            if (r + 2 < N && c - 1 >= 0) res = res + dfs(N, K - 1, r + 2, c - 1);
            if (r - 2 >= 0 && c + 1 < N) res = res + dfs(N, K - 1, r - 2, c + 1);
            if (r - 2 >= 0 && c - 1 >= 0) res = res + dfs(N, K - 1, r - 2, c - 1);
            if (c + 2 < N && r + 1 < N) res = res + dfs(N, K - 1, r + 1, c + 2);
            if (c + 2 < N && r - 1 >= 0) res = res + dfs(N, K - 1, r - 1, c + 2);
            if (c - 2 >= 0 && r + 1 < N) res = res + dfs(N, K - 1, r + 1, c - 2);
            if (c - 2 >= 0 && r - 1 >= 0) res = res + dfs(N, K - 1, r - 1, c - 2);
            return dp[r][c][K] = res / 8.0d;
        }
    }

    /**
     * 走一步时落在界内的概率
     *
     * @param N
     * @param r
     * @param c
     * @return {@link double}
     * @description
     * @author Ray.Ma
     * @date 2019/10/18 15:07
     */
    private double Kis(int N, int r, int c) {
        int count = 0;
        count = getCount(N, c, r, count);
        count = getCount(N, r, c, count);
        return ((double) count) / 8.0d;

    }


    private int getCount(int N, int r, int c, int count) {
        if (c + 2 < N && r + 1 < N) count++;
        if (c + 2 < N && r - 1 >= 0) count++;
        if (c - 2 >= 0 && r + 1 < N) count++;
        if (c - 2 >= 0 && r - 1 >= 0) count++;
        return count;
    }

}
