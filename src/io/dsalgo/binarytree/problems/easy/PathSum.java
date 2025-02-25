package io.dsalgo.binarytree.problems.easy;

import io.dsalgo.binarytree.implementation.TreeNode;

/*
 * leetcode: 112. Path Sum
        5
       / \
      4   8
     /   / \
    11  13  4
   /  \      \
  7    2      1

 * targetSum = 22
 * pathSum = 5 + 4 + 11 + 2 = 22 true
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, targetSum, 0);
    }

    private boolean dfs(TreeNode root, int targetSum, int currSum) {
        if (root == null) return false;

        // Add the current node's value to the current sum
        currSum += root.val;

        // Check if it's a leaf node and if the current sum equals the target sum
        if (root.left == null && root.right == null) {
            return currSum == targetSum;
        }

        // Recursively check the left and right subtrees
        return dfs(root.left, targetSum, currSum) || dfs(root.right, targetSum, currSum);
    }
}
