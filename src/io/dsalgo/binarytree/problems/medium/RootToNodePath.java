package io.dsalgo.binarytree.problems.medium;

import io.dsalgo.binarytree.implementation.TreeNode;

import java.util.ArrayList;

/**
 * Find the Path from the root to a particular node or nodes value
 * Eg. Here find path from root to node's val = 5
 * result: [1 -> 2 -> 5]
 *                 1
 *                / \
 *               2   3
 *             /  \
 *            4   5
 */
// gfg - https://practice.geeksforgeeks.org/problems/root-to-node-path/1
public class RootToNodePath {
    public static boolean getPath(TreeNode root, ArrayList<Integer> path, int B){
        if(root == null) return false;
        path.add(root.val);

        // at any given point of time, if we find the value
        // or reach the destination, then we will return true.
        if(root.val == B) return true;

        // if we find in any one of the side then will return false
        if(getPath(root.left, path, B) || getPath(root.right, path, B)){
            return true;
        }
        path.removeLast(); // make sure remove the last element. while backtrack
        return false;
    }
    public static ArrayList<Integer> path(TreeNode root, int B) { // B is the value of node
        ArrayList<Integer> path = new ArrayList<>();

        if(root == null) return path;

        getPath(root, path, B);
        return path;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        ArrayList<Integer> path = path(root, 5);
        System.out.println(path);
    }
}
