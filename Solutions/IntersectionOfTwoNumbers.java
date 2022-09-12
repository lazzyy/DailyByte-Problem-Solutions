import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of nums1 : ");
        int size1 = sc.nextInt();
        ArrayList<Integer> nums1 = new ArrayList<Integer>();
        for (int i = 0; i < size1; i++) {
            nums1.add(sc.nextInt());
        }
        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        System.out.print("Enter size of nums2 : ");
        int size2 = sc.nextInt();
        for (int i = 0; i < size2; i++) {
            nums2.add(sc.nextInt());
        }
        ArrayList<Integer> out = intersectionOfTwoNumbers(nums1, nums2);
        for (Integer i : out) {
            System.out.printf("%d ", i);
        }
        sc.close();
    }

    public static ArrayList<Integer> intersectionOfTwoNumbers(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        ArrayList<Integer> out = new ArrayList<Integer>();
        for (int i = 0; i < nums1.size(); i++) {
            if (nums2.contains(nums1.get(i))) {
                if (!out.contains(nums1.get(i))) {
                    out.add(nums1.get(i));
                }
            }
        }
        return out;
    }
}
