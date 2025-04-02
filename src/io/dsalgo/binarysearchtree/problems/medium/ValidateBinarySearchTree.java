package io.dsalgo.binarysearchtree.problems.medium;

import io.dsalgo.binarysearchtree.implementation.TreeNode;

// 98. Validate Binary Search Tree
class ValidateBinarySearchTree {
    public boolean isValid(TreeNode root, long minVal, long maxVal){
        if(root == null) return true;
        if(root.val >= maxVal || minVal >= root.val) return false;

        return isValid(root.left, minVal, root.val) &&
                isValid(root.right, root.val, maxVal);
    }
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}