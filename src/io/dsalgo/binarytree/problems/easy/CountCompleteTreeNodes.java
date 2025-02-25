package io.dsalgo.binarytree.problems.easy;

import io.dsalgo.binarytree.implementation.TreeNode;

// Leetcode: 222. Count Complete Tree Nodes
class CountCompleteTreeNodes {
    /**
     * use dfs inorder traversal.
     * and count the number of nodes while traversing.
     * <br> time: O(n), space: O(n) stack space
     */
    int ans = 0; 
    public void dfs(TreeNode root){
        if(root == null) return;

        dfs(root.left);
        ans ++;
        dfs(root.right);
    }
    public int countNodes(TreeNode root) {
        dfs(root); // dfs inorder
        return ans;
    }

    public static void main(String[] args) {
        /*
                1
               / \
              2   3
             / \ /
            4  5 6

         * total nodes = 6
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        CountCompleteTreeNodes obj = new CountCompleteTreeNodes();

        System.out.println("Total nodes in complete binary tree: "+obj.countNodes(root));
    }
}