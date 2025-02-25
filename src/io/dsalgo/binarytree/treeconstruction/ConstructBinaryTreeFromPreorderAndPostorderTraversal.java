package io.dsalgo.binarytree.treeconstruction;

import io.dsalgo.binarytree.implementation.TreeNode;

import java.util.HashMap;
import java.util.Map;

// 889. Construct Binary Tree from Preorder and Postorder Traversal
class ConstructBinaryTreeFromPreorderAndPostorderTraversal {
  // this is an alternate solution
  static class Solution {
    /**
     * We know if we visit a node for the first time, it's in preorder.
     * If we visit the node for the third time, it's in postorder.
     */

    int preIndex = 0;
    int postIndex = 0;

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
      // Create the root node using the current value in the preorder array
      TreeNode root = new TreeNode(preorder[preIndex]);
      preIndex++; // Move to the next node in preorder

      // If the current preorder value does not match the current postorder value,
      // it means we have not yet visited the left subtree. Recursively construct it.
      if (root.val != postorder[postIndex]) {
        root.left = constructFromPrePost(preorder, postorder);
      }

      // If the current preorder value does not match the current postorder value,
      // it means we have not yet visited the right subtree. Recursively construct it.
      // However, this logic is flawed because it doesn't correctly handle the postIndex.
      // A correct approach would involve tracking the number of nodes in the left subtree.
      if (root.val != postorder[postIndex]) {
        root.right = constructFromPrePost(preorder, postorder);
      }

      postIndex++; // Move to the next node in postorder after visiting the current node for the third time
      return root;
    }
  }


  public TreeNode constructFromPrePost(int[] pre, int[] post) {
    Map<Integer, Integer> postToIndex = new HashMap<>();

    for (int i = 0; i < post.length; ++i)
      postToIndex.put(post[i], i);

    return build(pre, 0, pre.length - 1,
                post, 0, post.length - 1,
                postToIndex);
  }

  private TreeNode build(int[] pre, int preStart, int preEnd,
                         int[] post, int postStart, int postEnd,
                         Map<Integer, Integer> postToIndex) {
    if (preStart > preEnd) return null;
    if (preStart == preEnd) return new TreeNode(pre[preStart]);

    final int rootVal = pre[preStart];
    final int leftRootVal = pre[preStart + 1];
    final int leftRootPostIndex = postToIndex.get(leftRootVal);
    final int leftSize = leftRootPostIndex - postStart + 1;

    TreeNode root = new TreeNode(rootVal);
    root.left = build(pre, preStart + 1, preStart + leftSize, post, postStart, leftRootPostIndex,
                      postToIndex);
    root.right = build(pre, preStart + leftSize + 1, preEnd, post, leftRootPostIndex + 1,
                       postEnd - 1, postToIndex);
    return root;
  }

  public static void main(String[] args) {
    int[] preorder = {1, 2, 4, 5, 3, 6, 7};
    int[] postorder = {4, 5, 2, 6, 7, 3, 1};

    ConstructBinaryTreeFromPreorderAndPostorderTraversal obj = new ConstructBinaryTreeFromPreorderAndPostorderTraversal();
    TreeNode root = obj.constructFromPrePost(preorder, postorder);

    /*
    * this would be the binary tree
            1
           / \
          2   3
         / \ / \
        4  5 6  7
     */
  }
}