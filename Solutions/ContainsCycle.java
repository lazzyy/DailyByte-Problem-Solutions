import java.util.Scanner;

import DataStructures.LList;

public class ContainsCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Linked List : ");
        int listSize = sc.nextInt();
        LList list = new LList();
        System.out.print("Enter list elements : ");
        for (int i = 0; i < listSize; i++) {
            list.insertAtLast(sc.nextInt());
        }
        if (containsCycle(list)) {
            System.out.println("The List contains a cycle.");
        } else {
            System.out.println("The List doesn't contain a cycle.");
        }
        sc.close();

    }

    public static boolean containsCycle(LList list) {
        LList.Node fast = list.head;
        LList.Node slow = list.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
