package com.exampale.sort;
import static com.exampale.sort.QuickSort.swap;

/**
 * @author Ray.Ma
 * @date 2019/9/2 17:05
 */
public class InsertSort {
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }
}
