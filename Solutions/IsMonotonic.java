import java.util.Arrays;
import java.util.Scanner;

public class IsMonotonic {
    public static boolean isMonotonic(int[] nums) {
        boolean increasingMonotonic = true;
        boolean decreasingMonotonic = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                increasingMonotonic = false;
            }
            if (nums[i] > nums[i - 1]) {
                decreasingMonotonic = false;
            }
        }
        return increasingMonotonic || decreasingMonotonic;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        System.out.print("Enter nums : ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        if (isMonotonic(nums)) {
            System.out.println("Yes " + Arrays.toString(nums) + " is monotonic.");
        } else {
            System.out.println("No, it's not monotonic.");
        }
        sc.close();
    }
}
