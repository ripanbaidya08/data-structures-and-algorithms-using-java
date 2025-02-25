package io.dsalgo.binarytree.problems.medium;

import io.dsalgo.binarytree.implementation.TreeNode;

import java.util.ArrayList;

// 114. Flatten Binary Tree to Linked List
public class FlattenBinaryTreeToLinkedList {
    ArrayList<Integer> preorder = new ArrayList<>();

    public void dfs(TreeNode root){
        if(root == null) return;

        // root left right
        preorder.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
    public void flatten(TreeNode root) {
        if(root == null) return;

        dfs(root);

        TreeNode current = root;
        for(int i = 1; i < preorder.size(); i ++){
            current.left = null;
            current.right = new TreeNode(preorder.get(i));
            current = current.right;
        }
        // time: O(n), space: (n)
    }

    public static void main(String[] args) {
        /*
        * Given the root of a binary tree, flatten the tree into a "linked list":
                1
               / \
              2   5
             / \   \
            3   4   6

         * resultant tree:
            1
             \
              2
               \
                3
                 \
                  4
                   \
                    5
                     \
                      6
         */
    }
}
