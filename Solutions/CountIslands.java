import java.util.Scanner;

public class CountIslands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m : ");
        int m = sc.nextInt();
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println("Number of Islands : " + countIslands(grid, m, n));
        sc.close();
    }

    private static int countIslands(int[][] grid, int m, int n) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    count++;
                    merge(grid, i, j);
                }
            }
        }
        return count;
    }

    private static void merge(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return;
        }
        if (grid[i][j] == 1) {
            grid[i][j] = 0;
            merge(grid, i - 1, j);
            merge(grid, i + 1, j);
            merge(grid, i, j - 1);
            merge(grid, i, j + 1);
        }
    }

}
