package com.exampale.leetcode.easy;

/**
 * @author Marie
 * @date 2020/4/8 11:20 PM
 **/
public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

}
