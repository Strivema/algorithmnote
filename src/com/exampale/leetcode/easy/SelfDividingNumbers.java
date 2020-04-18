package com.exampale.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marie
 * @date 2020/4/18 11:20 PM
 **/
public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int n = left; n <= right; n++) {
            if (selfDividing(n)) {
                res.add(n);
            }
        }
        return res;
    }

    public boolean selfDividing(int n) {
        int temp = n;
        while (temp > 0) {
            int div = temp % 10;
            temp = temp / 10;
            if (div == 0 || (n % div) != 0)
                return false;
        }
        return true;
    }

}
