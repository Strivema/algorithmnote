package com.exampale.sort;

/**
 * @author Ray.Ma
 * @date 2019/9/2 16:04
 */
public class QuickSort {
    public static void quickSort(int arr[], int l, int r) {
        if (l < r) {
            swap(arr, l + (int) (Math.random() * (r - l + 1)), r);
            int[] p = partition(arr, l, r);
            quickSort(arr, l, p[0] - 1);
            quickSort(arr, p[1] + 1, r);
        }

    }

    public static int[] partition(int arr[], int l, int r) {
        int less = l - 1;
        int more = r;
        while (l < more) {
            if (arr[l] < arr[r]) {
                swap(arr, ++less, l++);
            } else if (arr[l] > arr[r]) {
                swap(arr, --more, l);
            } else {
                l++;
            }
        }
        swap(arr, more, r);
        return new int[]{less + 1, more};
    }

    public static void swap(int[] arr, int m, int n) {
        arr[m] ^= arr[n];
        arr[n] ^= arr[m];
        arr[m] ^= arr[n];
    }

    public static void main(String[] args) {
        int arr[] = {1, 2};
        swap(arr, 0, 1);
        System.out.println(arr[0] + "  " + arr[1]);
    }

}
