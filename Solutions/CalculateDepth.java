import java.util.*;
import DataStructures.BTree;
import DataStructures.BTree.TreeNode;

public class CalculateDepth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the tree : ");
        int size = sc.nextInt();
        BTree btree = new BTree();
        System.out.print("Enter tree values : ");
        for (int i = 0; i < size; i++) {
            btree.insertLevelOrder(sc.nextInt());
        }
        int depth = calculateDepth(btree.root);
        System.out.print("Depth of the Tree : " + depth);
        sc.close();
    }

    public static int calculateDepth(TreeNode root) {
        if (root == null)
            return 0;
        int leftHeight = calculateDepth(root.left);
        int rightHeight = calculateDepth(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
