package io.dsalgo.binarysearchtree.problems.medium;

import io.dsalgo.binarysearchtree.implementation.TreeNode;

// 701. Insert into a Binary Search Tree
class InsertIntoABinarySearchTree {
    /*
                4 
               / \ 
              2   7
             / \ /
             1 3 5 

    * we have inserted 5 here.    
    */
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val); 
        TreeNode cur = root; 

        while(true){
            if(val < cur.val){
                if(cur.left != null) cur = cur.left;
                else {
                    cur.left = new TreeNode(val);
                    break;
                }
            } else {
                if(cur.right != null) cur = cur.right;
                else {
                    cur.right = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);

        int val = 5;

        TreeNode res = insertIntoBST(root, val);
    }
}