package io.dsalgo.binarytree.problems.hard;

import io.dsalgo.binarytree.implementation.TreeNode;

// leetcode: 124. Binary Tree Maximum Path Sum
public class BinaryTreeMaximumPathSum {
    private int maxSum = Integer.MIN_VALUE; // store the maximum path sum of BT

    public int dfsMaxPath(TreeNode root){
        if(root == null) return 0;

        // Calculate the maximum path sum for the left and right subtrees
        int leftSum = Math.max(0, dfsMaxPath(root.left)); // ignore -ve sum
        int rightSum = Math.max(0, dfsMaxPath(root.right));

        maxSum = Math.max(maxSum, root.val + leftSum + rightSum);

        return root.val + Math.max(leftSum, rightSum);
    }
    public int maxPathSum(TreeNode root) {
        dfsMaxPath(root);
        return maxSum;
    }

    public static void main(String[] args) {
        /*
        *            -10
        *           /  \
        *          9    20
        *              /  \
        *             15   7
        *
        * Input: root = [-10,9,20,null,null,15,7]
        * Output: 42
        * Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.
        */
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        BinaryTreeMaximumPathSum obj = new BinaryTreeMaximumPathSum();

        System.out.println("Maximum path sum " + obj.maxPathSum(root));
    }
}
