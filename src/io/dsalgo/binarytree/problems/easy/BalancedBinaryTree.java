package io.dsalgo.binarytree.problems.easy;

import io.dsalgo.binarytree.implementation.TreeNode;

// 110. Balanced Binary Tree
public class BalancedBinaryTree {
    // if tree is balanced then will return its height
    // or else will retunr -1.
    public int dfs(TreeNode root){
        if(root == null) return 0;

        int left = dfs(root.left);
        if(left == -1) return -1; // left subtree is unbalanced

        int right = dfs(root.right);
        if(right == -1) return -1; // right subtree is unbalanced

        if(Math.abs(left - right) > 1) return -1; // unbalanced

        return 1 + Math.max(left, right); // balanced
    }
    public boolean isBalanced(TreeNode root) {
        return dfs(root) != -1; // only unbalanced will return -1
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        BalancedBinaryTree obj = new BalancedBinaryTree();
        System.out.println(obj.isBalanced(root));
    }
}
