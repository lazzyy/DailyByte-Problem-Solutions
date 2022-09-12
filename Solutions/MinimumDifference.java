import java.util.ArrayList;
import java.util.Scanner;

import DataStructures.BSTree;
import DataStructures.BSTree.TreeNode;

public class MinimumDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the tree : ");
        int size = sc.nextInt();
        BSTree bst = new BSTree();
        System.out.print("Enter Tree values : ");
        for (int i = 0; i < size; i++) {
            bst.insert(sc.nextInt());
        }
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int minDiff = minimumDifference(bst.root, nums);
        System.out.print("Minimum difference is : " + minDiff);
        sc.close();
    }

    public static int minimumDifference(TreeNode root, ArrayList<Integer> nums) {
        traversal(root, nums);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < nums.size(); i++) {
            minDiff = Math.min(minDiff, nums.get(i) - nums.get(i - 1));
        }
        return minDiff;
    }

    public static void traversal(TreeNode root, ArrayList<Integer> nums) {
        if (root != null) {
            traversal(root.left, nums);
            nums.add(root.value);
            traversal(root.right, nums);
        }
    }
}
