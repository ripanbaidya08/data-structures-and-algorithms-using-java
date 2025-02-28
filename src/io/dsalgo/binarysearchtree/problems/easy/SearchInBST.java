package io.dsalgo.binarysearchtree.problems.easy;

import io.dsalgo.binarysearchtree.implementation.TreeNode;

// 700. Search in a Binary Search Tree
class SearchInBST {
    public static TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;

        if(root.val == val) {
            return root;
        } else if(val < root.val){
            root = searchBST(root.left, val);
        } else { // (val > root.val)
            root = searchBST(root.right, val);
        }
        return root;
    }

    public static void main(String[] args) {
        /*
            4
           / \
          2   7
         / \
        1  3

        * target = 2.
        */
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int val = 2;

        TreeNode res = searchBST(root, val);
        System.out.println(res.val);
    }
}