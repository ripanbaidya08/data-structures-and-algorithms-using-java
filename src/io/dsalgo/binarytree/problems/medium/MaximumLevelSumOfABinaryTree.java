package io.dsalgo.binarytree.problems.medium;

import io.dsalgo.binarytree.implementation.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

// 1161. Maximum Level Sum of a Binary Tree
class MaximumLevelSumOfABinaryTree {
    // time: O(n) space: O(n)
    /*
    * tast cast
            1       => 1
           / \      
          1   0     => 1
         / \ / \ 
        7 -8 -7 9   => 1
    */
    public int maxLevelSum(TreeNode root) {
        if(root == null) return -1; 
        int maxi = Integer.MIN_VALUE, lvl = 0; 

        Queue<TreeNode> queue = new LinkedList<>();
        Map<Integer, Integer> mp = new HashMap<>();

        queue.offer(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            int curLevelSum = 0;

            for(int i = 0; i < n; i ++){
                TreeNode cur = queue.poll(); 

                if(cur.left != null) queue.offer(cur.left);
                if(cur.right != null) queue.offer(cur.right);

                curLevelSum += cur.val;
            }
            lvl ++; // track current level
            // never allow same current level sum to put into map more than once
            if(!mp.containsKey(curLevelSum)) { 
                mp.put(curLevelSum, lvl);
            }
        }
        // find the maximum level sum. and return lt's level
        for(int k : mp.keySet()){
            maxi = Math.max(maxi, k);
        }

        return mp.get(maxi);
    }
}