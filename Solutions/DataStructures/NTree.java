package DataStructures;

import java.util.*;

public class NTree {
    public TreeNode root;

    public static class TreeNode {
        public int value;
        public List<TreeNode> children = new LinkedList<>();

        public TreeNode(int val) {
            this.value = val;
        }

        public TreeNode(int val, List<TreeNode> child) {
            this.value = val;
            this.children = child;
        }
    }

    public void printNTree(TreeNode root) {
        if (root == null)
            return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                System.out.print(node.value + " ");
                for (TreeNode item : node.children) {
                    queue.add(item);
                }
            }
            System.out.println();
        }
    }
}