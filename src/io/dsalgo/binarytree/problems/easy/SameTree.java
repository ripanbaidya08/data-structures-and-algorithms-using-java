package io.dsalgo.binarytree.problems.easy;

import io.dsalgo.binarytree.implementation.TreeNode;

// leetcode: 100. Same Tree
public class SameTree {
    /**
     * Determines if two binary trees are identical.
     * Two trees are considered identical if they have the same structure and
     * the nodes have the same values.
     *
     * @return True if the trees are identical, otherwise false.
     */
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true; // nodes are null
        }

        // If one of the nodes is null and the other is not, the trees are not the same.
        if (p == null || q == null) {
            return false;
        }

        // Check if the current nodes have the same value.
        // Recursively check the left and right subtrees.
        return (p.val == q.val) &&
                isSameTree(p.left, q.left) &&
                isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        /*
         * tree1
                1
               / \
              2   3
         * tree2
                1
               / \
              2   3
         * same tree
         */
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        System.out.println(isSameTree(root1, root2));
    }
}
