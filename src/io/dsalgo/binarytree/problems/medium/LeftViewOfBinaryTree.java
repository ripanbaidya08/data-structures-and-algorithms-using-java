package io.dsalgo.binarytree.problems.medium;

import io.dsalgo.binarytree.implementation.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// gfg - https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1
public class LeftViewOfBinaryTree {
    // time: O(n), space: O(n)
    public List<Integer> leftSideView(TreeNode root) {
        ArrayList<Integer> leftView = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return leftView;

        q.offer(root);
        while(!q.isEmpty()){
            ArrayList<Integer> lvlEl = new ArrayList<>(); // store all the level elements
            int size = q.size();

            for(int i = 0; i < size; i ++){
                TreeNode curr = q.poll();
                lvlEl.add(curr.val);

                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
            // for each level whatever the first element is the right view for each level
            leftView.add(lvlEl.get(0));
        }
        return leftView;
    }

    public static void main(String[] args) {
        /*
                 1
               /   \
              2     3
               \     \
                5     4
         */
        // leftView = 1 2 5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        List<Integer> leftView = new LeftViewOfBinaryTree().leftSideView(root);
        System.out.println(leftView);
    }
}
