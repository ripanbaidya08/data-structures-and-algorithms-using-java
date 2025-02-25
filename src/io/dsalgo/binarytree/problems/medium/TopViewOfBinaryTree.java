package io.dsalgo.binarytree.problems.medium;

import io.dsalgo.binarytree.implementation.TreeNode;

import java.util.*;

// gfg - https://www.geeksforgeeks.org/problems/top-view-of-binary-tree/1
public class TopViewOfBinaryTree {
    static class Pair{
        TreeNode node;
        int line;

        public Pair(TreeNode node, int line){
            this.node = node;
            this.line = line;
        }
    }
    public static ArrayList<Integer> topView(TreeNode root) {
        ArrayList<Integer> topView = new ArrayList<>();
        Queue<Pair> queue = new LinkedList<>();
        Map<Integer, Integer> mp = new TreeMap<>(); // store line, node value

        if(root == null) return topView;

        queue.offer(new Pair(root, 0));
        while(!queue.isEmpty()){
            int size = queue.size();
            Pair it = queue.poll(); // take out the first element of queue

            int hd = it.line; // horizontal distance
            TreeNode currNode = it.node; // current node of a tree

            mp.putIfAbsent(hd, currNode.val); // put line with the value of the current node to the map

            if(currNode.left != null){
                queue.offer(new Pair(currNode.left, hd -1));
            }
            if(currNode.right != null){
                queue.offer(new Pair(currNode.right, hd + 1));
            }
        }
        // from the map, take all the value and store it in result
        topView.addAll(mp.values());
        return topView;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        ArrayList<Integer> topView = topView(root);
        System.out.println(topView);
    }
}
