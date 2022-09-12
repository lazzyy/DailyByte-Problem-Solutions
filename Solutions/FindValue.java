import java.util.Scanner;

import DataStructures.BSTree;

public class FindValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the tree : ");
        int size = sc.nextInt();
        BSTree bst = new BSTree();
        System.out.print("Enter values to insert into the tree : ");
        for (int i = 0; i < size; i++) {
            bst.insert(sc.nextInt());
        }
        bst.inOrder(bst);
        System.out.print("\nEnter value to search in tree : ");
        int valueToFind = sc.nextInt();
        BSTree.TreeNode foundValue = findValue(bst.root, valueToFind);
        if (foundValue != null) {
            System.out.print("Value Found!!!");
        } else {
            System.out.print("Value Not Found!!!");
        }
        sc.close();
    }

    public static BSTree.TreeNode findValue(BSTree.TreeNode bst, int valueToFind) {
        if (bst == null || bst.value == valueToFind) {
            return bst;
        } else if (bst.value < valueToFind) {
            return findValue(bst.right, valueToFind);
        } else {
            return findValue(bst.left, valueToFind);
        }
    }
}
