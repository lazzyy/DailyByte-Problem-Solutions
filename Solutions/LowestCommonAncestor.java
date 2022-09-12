import java.util.Scanner;
import DataStructures.BSTree;
import DataStructures.BSTree.TreeNode;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * * I tested the code path on both BST and BT so you can also change.
         * * Try to figure it out yourself. :)
         */
        // System.out.print("Enter size of the tree : ");
        // int size = sc.nextInt();
        BSTree bst = new BSTree();
        // System.out.print("Enter values to insert into the tree : ");
        // for (int i = 0; i < size; i++) {
        // bst.insert(sc.nextInt());
        // }
        bst.root = new TreeNode(3);
        bst.root.left = new TreeNode(5);
        bst.root.right = new TreeNode(1);
        bst.root.left.left = new TreeNode(6);
        bst.root.left.right = new TreeNode(2);
        bst.root.left.right.left = new TreeNode(7);
        bst.root.left.right.right = new TreeNode(4);
        bst.root.right.left = new TreeNode(0);
        bst.root.right.right = new TreeNode(8);

        TreeNode nodeA = bst.root.left;
        TreeNode nodeB = bst.root.left.right.right;
        // System.out.println("A : " + nodeA.value);
        // System.out.println("B : " + nodeB.value);
        var node = lowestCommonAncestor(bst.root, nodeA, nodeB);
        if (node != null)
            System.out.println(node.value);

        /**
         * * To test on different cases you could use these maybe.
         */
        // nodeA = bst.root.left;
        // nodeB = bst.root.right.left;
        // node = lowestCommonAncestor(bst.root, nodeA, nodeB);
        // if (node != null)
        // System.out.println(node.value);
        // nodeA = bst.root.left.left;
        // nodeB = bst.root.left;
        // node = lowestCommonAncestor(bst.root, nodeA, nodeB);
        // if (node != null)
        // System.out.println(node.value);

        sc.close();
    }

    public static TreeNode lowestCommonAncestor(BSTree.TreeNode root, BSTree.TreeNode nodeA,
            BSTree.TreeNode nodeB) {
        if (root == null) {
            return null;
        }
        if (root.value == nodeA.value || root.value == nodeB.value) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, nodeA, nodeB);
        TreeNode right = lowestCommonAncestor(root.right, nodeA, nodeB);

        if (left != null && right != null) {
            return root;
        }
        if (left != null) {
            return left;
        }
        if (right != null) {
            return right;
        }
        return null;
    }

}