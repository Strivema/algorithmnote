package com.exampale.leetcode.easy;

/**
 * @author Marie
 * @date 2020/3/29 11:22 PM
 **/
public class MinTimeToVisitAllPoints {
    /**
     * 平面上有 n 个点，点的位置用整数坐标表示 points[i] = [xi, yi]。请你计算访问所有这些点需要的最小时间（以秒为单位）。
     * <p>
     * 你可以按照下面的规则在平面上移动：
     * <p>
     * 每一秒沿水平或者竖直方向移动一个单位长度，或者跨过对角线（可以看作在一秒内向水平和竖直方向各移动一个单位长度）。
     * 必须按照数组中出现的顺序来访问这些点
     * <p>
     * @param points
     * @return
     */
    public int minTimeToVisitAllPoints(int[][] points) {
        int res = 0;
        for (int i = 1; i < points.length; i++) {
            int resX = Math.abs(points[i][0] - points[i - 1][0]);
            int resY = Math.abs(points[i][1] - points[i - 1][1]);
            res += Math.max(resX, resY);

        }
        return res;
    }
}
