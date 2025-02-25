package io.dsalgo.binarytree.treeconstruction;

import io.dsalgo.binarytree.implementation.TreeNode;

import java.util.HashMap;
import java.util.Map;

// 106. Construct Binary Tree from Inorder and Postorder Traversal
class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    // time: O(n), space: O(n)
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> inMap = new HashMap<>();
        for(int i = 0; i < inorder.length; i ++){
            inMap.put(inorder[i], i);
        }
        TreeNode root = buildTree(postorder, 0, postorder.length-1,
                                inorder, 0, inorder.length-1, inMap);
        return root;   
    }
    public TreeNode buildTree(int[] postorder, int postStart, int postEnd,
                            int[] inorder, int inStart, int inEnd,
                            Map<Integer, Integer>inMap){
        if(inStart > inEnd || postStart > postEnd) return null;
        TreeNode root = new TreeNode(postorder[postEnd]);

        int inRoot = inMap.get(root.val);
        int leftNums = inRoot - inStart;
        int rightNums = inEnd - inRoot;

        root.left = buildTree(postorder, postStart, postStart + leftNums - 1,
                            inorder, inStart, inRoot - 1, inMap);
        root.right = buildTree(postorder, postStart + leftNums, postEnd - 1,
                            inorder, inRoot + 1, inEnd, inMap);

        return root;
    }

    public static void main(String[] args) {
        int[] inorder = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};

        ConstructBinaryTreeFromInorderAndPostorderTraversal obj = new ConstructBinaryTreeFromInorderAndPostorderTraversal();
        TreeNode root = obj.buildTree(inorder, postorder);
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
