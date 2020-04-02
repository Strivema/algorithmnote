package com.exampale.leetcode.easy;

/**
 * @author Marie
 * @date 2020/4/2 1:47 PM
 **/
public class RangeSumBST {
    /**
     * 给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
     * <p>
     * 二叉搜索树保证具有唯一的值。
     */
    int res;

    public int rangeSumBST(TreeNode root, int L, int R) {
        res = 0;
        dfs(root, L, R);
        return res;

    }

    public void dfs(TreeNode node, int L, int R) {
        if (node != null) {
            if (L <= node.val && node.val <= R)
                res += node.val;
            if (L < node.val)
                dfs(node.left, L, R);
            if (R > node.val)
                dfs(node.right, L, R);

        }

    }

}
