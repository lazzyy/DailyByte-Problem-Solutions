import java.util.Scanner;

import DataStructures.LList;

public class FindMiddleElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Linked List : ");
        int listSize = sc.nextInt();
        LList list = new LList();
        System.out.print("Enter list elements : ");
        for (int i = 0; i < listSize; i++) {
            list.insertAtLast(sc.nextInt());
        }
        int middleElement = findMiddleElement(list);
        System.out.print("Enter value to remove from List : " + middleElement);
        sc.close();
    }

    public static int findMiddleElement(LList list) {
        LList.Node fast = list.head;
        LList.Node slow = list.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.value;
    }
}
