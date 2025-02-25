package io.dsalgo.binarytree.problems.medium;

import io.dsalgo.binarytree.implementation.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// leetcode 662. Maximum Width of Binary Tree
class MaximumWidthOfBinaryTree {
    // time: O(n), space: O(n)
    static class Pair{
        TreeNode node;
        int num;

        public Pair(TreeNode node, int num){
            this.node = node;
            this.num = num;
        }
    }   

    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0; // base
        Queue<Pair> q = new LinkedList<>();
        int ans = 0;

        q.offer(new Pair(root, 0));
        while(!q.isEmpty()){
            int size = q.size();
            int first = 0, last = 0;
            int levelMinVal = q.peek().num; // to make the level value start from 0

            for(int i = 0; i < size; i ++){
                int curLevelVal = q.peek().num - levelMinVal;
                TreeNode cur = q.poll().node;

                if(i == 0) first = curLevelVal;
                if(i == size-1) last = curLevelVal;
                
                if(cur.left != null) { 
                    q.offer(new Pair(cur.left, curLevelVal*2+1));
                }
                if(cur.right != null) {
                    q.offer(new Pair(cur.right, curLevelVal*2+2));
                }
            }
            ans = Math.max(ans, last-first+1); 
        }
        return ans;
    }

    public static void main(String[] args) {
        /*
                    1
                   / \
                  3   2
                 /     \
                5       9
               /       /
              6       7
         * root = [1,3,2,5,null,null,9,6,null,null,7]
         * ans = 7
         * The maximum width exists in the fourth level with length 7.
         * [6, null, null, null, null, null, 7]
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.right.right = new TreeNode(9);
        root.left.left.left = new TreeNode(6);
        root.right.right.left = new TreeNode(7);

        MaximumWidthOfBinaryTree obj = new MaximumWidthOfBinaryTree();
        System.out.println(obj.widthOfBinaryTree(root));
    }
}