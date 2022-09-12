import java.util.Scanner;
import DataStructures.BSTree;
import DataStructures.BSTree.TreeNode;

public class SortedArraytoBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();
        System.out.print("Enter array values : ");
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        BSTree bst = new BSTree();
        bst.root = sortedArraytoBST(nums, 0, nums.length - 1);
        bst.inOrder(bst);
        bst.preOrder(bst);
        bst.postOrder(bst);
        sc.close();
    }

    public static TreeNode sortedArraytoBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArraytoBST(nums, left, mid - 1);
        root.right = sortedArraytoBST(nums, mid + 1, right);
        return root;
    }
}
