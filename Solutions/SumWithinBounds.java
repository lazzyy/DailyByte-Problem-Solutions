import java.util.Scanner;
import DataStructures.BTree;
import DataStructures.BTree.TreeNode;

public class SumWithinBounds {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(7);
        tree.root.left.left = new TreeNode(4);
        tree.root.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(3);
        tree.root.right.right = new TreeNode(9);
        int low, high;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter low : ");
        low = sc.nextInt();
        System.out.print("Enter high : ");
        high = sc.nextInt();
        int sumWithinBoundsVal = sumWithinBounds(tree.root, low, high);
        System.out.println("The sum within bounds of " + low + " & " + high + " : " + sumWithinBoundsVal);
        sc.close();
    }

    public static int sumWithinBounds(TreeNode root, int low, int high) {
        int val = 0;
        if (root == null) {
            return val;
        } else if (root.value >= low && root.value <= high) {
            val += root.value;
        }
        return val + sumWithinBounds(root.left, low, high) + sumWithinBounds(root.right, low, high);
    }
}
