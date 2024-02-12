import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    List<TreeNode> children;

    TreeNode(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }
}

public class DivingDeep {

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int maxChildDepth = 0;
        for (TreeNode child : root.children) {
            int childDepth = maxDepth(child);
            maxChildDepth = Math.max(maxChildDepth, childDepth);
        }
        return maxChildDepth + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.children.add(new TreeNode(3));
        root.children.add(new TreeNode(9));
        root.children.add(new TreeNode(2));
        root.children.get(0).children.add(new TreeNode(7));
        root.children.get(2).children.add(new TreeNode(2));

        System.out.println("The maximum depth of the tree : " + maxDepth(root)); // Output: 3
    }
}
