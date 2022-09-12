import java.util.Scanner;
import DataStructures.LList;

public class RemoveValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Linked List : ");
        int listSize = sc.nextInt();
        LList list = new LList();
        System.out.print("Enter list elements : ");
        for (int i = 0; i < listSize; i++) {
            list.insertAtLast(sc.nextInt());
        }
        System.out.print("Enter value to remove from List : ");
        int value = sc.nextInt();
        removeValue(list, value);
        list.display();
        sc.close();
    }

    public static void removeValue(LList list, int value) {
        LList.Node head = list.head;
        while (head != null && head.value == value) {
            head = head.next;
        }
        list.head = head;
        LList.Node currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.next.value == value) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
    }

}