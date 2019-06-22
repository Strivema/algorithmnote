package com.exampale.three;

import java.util.Scanner;

/**
 * @author Ray.Ma
 * @date 2019/6/22 15:34
 */
public class DFS {

    static int n, value, maxvalue = 0;
    static int weight[] = new int[100];
    static int c[] = new int[100];

    public static void Dfs(int index, int sumW, int sumC) {
        if (n == index) {
            if (sumW <= value && sumC > maxvalue) {
                maxvalue = sumC;
            }
            return;
        }
        Dfs(index + 1, sumW, sumC);
        Dfs(index + 1, sumW + weight[index], sumC + c[index]);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        value = scan.nextInt();
        for (int i = 0; i < n; i++) {
            weight[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = scan.nextInt();
        }
        Dfs(0, 0, 0);
        System.out.println(maxvalue);
    }

    public static void DFSOptimize(int index, int sumw, int sumc) {
        if (index == n) {
            return;
        }
        DFSOptimize(index + 1, sumw, sumc);
        if (sumw + weight[index] <= value) {
            if (sumc + c[index] > maxvalue) {
                maxvalue = sumc + c[index];
            }
        }
        DFSOptimize(index + 1, sumw + weight[index], sumc + c[index]);
    }
}
