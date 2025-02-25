package io.dsalgo.binarytree.traversal;

import io.dsalgo.binarytree.implementation.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// prorder, postoder, inorder traversal in one traversal

public class PreInPostTraversal {
    static class Pair{
        public TreeNode node;
        public int num;

        public Pair(TreeNode node, int num){
            this.node = node;
            this.num = num;
        }
    }
    public static List<List<Integer>> preInPostTraversal(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        if (root == null) {
            return new ArrayList<>();
        }

        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root, 1)); // push the root with value 1

        while (!st.empty()) {
            Pair pair = st.pop();
            TreeNode node = pair.node;
            int state = pair.num;

            // add to preorder
            // increment the state or here set it to 2. push it.
            // if left child is not null, push it
            if (state == 1) {
                pre.add(node.val);
                pair.num = 2;
                st.push(pair);

                if (node.left != null) {
                    st.push(new Pair(node.left, 1));
                }
            } else if (state == 2) {
                // add to inorder
                // increment the state or here set it to 3. push it.
                // if right child is not null, push it
                in.add(node.val);
                pair.num = 3;
                st.push(pair);

                if (node.right != null) {
                    st.push(new Pair(node.right, 1));
                }
            } else {
                // postorder
                post.add(node.val);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(pre);
        result.add(in);
        result.add(post);
        return result;
    }

    public static void printList(List<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    /*
              1
             / \
            2   3
          / \
         4  5
     * preorder: 1 2 4 5 3
     * inorder: 4 2 5 1 3
     * postorder: 4 5 2 3 1
     */

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<List<Integer>> traversals = preInPostTraversal(root);
        List<Integer> pre = traversals.get(0);
        List<Integer> in = traversals.get(1);
        List<Integer> post = traversals.get(2);

        System.out.print("Preorder traversal: ");
        printList(pre);

        System.out.print("Inorder traversal: ");
        printList(in);

        System.out.print("Postorder traversal: ");
        printList(post);
    }
}