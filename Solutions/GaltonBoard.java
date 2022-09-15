import java.util.Scanner;

public class GaltonBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows (M) : ");
        int M = sc.nextInt();
        System.out.print("Enter columns (N) : ");
        int N = sc.nextInt();
        System.out.println("Number of possible paths : " + galtonBoard(M, N));
        sc.close();
    }

    public static int galtonBoard(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }
}