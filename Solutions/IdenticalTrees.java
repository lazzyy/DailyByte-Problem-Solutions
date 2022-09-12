import DataStructures.BTree;
import DataStructures.BTree.TreeNode;

public class IdenticalTrees {
    public static void main(String[] args) {
        BTree bTree1 = new BTree();
        bTree1.root = new TreeNode(2);
        bTree1.root.left = new TreeNode(3);
        bTree1.root.right = new TreeNode(1);

        BTree bTree2 = new BTree();
        bTree2.root = new TreeNode(2);
        bTree2.root.left = new TreeNode(3);
        bTree2.root.right = new TreeNode(1);

        if (identicalTrees(bTree1.root, bTree2.root)) {
            System.out.println("Both the trees are identical.");
        } else {
            System.out.println("Both the trees are not identical.");
        }
    }

    public static boolean identicalTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;
        if (root1.value != root2.value)
            return false;
        return identicalTrees(root1.left, root2.left) && identicalTrees(root1.right, root2.right);
    }
}