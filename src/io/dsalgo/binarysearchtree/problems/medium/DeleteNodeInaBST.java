package io.dsalgo.binarysearchtree.problems.medium;

import io.dsalgo.binarysearchtree.implementation.TreeNode;

import java.util.ArrayList;
import java.util.Collections;

public class DeleteNodeInaBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val == key) {
            return helper(root);
        }
        TreeNode dummy = root;

        while(root != null) {
            if (key < root.val) {
                if (root.left != null && root.left.val == key) {
                    root.left = helper(root.left);
                    break;
                } else {
                    root = root.left;
                }
            } else {
                if(root.right != null && root.right.val == key){
                    root.right = helper(root.right);
                    break;
                } else {
                    root = root.right;
                }
            }
        }
        return dummy;
    }
    public TreeNode helper(TreeNode root){
        if(root.left == null) return root.right;
        else if(root.right == null) return root.left;
        else {
            TreeNode rightChild = root.right;
            TreeNode leftLastRight = findLastRight(root.left);
            leftLastRight.right = rightChild;
            return root.left;
        }
    }

    private TreeNode findLastRight(TreeNode root) {
        while(root.right != null){
            root = root.right;
        }
        return root;
    }
    void fun(){
        ArrayList<Integer> li = new ArrayList<>();
        Collections.sort(li);
    }
}
