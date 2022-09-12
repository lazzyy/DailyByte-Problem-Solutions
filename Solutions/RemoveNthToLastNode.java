import java.util.Scanner;

import DataStructures.*;

public class RemoveNthToLastNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Linked List : ");
        int listSize = sc.nextInt();
        LList list = new LList();
        System.out.print("Enter list elements : ");
        for (int i = 0; i < listSize; i++) {
            list.insertAtLast(sc.nextInt());
        }
        System.out.print("Enter nth value to remove from last : ");
        int n = sc.nextInt();
        LList outList = removeNthToLastNode(list, n);
        outList.display();
        sc.close();
    }

    public static LList removeNthToLastNode(LList list, int n) {
        LList dummyHead = new LList();
        dummyHead.head = list.head;
        LList.Node fast = dummyHead.head;
        LList.Node slow = dummyHead.head;
        if (n == list.getSize()) {
            list.deleteAtFirst();
            return list;
        }

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        if (slow == null || slow.next == null) {
            return new LList();
        }

        slow.next = slow.next.next;

        return list;
    }
}
