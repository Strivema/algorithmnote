package com.exampale.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marie
 * @date 2020/3/27 9:27 PM
 **/
public class CreateTargetArray {
    /**
     * 给你两个整数数组 nums 和 index。你需要按照以下规则创建目标数组：
     * <p>
     * 目标数组 target 最初为空。
     * 按从左到右的顺序依次读取 nums[i] 和 index[i]，在 target 数组中的下标 index[i] 处插入值 nums[i] 。
     * 重复上一步，直到在 nums 和 index 中都没有要读取的元素。
     * 请你返回目标数组。
     *
     * @param nums
     * @param index
     * @return
     */
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            target[i] = list.get(i);
        }
        return target;
    }

}
