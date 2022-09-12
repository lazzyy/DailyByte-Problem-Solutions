import java.util.Scanner;

import DataStructures.BTree;
import DataStructures.BTree.TreeNode;

public class RootToLeafPathSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the tree : ");
        int size = sc.nextInt();
        BTree btree = new BTree();
        System.out.print("Enter tree values : ");
        for (int i = 0; i < size; i++) {
            btree.insertLevelOrder(sc.nextInt());
        }
        // btree.root = new TreeNode(1);
        // btree.root.left = new TreeNode(5);
        // btree.root.right = new TreeNode(2);
        // btree.root.left.left = new TreeNode(1);
        // btree.root.right.left = new TreeNode(12);
        // btree.root.right.right = new TreeNode(29);
        // btree.inOrder(btree);
        System.out.print("Enter target sum : ");
        int sum = sc.nextInt();
        if (rootToLeafPathSum(btree.root, sum)) {
            System.out.println("There is a path from root -> leaf where the sum is equal to " + sum + ".");
        } else {
            System.out.println("There is no path from root -> leaf where the sum is equal to " + sum + ".");
        }
        sc.close();
    }

    public static boolean rootToLeafPathSum(TreeNode root, int sum) {

        if (root == null) {
            return false;
        }
        return dfs(root, sum, 0);
    }

    public static boolean dfs(TreeNode root, int requiredSum, int currentSum) {
        currentSum += root.value;
        if (root.left == null && root.right == null) {
            if (currentSum == requiredSum) {
                return true;
            }
            return false;
        }
        boolean left = false, right = false;
        if (root.left != null) {
            left = dfs(root.left, requiredSum, currentSum);
        }
        if (root.right != null) {
            right = dfs(root.right, requiredSum, currentSum);
        }
        return left || right;
    }
}