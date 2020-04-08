package com.exampale.leetcode.easy;

import java.util.Stack;

/**
 * @author Marie
 * @date 2020/4/8 10:40 PM
 **/
public class MergeTrees {
    /**
     * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
     * <p>
     * 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。
     * <p>
     * 方法一：递归
     *
     * @param t1
     * @param t2
     * @return
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);

        return t1;

    }

    /**
     * 方法二：
     *
     * @param t1
     * @param t2
     * @return
     */

    public TreeNode mergeTrees1(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        Stack<TreeNode[]> stack = new Stack<>();
        stack.push(new TreeNode[]{t1, t2});
        while (!stack.isEmpty()) {
            TreeNode temp[] = stack.pop();
            if (temp[0] == null || temp[1] == null) {
                continue;
            }
            temp[0].val += temp[1].val;
            if (temp[0].left == null) {
                temp[0].left = temp[1].left;
            } else {
                stack.push(new TreeNode[]{temp[0].left, temp[0].left});
            }
            if (temp[0].right == null) {
                temp[0].right = temp[1].right;
            } else {
                stack.push(new TreeNode[]{temp[0].right, temp[1].right});
            }
        }
        return t1;

    }


}
