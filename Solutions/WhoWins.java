import java.util.*;

public class WhoWins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.print("Enter turns : ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        if (whoWins(nums)) {
            System.out.println("Player 1 Wins!!!");
        } else {
            System.out.println("Player 2 Wins!!!");
        }
        sc.close();
    }

    public static boolean whoWins(int[] nums) {
        Integer[][] memo = new Integer[nums.length][nums.length];
        return helper(nums, 0, nums.length - 1, memo) >= 0;
    }

    public static int helper(int[] nums, int start, int end, Integer[][] memo) {
        if (start == end)
            return nums[start];
        if (memo[start][end] != null)
            return memo[start][end];
        int a = nums[start] - helper(nums, start + 1, end, memo);
        int b = nums[end] - helper(nums, start, end - 1, memo);
        memo[start][end] = Math.max(a, b);
        return memo[start][end];
    }
}
