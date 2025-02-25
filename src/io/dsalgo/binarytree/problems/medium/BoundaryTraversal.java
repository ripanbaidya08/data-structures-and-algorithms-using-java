package io.dsalgo.binarytree.problems.medium;

import io.dsalgo.binarytree.implementation.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

// gfg - https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1
public class BoundaryTraversal {
    public static boolean isLeaf(TreeNode node){
        return (node.left == null) && (node.right == null);
    }

    public static void addLeftBoundary(TreeNode node, ArrayList<Integer> res){
        TreeNode cur = node.left;
        while(cur != null){
            if(!isLeaf(cur)) res.add(cur.val);

            if(cur.left != null) cur = cur.left;
            else cur = cur.right;
        }
    }
    public static void addRightBoundary(TreeNode node, ArrayList<Integer> res){
        // since we need to store right boundary in reverse order so, i will take the help of stack ds
        // to store all right boundary elmenets
        Stack<Integer> temp = new Stack<>();
        TreeNode cur = node.right;

        while(cur != null){
            if(!isLeaf(cur)) temp.push(cur.val);

            if(cur.right != null) cur = cur.right;
            else cur = cur.left;
        }
        // add elements in reverse manner
        while(!temp.isEmpty()){
            res.add(temp.pop());
        }
    }
    public static void addLeafNodes(TreeNode node, ArrayList<Integer> res){
        if(isLeaf(node)){
            res.add(node.val);
            return;
        }
        if(node.left != null) addLeafNodes(node.left, res);
        if(node.right != null) addLeafNodes(node.right, res);
    }
    ArrayList<Integer> boundaryTraversal(TreeNode node) {
        ArrayList<Integer> result = new ArrayList<>();
        if(node == null) return result;

        if(!isLeaf(node)) result.add(node.val);

        addLeftBoundary(node, result);
        addLeafNodes(node, result);
        addRightBoundary(node, result);

        return result;
    }
}
