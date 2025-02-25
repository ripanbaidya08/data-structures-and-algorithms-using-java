package io.dsalgo.binarytree.problems.hard;

import io.dsalgo.binarytree.implementation.TreeNode;

// Leetcode: 1028. Recover a Tree From Preorder Traversal

class RecoverATreeFromPreorderTraversal {
  private int i = 0;

  public TreeNode recoverFromPreorder(String traversal) {
    return recoverFromPreorder(traversal, 0);
  }

  private TreeNode recoverFromPreorder(final String traversal, int depth) {
    int nDashes = 0;

    // Count the number of dashes (depth level)
    while (i + nDashes < traversal.length() && traversal.charAt(i + nDashes) == '-')
      ++nDashes;

    // If the depth does not match, return null (backtrack)
    if (nDashes != depth)
      return null;

    i += depth; // Move pointer past dashes
    int start = i;

    // Extract node value
    while (i < traversal.length() && Character.isDigit(traversal.charAt(i)))
      ++i;

    TreeNode node = new TreeNode(Integer.parseInt(traversal.substring(start, i)));

    // Recursively process left and right children
    node.left = recoverFromPreorder(traversal, depth + 1);
    node.right = recoverFromPreorder(traversal, depth + 1);

    return node;
  }

  public static void main(String[] args) {
    String traversal = "1-2--3--4-5--6--7";
    RecoverATreeFromPreorderTraversal solution = new RecoverATreeFromPreorderTraversal();
    TreeNode root = solution.recoverFromPreorder(traversal);


  }
}
