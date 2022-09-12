import java.util.Scanner;
import DataStructures.LList;

public class MergeLinkedLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter list1 size : ");
        int list1Size = sc.nextInt();
        LList list1 = new LList();
        System.out.print("Enter list1 elements : ");
        for (int i = 0; i < list1Size; i++) {
            list1.insertAtLast(sc.nextInt());
        }

        System.out.print("Enter list2 size : ");
        int list2Size = sc.nextInt();
        LList list2 = new LList();
        System.out.print("Enter list2 elements : ");
        for (int i = 0; i < list2Size; i++) {
            list2.insertAtLast(sc.nextInt());
        }

        LList mergedList = mergeLinkedLists(list1, list2);
        mergedList.display();
        sc.close();
    }

    public static LList mergeLinkedLists(LList list1, LList list2) {
        LList mergedList = new LList();
        LList.Node temp1 = list1.head;
        LList.Node temp2 = list2.head;
        while (temp1 != null && temp2 != null) {
            if (temp1.value < temp2.value) {
                mergedList.insertAtLast(temp1.value);
                temp1 = temp1.next;
            } else {
                mergedList.insertAtLast(temp2.value);
                temp2 = temp2.next;
            }
        }

        if (temp1 != null) {
            mergedList.tail.next = temp1;
            mergedList.tail = null;
        }
        if (temp2 != null) {
            mergedList.tail.next = temp2;
            mergedList.tail = null;
        }
        return mergedList;
    }

}
