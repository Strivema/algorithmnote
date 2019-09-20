package com.exampale.three;

import java.util.Scanner;

/**
 * @author Ray.Ma
 * @date 2019/6/22 11:30
 */
public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(binarySearch(nums, 6));
    }

    public static int binarySearch(int nums[], int key) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
//            int mid = (left + right) / 2;
//            int mid = (left + right) >> 1;
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == key) {
                return mid;
            } else if (nums[mid] < key) {
                left = mid + 1;
            } else if (nums[mid] > key) {
                right = mid - 1;
            }
        }
        return -1;
    }
}
