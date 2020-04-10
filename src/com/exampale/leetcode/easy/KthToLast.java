package com.exampale.leetcode.easy;

/**
 * @author Marie
 * @date 2020/4/10 11:51 PM
 **/
public class KthToLast {
    /**
     * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
     *
     * @param head
     * @param k
     * @return
     */
    public int kthToLast(ListNode head, int k) {

        ListNode p = head, q = head;
        for (int i = 0; i < k - 1; i++) {
            p = p.next;
        }
        while (p.next != null) {
            q = q.next;
            p = p.next;
        }
        return q.val;

    }

}
