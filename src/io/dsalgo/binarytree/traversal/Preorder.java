package io.dsalgo.binarytree.traversal;

import io.dsalgo.binarytree.implementation.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// preorder - root left right
// 144. Binary Tree Preorder Traversal
public class Preorder {
    public static void preorder(TreeNode root) {
        if (root == null) return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // preorder iterative solution
    public static void preorderIterative(TreeNode root) {
        /*
        * We can use stack data structure to store the node.and for each node
        * we will push its right & left child if it exists to the stack.
        * pop the top element and store it in the list.
        * */
        List<Integer> preorder = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root == null) return;

        st.push(root); // add the root
        while(!st.empty()){
            root = st.pop();
            preorder.add(root.val);
            if(root.right != null) st.push(root.right);
            if(root.left != null) st.push(root.left);
        }
        System.out.println();
        System.out.print(preorder);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        root.right.left = new TreeNode(60);

        preorder(root);
        preorderIterative(root);
    }
}
