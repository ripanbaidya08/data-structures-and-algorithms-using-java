package io.dsalgo.binarytree.problems.medium;

import io.dsalgo.binarytree.implementation.TreeNode;

import java.util.ArrayList;

// leetcode 236. Lowest Common Ancestor of a Binary Tree
class LCAOfBinaryTree {
    /**
     * This method finds the path from the root to the given node `p` and stores it in `path`.
     *
     * 1. If the root is null, return false (base case).
     * 2. Add the current node to the path.
     * 3. If the current node matches `p`, return true.
     * 4. Recursively check the left and right subtrees.
     * 5. If neither subtree contains `p`, remove the current node from the path (backtracking).
     * 6. Return true if the node is found in either subtree.
     *
     * Time Complexity: O(n) (since we traverse the tree once to find the path)
     * Space Complexity: O(n) (due to recursion stack + path storage)
     */
    public static boolean getPath(TreeNode root, TreeNode p, ArrayList<TreeNode> path) {
        if (root == null) return false;
        
        path.add(root); // Add the current node to the path

        if (root.val == p.val) return true; // Node found
        
        // Recursively check left and right subtrees for `p`
        if (getPath(root.left, p, path) || getPath(root.right, p, path)) {
            return true; // If found in either subtree, return true
        }
        
        // Backtrack: Remove the last node if `p` was not found in this path
        path.remove(path.size() - 1);
        return false;
    }

    /**
     * This method finds the Lowest Common Ancestor (LCA) of nodes `p` and `q`.
     * 
     * Steps:
     * 1. Get the paths from root to `p` and `q` in two lists (`pathP` and `pathQ`).
     * 2. Iterate through both paths until a mismatch is found.
     * 3. The last matching node before the mismatch is the LCA.
     *
     * Time Complexity: O(n) + O(n) = O(n) (finding both paths)
     * Space Complexity: O(n) (storing the paths)
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> pathP = new ArrayList<>();
        ArrayList<TreeNode> pathQ = new ArrayList<>();

        // Find paths from root to `p` and `q`
        getPath(root, p, pathP);
        getPath(root, q, pathQ);

        int i = 0, j = 0;
        int m = pathP.size(), n = pathQ.size();

        // Compare both paths until they diverge
        while (i < m && j < n) {
            if (pathP.get(i).val != pathQ.get(j).val) {
                return pathP.get(i - 1); // Return the last matching node
            }
            i++;
            j++;
        }

        // If one path is shorter, return the last common node in the shorter path
        return (j < n) ? pathQ.get(j - 1) : pathP.get(i - 1);
    }
}
