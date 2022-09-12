import java.util.Scanner;

import DataStructures.BTree;
import DataStructures.BTree.TreeNode;

public class SymmetricalTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the tree : ");
        int size = sc.nextInt();
        BTree btree = new BTree();
        System.out.print("Enter tree values : ");
        for (int i = 0; i < size; i++) {
            btree.insertLevelOrder(sc.nextInt());
        }
        if (symmetricalTree(btree.root)) {
            System.out.println("The tree is reflected across it's center.");
        } else {
            System.out.println("The tree is not reflected across it's center.");
        }
        sc.close();
    }

    public static boolean symmetricalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        return helper(root.left, root.right);
    }

    public static boolean helper(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left.value != right.value) {
            return false;
        }
        if ((left != null && right == null) || (left == null && right != null)) {
            return false;
        }
        return helper(left.left, right.right) && helper(left.right, right.left);
    }
}