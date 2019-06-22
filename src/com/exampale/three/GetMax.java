package com.exampale.three;
import java.util.Scanner;

/**
 * @author Ray.Ma
 * @date 2019/6/20 19:39
 */
public class GetMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num  = scan.nextInt();
        int nums[] = new int[num];
        for (int i=0;i<num;i++){
            nums[i] = scan.nextInt();
        }
        int max = getMax(nums);
        System.out.println(max);
    }

    public static int getMax(int[] nums) {
        int maxNum = -1;
        if (nums != null && nums.length > 0) {
            int len = nums.length;
            for (int i = 0; i < len; i++) {
                maxNum = maxNum < nums[i] ? nums[i] : maxNum;
            }
        }
        return maxNum;
    }
}
