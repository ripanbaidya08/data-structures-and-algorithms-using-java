package io.dsalgo.binarytree.problems.medium;

import io.dsalgo.binarytree.implementation.TreeNode;

import java.util.HashSet;
import java.util.Set;

// Leetcode 1261. Find Elements in a Contaminated Binary Tree
class FindElements {
  public FindElements(TreeNode root) {
    dfs(root, 0);
  }

  public boolean find(int target) {
    return vals.contains(target);
  }

  private Set<Integer> vals = new HashSet<>();

  private void dfs(TreeNode root, int val) {
    if (root == null)
      return;

    root.val = val;
    vals.add(val);
    dfs(root.left, val * 2 + 1);
    dfs(root.right, val * 2 + 2);
  }
}