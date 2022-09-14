import java.util.*;

public class StairMaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of stairs : ");
        int size = sc.nextInt();
        System.out.print("Enter cost : ");
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Method 1(Doesn't change the array) Ans : " + stairMaster(nums));
        System.out.println("Method 2(Changes the array) Ans : " + minCostClimbingStairs(nums));
        sc.close();
    }

    public static int minCostClimbingStairs(int[] cost) {
        for (int i = 2; i < cost.length; i++) {
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }

    public static int stairMaster(int[] cost) {
        int step1 = 0;
        int step2 = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            int currentStep = cost[i] + Math.min(step1, step2);
            step1 = step2;
            step2 = currentStep;
        }
        return Math.min(step1, step2);
    }
}