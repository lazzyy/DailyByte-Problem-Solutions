import java.util.*;

import DataStructures.*;
import DataStructures.BTree.TreeNode;

public class IterativeInorderTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BTree btree = new BTree();
        // btree.root = new TreeNode(2);
        // btree.root.left = new TreeNode(1);
        // btree.root.right = new TreeNode(3);

        btree.root = new TreeNode(2);
        btree.root.left = new TreeNode(1);
        btree.root.left.left = new TreeNode(4);
        btree.root.left.right = new TreeNode(8);
        btree.root.right = new TreeNode(7);
        Vector<Integer> out = iterativeInOrderTraversal(btree);
        for (Integer i : out) {
            System.out.print(i + " ");
        }
        sc.close();
    }

    public static Vector<Integer> iterativeInOrderTraversal(BTree bt) {
        Vector<Integer> res = new Vector<Integer>();
        TreeNode current = bt.root;
        Stack<TreeNode> s = new Stack<TreeNode>();
        while (current != null || s.size() > 0) {
            while (current != null) {
                s.push(current);
                current = current.left;
            }
            current = s.pop();
            res.add(current.value);
            current = current.right;
        }
        return res;
    }
}
