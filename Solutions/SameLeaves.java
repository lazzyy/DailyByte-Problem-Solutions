import java.util.*;

import DataStructures.BTree;
import DataStructures.BTree.TreeNode;

public class SameLeaves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the 1st tree : ");
        int size1 = sc.nextInt();
        BTree btree1 = new BTree();
        System.out.print("Enter tree values : ");
        for (int i = 0; i < size1; i++) {
            btree1.insertLevelOrder(sc.nextInt());
        }
        System.out.print("Enter size of the 2nd tree : ");
        int size2 = sc.nextInt();
        BTree btree2 = new BTree();
        System.out.print("Enter tree values : ");
        for (int i = 0; i < size2; i++) {
            btree2.insertLevelOrder(sc.nextInt());
        }
        if (sameLeaves(btree1.root, btree2.root)) {
            System.out.println("The Leaves of both the trees are same.");
        } else {
            System.out.println("The Leaves of both the trees are not the same.");
        }
        sc.close();
    }

    public static boolean sameLeaves(TreeNode root1, TreeNode root2) {
        List<Integer> leavesRoot1 = leaves(root1);
        List<Integer> leavesRoot2 = leaves(root2);
        System.out.println("Tree1 : " + leavesRoot1);
        System.out.println("Tree2 : " + leavesRoot2);
        if (leavesRoot1.equals(leavesRoot2)) {
            return true;
        }
        return false;
    }

    public static List<Integer> leaves(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root.left == null && root.right == null) {
            result.add(root.value);
        }
        if (root.left != null) {
            result.addAll(leaves(root.left));
        }
        if (root.right != null) {
            result.addAll(leaves(root.right));
        }
        return result;
    }
}
