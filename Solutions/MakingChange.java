import java.util.*;

public class MakingChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of coins : ");
        int size = sc.nextInt();
        System.out.print("Enter coins : ");
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter amount : ");
        int amount = sc.nextInt();
        System.out.println("Number of coins : " + makingChange(nums, amount));
        sc.close();
    }

    public static int makingChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 0; i <= amount; i++) {
            for (int j : coins) {
                if (j <= i) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - j]);
                } else {
                    break;
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
