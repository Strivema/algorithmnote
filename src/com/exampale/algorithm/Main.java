package com.exampale.algorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Marie
 * @date 2019/11/9 3:37 AM
 **/
public class Main {


    public static int process() {
        int[] arr = new int[10];
        int[] temp = new int[10];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arr[i] = scan.nextInt();
            temp[i] = Math.abs(arr[i]);
        }

        int i, m = 0,  max = temp[0];
        for (i = 1; i < temp.length; i++) {
            if (temp[i] > max) {
                max = temp[i];
                m = i;
            }


        }
        int y = arr[m];
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MIN_VALUE;
        for (int value : temp) {
            if (value < min1) {
                min2 = min1;
                min1 = value;
            } else if (value < min2 && value != min1) {
                min2 = value;
            }

        }

        int x = min1;
        int z = min2;


        return x * x + x * y - y * y + z;

    }

    public static void main(String[] args) {
        System.out.println(process());

    }

}
