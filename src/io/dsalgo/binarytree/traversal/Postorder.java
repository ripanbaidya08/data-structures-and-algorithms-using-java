package io.dsalgo.binarytree.traversal;

import io.dsalgo.binarytree.implementation.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// postorder - left right root
// 145. Binary Tree Postorder Traversal
public class Postorder {

    // Postorder iterative solution using double queue.
    public List<Integer> postorderIterative(TreeNode root) {
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        List<Integer> postorder = new ArrayList<>();

        if(root == null) return postorder;

        st1.push(root);
        while(!st1.isEmpty()){
            root = st1.pop();
            st2.push(root);
            if(root.left != null) st1.push(root.left);
            if(root.right != null) st1.push(root.right);
        }

        // copy all elements from st2 to ans
        while(!st2.isEmpty()){
            postorder.add(st2.pop().val);
        }
        return postorder;
    }

    // recursive solution
    public static void postorder(TreeNode root) {
        if (root == null) return;

        postorder(root.left); // left
        postorder(root.right); // right
        System.out.print(root.val + " "); // root
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        postorder(root);
    }
}
