import java.util.Scanner;

import DataStructures.LList;

public class ReverseList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Linked List : ");
        int listSize = sc.nextInt();
        LList list = new LList();
        System.out.print("Enter list elements : ");
        for (int i = 0; i < listSize; i++) {
            list.insertAtLast(sc.nextInt());
        }
        reverseList(list);
        list.display();
        sc.close();
    }

    public static void reverseList(LList list) {
        LList.Node head = list.head;
        int size = list.getSize();
        if (size < 2) {
            return;
        }

        LList.Node prev = null;
        LList.Node present = head;
        LList.Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        list.head = prev;
    }
}
