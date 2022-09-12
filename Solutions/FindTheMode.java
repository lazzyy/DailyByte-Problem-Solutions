import java.util.*;
import DataStructures.BSTree;
import DataStructures.BSTree.TreeNode;

public class FindTheMode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of tree : ");
        int size = sc.nextInt();
        BSTree bst = new BSTree();
        System.out.print("Enter tree values : ");
        for (int i = 0; i < size; i++) {
            bst.insert(sc.nextInt());
        }
        bst.inOrder(bst);
        int[] modes = findTheMode(bst.root);
        System.out.println("The Mode of the Tree : " + Arrays.toString(modes));
        sc.close();
    }

    static Integer prev = null;
    static int count = 1;
    static int max = 0;

    public static int[] findTheMode(TreeNode root) {
        List<Integer> modes = new ArrayList<Integer>();
        traverse(root, modes);
        int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++)
            result[i] = modes.get(i);

        return result;
    }

    public static void traverse(TreeNode node, List<Integer> modes) {
        if (node == null)
            return;
        traverse(node.left, modes);

        if (prev != null) {
            if (prev == node.value) {
                count++;
            } else {
                count = 1;
            }
        }
        if (count > max) {
            max = count;
            modes.clear();
            modes.add(node.value);
        } else if (count == max) {
            modes.add(node.value);
        }
        prev = node.value;

        traverse(node.right, modes);
    }
}