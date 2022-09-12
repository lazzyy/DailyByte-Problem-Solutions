import java.util.*;
import DataStructures.NTree;
import DataStructures.NTree.TreeNode;

public class GatherNAryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NTree ntree = new NTree();
        TreeNode root = new TreeNode(1);
        ntree.root = root;
        root.children.add(new TreeNode(2));
        root.children.add(new TreeNode(3));
        root.children.add(new TreeNode(4));
        root.children.get(0).children.add(new TreeNode(5));
        root.children.get(0).children.add(new TreeNode(6));
        root.children.get(0).children.add(new TreeNode(7));
        root.children.get(1).children.add(new TreeNode(8));
        root.children.get(2).children.add(new TreeNode(9));
        root.children.get(2).children.add(new TreeNode(10));
        root.children.get(2).children.add(new TreeNode(11));
        // ntree.printNTree(ntree.root);
        List<List<Integer>> levelOrder = gatherNAryTree(ntree);
        System.out.println(Arrays.deepToString(levelOrder.toArray()));
        sc.close();
    }

    public static List<List<Integer>> gatherNAryTree(NTree ntree) {
        TreeNode root = ntree.root;
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> currentLevel = new ArrayList<>();
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                currentLevel.add(node.value);
                for (TreeNode item : node.children) {
                    queue.add(item);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
}
