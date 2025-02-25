package io.dsalgo.binarytree.problems.easy;

import io.dsalgo.binarytree.implementation.TreeNode;

// leetcode: 543. Diameter of Binary Tree
public class DiameterOfBinaryTree {
    private int diameter = 0;

    public int dfs(TreeNode root){
        if(root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);

        diameter = Math.max(diameter, left + right);

        return 1 + Math.max(left, right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return diameter;
    }

    public static void main(String[] args) {
        /*
                1
               / \
              2   3
             / \
            4   5
         *
         * d = 3.
         * d is the length of path [4,2,1,5] [5,2,1,5]
         */
    }
}
