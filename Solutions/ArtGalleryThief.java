import java.util.Scanner;

public class ArtGalleryThief {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit of weight : ");
        int W = sc.nextInt();
        System.out.print("Enter weights : ");
        int[] weights = new int[3];
        for (int i = 0; i < 3; i++) {
            weights[i] = sc.nextInt();
        }
        System.out.print("Enter values : ");
        int[] values = new int[3];
        for (int i = 0; i < 3; i++) {
            values[i] = sc.nextInt();
        }
        System.out.print("Maximum value which can be stole : " + artGalleryThief(W, weights, values));
        sc.close();
    }

    public static int artGalleryThief(int W, int[] weights, int[] values) {
        int i, w;
        int[][] dp = new int[values.length + 1][W + 1];

        for (i = 0; i <= values.length; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    dp[i][w] = 0;
                else if (weights[i - 1] <= w)
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                else
                    dp[i][w] = dp[i - 1][w];
            }
        }
        return dp[values.length][W];
    }
}
