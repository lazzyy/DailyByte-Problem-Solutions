import java.util.Scanner;
import DataStructures.LList;

public class ReturnStartOfCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Linked List : ");
        int listSize = sc.nextInt();
        LList list = new LList();
        System.out.print("Enter list elements : ");
        for (int i = 0; i < listSize; i++) {
            list.insertAtLast(sc.nextInt());
        }
        System.out.println(returnStartOfCycle(list).value);
        sc.close();

    }

    public static LList.Node returnStartOfCycle(LList list) {
        LList.Node fast = list.head;
        LList.Node slow = list.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        fast = list.head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
