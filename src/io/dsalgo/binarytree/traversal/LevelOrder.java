package io.dsalgo.binarytree.traversal;

import io.dsalgo.binarytree.implementation.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 102. Binary Tree Level Order Traversal
public class LevelOrder {
    // time: O(n), space: O(n)
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>(); // result
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null) return result;

        queue.offer(root); // add the root
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new LinkedList<>();

            for(int i = 0; i < size; i ++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);

                // add the answer to the level and remove that element from the queue
                level.add(queue.poll().val);
            }
            result.add(level);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> ans = levelOrder(root);
        System.out.println(ans);
    }
}
