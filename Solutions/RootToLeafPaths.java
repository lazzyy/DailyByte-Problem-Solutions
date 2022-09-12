import java.util.*;
import DataStructures.*;
import DataStructures.BTree.TreeNode;

public class RootToLeafPaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the tree : ");
        int size = sc.nextInt();
        BTree btree = new BTree();
        System.out.print("Enter tree values : ");
        for (int i = 0; i < size; i++) {
            btree.insertLevelOrder(sc.nextInt());
        }
        List<String> allPaths = rootToLeafPaths(btree.root);
        System.out.println(allPaths);
        sc.close();
    }

    public static List<String> rootToLeafPaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        if (root == null) {
            return paths;
        }
        dfs(root, "", paths);
        return paths;
    }

    public static void dfs(TreeNode root, String currentPath, List<String> paths) {
        currentPath += root.value;
        if (root.left == null && root.right == null) {
            paths.add(currentPath);
            return;
        }
        if (root.left != null) {
            dfs(root.left, currentPath + "->", paths);
        }
        if (root.right != null) {
            dfs(root.right, currentPath + "->", paths);
        }
        return;
    }
}