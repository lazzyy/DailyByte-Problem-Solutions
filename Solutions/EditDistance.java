import java.util.*;

public class EditDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word1 : ");
        String word1 = sc.next();
        System.out.print("Enter word2 : ");
        String word2 = sc.next();
        System.out.print("Minimum operations to be made are : " + editDistance(word1, word2));
        sc.close();
    }

    static int[][] dp;

    public static int editDistance(String s, String t) {
        int m = s.length(), n = t.length();
        dp = new int[m + 1][n + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        return count(m, n, s, t);
    }

    public static int count(int i, int j, String s, String t) {
        if (i == 0)
            return j;
        if (j == 0)
            return i;
        if (dp[i][j] != -1)
            return dp[i][j];

        if (s.charAt(i - 1) == t.charAt(j - 1)) {
            return dp[i][j] = count(i - 1, j - 1, s, t);
        } else {
            int delete = 1 + count(i - 1, j, s, t);
            int insert = 1 + count(i, j - 1, s, t);
            int replace = 1 + count(i - 1, j - 1, s, t);

            return dp[i][j] = Math.min(delete, Math.min(insert, replace));
        }
    }

}