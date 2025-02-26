package io.dsalgo.binarysearchtree.problems.easy;

import io.dsalgo.binarysearchtree.implementation.TreeNode;

// 700. Search in a Binary Search Tree
class SearchInBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;

        if(root.val == val) {
            return root;
        } else if(val < root.val){
            root = searchBST(root.left, val);
        } else {
            root = searchBST(root.right, val);
        }
        return root;
    }
}