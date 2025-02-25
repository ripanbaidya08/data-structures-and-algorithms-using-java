package io.dsalgo.binarytree.treeconstruction;

import io.dsalgo.binarytree.implementation.TreeNode;

import java.util.HashMap;
import java.util.Map;

// 105. Construct Binary Tree from Preorder and Inorder Traversal
class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    // time: O(n), space: O(n)
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inMap = new HashMap<>();
    
        for(int i = 0; i < inorder.length; i ++){
            inMap.put(inorder[i], i);
        }
        TreeNode root = buildTree(preorder, 0, preorder.length - 1, 
                                  inorder, 0, inorder.length - 1, inMap);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int preStart, int preEnd,
                                    int[] inorder, int inStart, int inEnd, 
                                    Map<Integer, Integer> inMap){

        if(preStart > preEnd || inStart > inEnd) return null; 
        TreeNode root = new TreeNode(preorder[preStart]); // build node

        int inRoot = inMap.get(root.val); // getting the position of root val in inorder
        int numsLeft = inRoot - inStart; // numbers on the left side of root.val in inorder
        
        root.left = buildTree(preorder, preStart + 1, preStart + numsLeft,
                            inorder, inStart, inRoot - 1, inMap);
        root.right = buildTree(preorder, preStart + 1 + numsLeft, preEnd,
                            inorder, inRoot + 1, inEnd, inMap);

        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        ConstructBinaryTreeFromPreorderAndInorderTraversal obj = new ConstructBinaryTreeFromPreorderAndInorderTraversal();

        TreeNode root = obj.buildTree(preorder, inorder);
        /*
                    3
                   / \
                  9  20
                    /  \
                   15   7
         * This would be the unique binary tree
         */
    }
}