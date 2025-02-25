package io.dsalgo.binarytree.problems.medium;

import io.dsalgo.binarytree.implementation.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// leetcode 103. Binary Tree Zigzag Level Order Traversal
public class ZigZagTraversal {
    /**
     * Performs a zigzag level order traversal of a binary tree.
     * In zigzag traversal, nodes are traversed left-to-right and then right-to-left alternately.
     *
     * @return A list of lists containing the nodes' values in zigzag level order.
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true; // Flag to track the traversal direction.

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            LinkedList<Integer> level = new LinkedList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();

                // Add the current node's value to the level list based on the traversal direction.
                if (leftToRight) {
                    level.addLast(currentNode.val); // Left-to-right: add to the end.
                } else {
                    level.addFirst(currentNode.val); // Right-to-left: add to the beginning.
                }

                if (currentNode.left != null) queue.offer(currentNode.left);
                if (currentNode.right != null) queue.offer(currentNode.right);
            }

            result.add(level);
            leftToRight = !leftToRight; // Toggle the traversal direction for the next level.
        }
        return result;
    }
}
