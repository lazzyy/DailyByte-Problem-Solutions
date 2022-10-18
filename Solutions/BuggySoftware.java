import java.util.*;

public class BuggySoftware {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int N = sc.nextInt();
        System.out.println("The first Bad Release : " + firstBadVersion(N));
        sc.close();
    }

    public static int firstBadVersion(int n) {
        int left = 0, right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isBadRelease(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    // * A Dummy Function
    public static boolean isBadRelease(int val) {
        return false;
    }

}