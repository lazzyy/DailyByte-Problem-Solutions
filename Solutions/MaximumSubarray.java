import java.util.*;

public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.print("Enter values : ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Maximum sum of subarray is : " + maximumSubarray(nums));
        sc.close();
    }

    public static int maximumSubarray(int[] nums) {
        int currentSum = 0, currentAns = Integer.MIN_VALUE;
        for (int i : nums) {
            currentSum += i;
            currentAns = Math.max(currentAns, currentSum);
            if (currentSum < 0)
                currentSum = 0;
        }
        return currentAns;
    }
}
