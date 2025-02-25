package io.dsalgo.binarytree.problems.medium;

import io.dsalgo.binarytree.implementation.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// leetcode 199. Binary Tree Right Side View
public class RightViewOfBinaryTree {
    // time: O(n), space: O(n)
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> rightView = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return rightView;

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
            // for each level whatever the last element is the right view for each level
            rightView.add(lvlEl.get(lvlEl.size()-1));
        }
        return rightView;
    }
    public static void main(String[] args) {
        /*
                 1
               /   \
              2     3
               \     \
                5     4
         */
        // rightView = 1 3 4
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        List<Integer> rightView = new RightViewOfBinaryTree().rightSideView(root);
        System.out.println(rightView);
    }
}
