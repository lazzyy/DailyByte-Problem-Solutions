import java.util.Scanner;
import DataStructures.BSTree;

public class FlattenBSTtoLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the tree : ");
        int size = sc.nextInt();
        BSTree bst = new BSTree();
        System.out.print("Enter values to insert into the tree : ");
        for (int i = 0; i < size; i++) {
            bst.insert(sc.nextInt());
        }
        bst.inOrder(bst);
        bst = flattenBSTtoLL(bst);
        BSTree.TreeNode root = bst.root;
        while (root.right != null) {
            System.out.print(root.value + "->");
            root = root.right;
        }
        System.out.print(root.value);
        sc.close();
    }

    public static BSTree flattenBSTtoLL(BSTree bst) {
        BSTree.TreeNode root = bst.root;
        BSTree.TreeNode curr = bst.root;
        while (curr != null) {
            if (curr.left != null) {
                BSTree.TreeNode prev = curr.left;
                while (prev.right != null) {
                    prev = prev.right;
                }
                prev.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
        bst.root = root;
        return bst;
    }

}
