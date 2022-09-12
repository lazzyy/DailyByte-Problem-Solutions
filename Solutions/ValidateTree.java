import java.util.Scanner;

import DataStructures.BTree;
import DataStructures.BTree.TreeNode;

public class ValidateTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the tree : ");
        int size = sc.nextInt();
        BTree btree = new BTree();
        System.out.print("Enter tree values : ");
        for (int i = 0; i < size; i++) {
            btree.insertLevelOrder(sc.nextInt());
        }
        if (validateTree(btree.root)) {
            System.out.println("Tree is a Valid Binary Search Tree.");
        } else {
            System.out.println("Tree is not a Valid BST.");
        }
        sc.close();
    }

    public static boolean validateTree(TreeNode root) {
        return isValidBT(root, null, null);
    }

    public static boolean isValidBT(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null)
            return true;

        if (min != null && root.value <= min.value)
            return false;
        if (max != null && root.value >= max.value)
            return false;

        return isValidBT(root.left, min, root) && isValidBT(root.right, root, max);
    }

}