import java.util.Scanner;

public class GoldRush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter no of columns : ");
        int columns = sc.nextInt();
        System.out.println("Enter board values : ");
        int[][] goldMine = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                goldMine[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Maximum Path of Gold is : " + goldRush(goldMine));
        sc.close();
    }

    public static int goldRush(int[][] goldMine) {
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < goldMine.length; i++) {
            for (int j = 0; j < goldMine[i].length; j++) {
                if (goldMine[i][j] != 0) {
                    int newVal = dfs(goldMine, i, j);
                    maxVal = Math.max(newVal, maxVal);
                }
            }
        }
        return maxVal;
    }

    public static int dfs(int[][] goldMine, int i, int j) {
        if (i < 0 || i >= goldMine.length || j < 0 || j >= goldMine[i].length || goldMine[i][j] == 0) {
            return 0;
        }
        int temp = goldMine[i][j];
        goldMine[i][j] = 0;
        int i1 = dfs(goldMine, i + 1, j);
        int i2 = dfs(goldMine, i - 1, j);
        int j1 = dfs(goldMine, i, j + 1);
        int j2 = dfs(goldMine, i, j - 1);
        int max = Math.max(Math.max(i1, i2), Math.max(j1, j2));
        goldMine[i][j] = temp;
        return max + temp;
    }
}
