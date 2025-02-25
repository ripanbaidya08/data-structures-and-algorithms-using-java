package io.dsalgo.binarytree.problems.easy;

import io.dsalgo.binarytree.implementation.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// leetcode 104. Maximum Depth of Binary Tree
public class HeightOfBinaryTree {
    // recursive solution
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1 + Math.max(left, right);
    }

    // Iterative solution using bfs
    public int maxDepth2(TreeNode root) {
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null) return depth;
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i ++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                queue.poll();
            }
            depth ++;
        }
        return depth;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        HeightOfBinaryTree obj = new HeightOfBinaryTree();
        System.out.println(obj.maxDepth(root));
    }
}
