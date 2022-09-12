import java.util.Scanner;

import DataStructures.BTree;
import DataStructures.BTree.TreeNode;

public class SumLeftLeaves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the tree : ");
        int size = sc.nextInt();
        BTree btree = new BTree();
        System.out.print("Enter tree values : ");
        for (int i = 0; i < size; i++) {
            btree.insertLevelOrder(sc.nextInt());
        }
        System.out.println("Sum of all the left leaves are : " + sumLeftLeaves(btree.root));
        sc.close();
    }

    public static int sumLeftLeaves(TreeNode root) {
        return dfs(root, -1);
    }

    public static int dfs(TreeNode root, int direction) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null) {
            if (direction == 0)
                return root.value;
            else
                return 0;
        }
        return dfs(root.left, 0) + dfs(root.right, 1);
    }
}