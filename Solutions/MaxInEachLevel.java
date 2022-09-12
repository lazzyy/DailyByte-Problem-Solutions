import java.util.*;
import DataStructures.BTree;
import DataStructures.BTree.TreeNode;;

public class MaxInEachLevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the tree : ");
        int size = sc.nextInt();
        System.out.print("Enter tree values : ");
        BTree bt = new BTree();
        for (int i = 0; i < size; i++) {
            bt.insertLevelOrder(sc.nextInt());
        }
        List<Integer> levelOrder = maxInEachLevel(bt.root);
        System.out.println(Arrays.deepToString(levelOrder.toArray()));
        sc.close();
    }

    public static List<Integer> maxInEachLevel(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.remove();
                currentLevel.add(current.value);
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            result.add(Collections.max(currentLevel));
        }
        return result;
    }
}