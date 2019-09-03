package com.exampale.sort;

import static com.exampale.sort.QuickSort.swap;

/**
 * @author Ray.Ma
 * @date 2019/9/2 17:09
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for (int e = arr.length - 1; e > 0; e--) {
            for (int i = 0; i < e; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }
}
