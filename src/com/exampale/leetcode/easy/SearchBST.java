package com.exampale.leetcode.easy;

/**
 * @author Marie
 * @date 2020/4/19 10:03 PM
 **/
public class SearchBST {
    /**
     * 给定二叉搜索树（BST）的根节点和一个值。 你需要在BST中找到节点值等于给定值的节点.
     * 返回以该节点为根的子树。 如果节点不存在，则返回 NULL
     *
     * @param root
     * @param val
     * @return
     */
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) return root;
        return val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);

    }

}
