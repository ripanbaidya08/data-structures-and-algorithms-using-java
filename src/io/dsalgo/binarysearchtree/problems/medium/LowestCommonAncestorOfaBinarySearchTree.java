package io.dsalgo.binarysearchtree.problems.medium;

import io.dsalgo.binarysearchtree.implementation.TreeNode;

// 235. Lowest Common Ancestor of a Binary Search Tree
public class LowestCommonAncestorOfaBinarySearchTree {
    // time: O(h), space: O(1). h is the height of the tree
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;

        int curVal = root.val;
        if(p.val < curVal && q.val < curVal){
            return lowestCommonAncestor(root.left, p, q);
        } 
        if(p.val > curVal && q.val > curVal){
            return lowestCommonAncestor(root.right, p, q);
        } 
        return root;
    }
}