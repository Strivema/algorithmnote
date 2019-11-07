package com.exampale.algorithm;

/**
 * @author Marie
 * @date 2019/11/6 7:21 PM
 **/
public class ListAlgorithm {

    public static class ReverseList {
        public static ListNode reveseList(ListNode head) {
            ListNode pre = null;
            ListNode next = null;
            while (head != null) {
                next = head.next;
                head.next = pre;
                pre = next;
                head = next;
            }
            return pre;

        }
    }

    public static class FindKthTo {
        public ListNode findKth(ListNode head, int k) {
            if (head == null || k <= 0)
                return null;
            ListNode n1 = head, n2 = head;

            int count = 0;
            int index = k;
            while (n1 != null) {
                n1 = n1.next;
                count++;
                if (k < 1) {
                    n2 = n2.next;
                }
                k--;
            }

            if (count < index)
                return null;
            return n2;

        }
    }

    public static class RemoveNthNode {
        public static ListNode removeNth(ListNode head, int n) {
            ListNode pre = head;
            ListNode cur = head;
            for (int i = 0; i < n; i++) {
                pre = pre.next;
            }
            if (pre == null) {
                return head.next;
            }

            while (pre.next != null) {
                pre = pre.next;
                cur = cur.next;
            }
            cur.next = cur.next.next;
            return head;

        }
    }

    public static class MergeList {
        public static ListNode merge(ListNode n1, ListNode n2) {
            if (n1 == null)
                return n2;
            if (n2 == null)
                return n1;
            if (n1.val <= n2.val) {
                n1.next = merge(n1.next, n2);
                return n1;
            } else {
                n2.next = merge(n1, n2.next);
                return n2;
            }

        }
    }

}
