package io.dsalgo.binarytree.problems.medium;

import io.dsalgo.binarytree.implementation.TreeNode;

import java.util.ArrayList;

/*
  Find the all Paths from the root to leaf.
                  1
                 / \
                2   3
              /  \
             4   5
  all paths: [1 -> 2 -> 4], [1 -> 2 -> 5], [1 -> 3]
 */
// gfg - https://practice.geeksforgeeks.org/problems/root-to-leaf-paths/1
public class RootToLeafPaths {
    public static void getAllPaths(TreeNode root, ArrayList<ArrayList<Integer>> paths, ArrayList<Integer> path){
        if(root == null) return;

        path.add(root.val);

        if(root.left == null && root.right == null){
            // add from the root to leaf all nodes value
            paths.add(new ArrayList<>(path));
        } else {
            getAllPaths(root.left, paths, path);
            getAllPaths(root.right, paths, path);
        }

        path.removeLast(); // remove the last
    }
    public static ArrayList<ArrayList<Integer>> Paths(TreeNode root) {
        ArrayList<ArrayList<Integer>> paths = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();

        if(root == null) return paths;

        getAllPaths(root, paths, path);
        return paths;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        ArrayList<ArrayList<Integer>> paths = Paths(root);
        System.out.println(paths);
    }
}
