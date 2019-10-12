package com.exampale.algorithm;

import java.util.Arrays;
import java.util.Random;

/**
 * 打乱数组
 * 洗牌算法
 * 1）将第1个元素与n个元素中的任意一个交换(包括自己)。这时结果中第1个元素已经确定。
 * 2）将第2个元素与n-1个元素中作任意一个交换(包括自己)。
 * 3）重复上面步骤，直到剩1个元素为止。
 *
 * @author Ray.Ma
 * @date 2019/10/12 15:47
 */
public class ShuffleArray {

    private Random ran = new Random();

    private int[] copy;
    private int num;
    private int[] ori;

    public ShuffleArray(int[] nums) {
        ori = nums;
        num = ori.length;
        copy = Arrays.copyOf(ori, num);

    }


    public int[] reset() {
        return ori;
    }


    public int[] shuffle() {
        int n = num;
        while (n > 1) {
            n--;
            int k = ran.nextInt(n + 1);
            int value = copy[k];
            copy[k] = copy[n];
            copy[n] = value;

        }
        return copy;
    }
}
