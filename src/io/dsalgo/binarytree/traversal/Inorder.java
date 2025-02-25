package io.dsalgo.binarytree.traversal;

import io.dsalgo.binarytree.implementation.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// inorder - left root right
// 94. Binary Tree Inorder Traversal
public class Inorder {
    // Iterative Solution
    public List<Integer> inorderRecursive(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();


        TreeNode temp = root; // create a shallow copy of root node
        while(true){
            if(temp != null){
                st.push(temp);
                temp = temp.left; // go to the as left as possible.
            } else {
                if(st.empty()) break;
                temp = st.pop(); // get the top element
                ans.add(temp.val); // push it to ans
                temp = temp.right; // move to right
            }
        }
        return ans;
    }

    // Recursive Solution
    public static void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}
