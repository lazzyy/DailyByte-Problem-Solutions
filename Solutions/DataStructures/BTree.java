package DataStructures;

import java.util.*;

public class BTree {
    public TreeNode root;

    public static class TreeNode {
        public int value;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.value = val;
            this.left = null;
            this.right = null;
        }
    }

    public void insertLevelOrder(int val) {
        root = insertIntoBT(root, val);
    }

    public TreeNode insertIntoBT(TreeNode root, int val) {
        TreeNode temp = root;
        if (temp == null) {
            root = new TreeNode(val);
            return root;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(temp);
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp.left == null) {
                temp.left = new TreeNode(val);
                break;
            } else
                q.add(temp.left);

            if (temp.right == null) {
                temp.right = new TreeNode(val);
                break;
            } else
                q.add(temp.right);
        }
        return root;
    }

    public void inOrder(BTree bt) {
        inOrderTraversal(bt.root);
        System.out.println();
        return;
    }

    private void inOrderTraversal(TreeNode temp) {
        if (temp != null) {
            inOrderTraversal(temp.left);
            System.out.print(temp.value + " ");
            inOrderTraversal(temp.right);
        }
    }

    public void preOrder(BTree bt) {
        preOrderTraversal(bt.root);
        System.out.println();
        return;
    }

    private void preOrderTraversal(TreeNode temp) {
        if (temp != null) {
            System.out.print(temp.value + " ");
            preOrderTraversal(temp.left);
            preOrderTraversal(temp.right);
        }
    }

    public void postOrder(BTree bt) {
        postOrderTraversal(bt.root);
        System.out.println();
        return;
    }

    private void postOrderTraversal(TreeNode temp) {
        if (temp != null) {
            postOrderTraversal(temp.left);
            postOrderTraversal(temp.right);
            System.out.print(temp.value + " ");
        }
    }
}