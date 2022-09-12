package DataStructures;

public class BSTree {
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

    public void insert(int val) {
        root = insertIntoBST(root, val);
    }

    private TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }
        if (val < root.value) {
            root.left = insertIntoBST(root.left, val);
        } else if (val > root.value) {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

    public void inOrder(BSTree bst) {
        System.out.print("In - Order Traversal of BST : ");
        inOrderTraversal(bst.root);
        System.out.println();
        return;
    }

    public void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.value + " ");
            inOrderTraversal(root.right);
        }
    }

    public void preOrder(BSTree bst) {
        System.out.print("Pre - Order Traversal of BST : ");
        preOrderTraversal(bst.root);
        System.out.println();
        return;
    }

    public void preOrderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.value + " ");
            inOrderTraversal(root.left);
            inOrderTraversal(root.right);
        }
    }

    public void postOrder(BSTree bst) {
        System.out.print("Post - Order Traversal of BST : ");
        postOrderTraversal(bst.root);
        System.out.println();
        return;
    }

    public void postOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            inOrderTraversal(root.right);
            System.out.print(root.value + " ");
        }
    }
}
