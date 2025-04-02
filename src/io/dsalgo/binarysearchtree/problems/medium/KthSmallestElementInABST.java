package io.dsalgo.binarysearchtree.problems.medium;

import io.dsalgo.binarysearchtree.implementation.TreeNode;

// 230. Kth Smallest Element in a BST
class KthSmallestElementInABST{
    int ans = 0;
    int count = 0;

    public void inorder(TreeNode root, int k){if(root == null) return;
        inorder(root.left, k);
        count ++; // when visit node
        if(count == k) {
            ans = root.val;
            return;
        }
        inorder(root.right, k);
    }
    public void inorderReverse(TreeNode root, int k, int[] counter, int[] kLargest){
        if(root == null) return;

        inorderReverse(root.right, k, counter, kLargest);
        counter[0] ++;
        if(counter[0] == k){
            kLargest[0] = root.val;
        }
        inorderReverse(root.left, k, counter, kLargest);
    }
    /**
     * We'll perform inorder traversal, and at the same time will maintain a 'counter'.
     * while visiting a node, we increment the 'counter' value.
     * when counter == k, return that particular node.
     * The in-order traversal of BST always gives us elements in sorted order.
     */
    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return ans;
    }

    /**
     * Perform reverse inorder traversal from the root node. At every visited node,
     * increment a counter-variable to keep track of visited nodes.
     * Traverse the right subtree, then current node then left subtree.
     *
     * When the counter reaches K, store the value of the current node as the Kth smallest.
     */
    public int kthLargest(TreeNode root, int k){
        int[] largest = new int[] {Integer.MIN_VALUE};
        inorderReverse(root, k, new int[]{0}, largest);
        return largest[0];
    }

    public static void main(String[] args) {
        // Creating a BST
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(13);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(2);
        root.left.left.right = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.left.right.right = new TreeNode(9);
        root.right.left = new TreeNode(11);
        root.right.right = new TreeNode(14);

        KthSmallestElementInABST obj = new KthSmallestElementInABST();
        int k = 3;

        System.out.println("Kth smallest element: " + obj.kthSmallest(root, k));
        System.out.println("Kth largest element: " + obj.kthLargest(root, k));
    }
}