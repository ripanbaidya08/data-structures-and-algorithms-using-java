package io.dsalgo.binarytree.implementation;

// Implementation of Binary Tree
public class BinaryTree {
    TreeNode root;

    // Constructor for the binary tree
    public BinaryTree(int val) {
        root = new TreeNode(val);
    }

    // Method to insert a node
    public void insert(int val) {
        root = insertRecursive(root, val);
    }

    private TreeNode insertRecursive(TreeNode current, int val) {
        if (current == null) {
            return new TreeNode(val); // if tree is empty, and it is the first node
        }

        if (val < current.val) {
            current.left = insertRecursive(current.left, val);
        } else if (val > current.val) {
            current.right = insertRecursive(current.right, val);
        }

        return current;
    }

    // Method to traverse the tree in-order
    public void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.val + " ");
            inOrderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);

        System.out.println("In-order traversal:");
        tree.inOrderTraversal(tree.root);
    }
}
