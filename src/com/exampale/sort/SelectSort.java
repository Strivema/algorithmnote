package com.exampale.sort;

/**
 * @author Ray.Ma
 * @date 2019/9/2 16:59
 */
public class SelectSort {
    public static void selecSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            QuickSort.swap(arr, i, minIndex);
        }
    }
}
