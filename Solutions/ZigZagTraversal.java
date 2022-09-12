import java.util.*;
import DataStructures.BTree;
import DataStructures.BTree.TreeNode;

public class ZigZagTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the tree : ");
        int size = sc.nextInt();
        System.out.print("Enter tree values : ");
        BTree bt = new BTree();
        for (int i = 0; i < size; i++) {
            bt.insertLevelOrder(sc.nextInt());
        }
        List<List<Integer>> levelOrder = zigZagTraversal(bt.root);
        System.out.println(Arrays.deepToString(levelOrder.toArray()));
        sc.close();
    }

    public static List<List<Integer>> zigZagTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode currentNode = queue.remove();
                currentLevel.add(currentNode.value);
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
            if (flag == false) {
                Collections.reverse(currentLevel);
                result.add(currentLevel);
                flag = true;
            } else {
                result.add(currentLevel);
                flag = false;
            }
        }
        return result;
    }
}