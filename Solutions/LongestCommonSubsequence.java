import java.util.Scanner;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1 : ");
        String s1 = sc.next();
        System.out.print("Enter string 2 : ");
        String s2 = sc.next();
        System.out.println("Longes common subsequence : " + longesCommonSubsequence(s1, s2));
        sc.close();
    }

    public static int longesCommonSubsequence(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++)
            dp[i][0] = 0;
        for (int i = 1; i <= m; i++)
            dp[0][i] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[n][m];
    }
}