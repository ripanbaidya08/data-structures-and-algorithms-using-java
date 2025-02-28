package io.dsalgo.binarysearchtree.problems.easy;

import io.dsalgo.binarysearchtree.implementation.TreeNode;

// Find the minimum and maximum element in a Binary Search tree.
public class MinimumElementInBST {
    public int getMin(TreeNode root) {
        if(root == null) return -1;

        while(root.left != null){
            root = root.left; // smaller is on the left.
        }
        return root.val;
    }
    public int getMax(TreeNode root) {
        if(root == null) return -1;

        while(root.right != null){
            root = root.right; // greater is on the right.
        }
        return root.val;
    }

    public static void main(String[] args) {
        /*
                   5
                 / \
                4   6
               /     \
              3       7
             /
            1

         * min = 1
         * max = 7
         */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(1);
        root.right.right = new TreeNode(7);

        MinimumElementInBST obj = new MinimumElementInBST();

        System.out.println("minimum element: "+ obj.getMin(root));
        System.out.println("maximum element: "+ obj.getMax(root));
    }
}
