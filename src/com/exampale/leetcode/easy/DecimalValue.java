package com.exampale.leetcode.easy;

/**
 * @author Marie
 * @date 2020/3/28 9:47 PM
 **/
public class DecimalValue {
    public int getDecimalValue(ListNode head) {
        ListNode cur = head;
        int res = 0;
        while (cur != null) {
            res <<= 1;
            res += cur.val;
            cur = cur.next;
        }
        return res;
    }

}
