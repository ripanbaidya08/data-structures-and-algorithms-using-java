package io.dsalgo.binarytree.problems.medium;

import io.dsalgo.binarytree.implementation.TreeNode;

import java.util.*;

// 863. All Nodes Distance K in Binary Tree
class AllNodesDistanceKInBinaryTree {
    // time: O(n), space: O(n)
    private static void markParents(TreeNode root, Map<TreeNode, TreeNode> parentTrack){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i = 0; i < size; i ++){
                TreeNode cur = queue.poll();

                if(cur.left != null) {
                    queue.offer(cur.left);
                    parentTrack.put(cur.left, cur);
                }
                if(cur.right != null){
                    queue.offer(cur.right);
                    parentTrack.put(cur.right, cur);
                }
            }
        }
    }
    public static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        // mark parent node
        Map<TreeNode, TreeNode> parentTrack = new HashMap<>();
        markParents(root, parentTrack);

        Map<TreeNode, Boolean> visited = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        int curDistance = 0;
        visited.put(target, true); 
        queue.offer(target);

        while(!queue.isEmpty()){
            int size = queue.size();
            if(curDistance == k) break;
            curDistance ++;
            for(int i = 0; i < size; i ++){
                TreeNode currentNode = queue.poll();

                if(currentNode.left != null && visited.get(currentNode.left) == null){ // left child
                    queue.offer(currentNode.left);
                    visited.put(currentNode.left, true);
                }
                if(currentNode.right != null && visited.get(currentNode.right) == null){ // right child
                    queue.offer(currentNode.right);
                    visited.put(currentNode.right, true);
                }
                if(parentTrack.get(currentNode) != null && visited.get(parentTrack.get(currentNode)) == null){
                    queue.offer(parentTrack.get(currentNode));
                    visited.put(parentTrack.get(currentNode), true);   
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(!queue.isEmpty()){
            ans.add(queue.poll().val);
        }
        return ans;
    }

    public static void main(String[] args) {
        /*
                             3
                           /  \
                          5    1
                        / \   / \
                       6  2  0   8
                         / \
                        7   4

         * target = 5, k = 2
         * ans = [7, 4, 1]
         */
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        List<Integer> ans = distanceK(root, root.left, 2);
        System.out.println(ans);
    }
}