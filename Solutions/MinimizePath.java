import java.util.Scanner;

public class MinimizePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        System.out.println("Enter grid : ");
        int[][] grid = new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.print("Minimum cost path : "+minimizePath(grid,size));
        sc.close();
    }
    public static int minimizePath(int[][] grid,int size){
        if(grid == null||grid.length==0){
            return 0;
        }
        int[][] dp = new int[grid.length][grid[0].length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                dp[i][j] += grid[i][j];
                if(i>0 && j>0){
                    dp[i][j]+=Math.min(dp[i-1][j],dp[i][j-1]);
                }
                else if(i>0){
                    dp[i][j] += dp[i-1][j];
                }else if(j>0){
                    dp[i][j] += dp[i][j-1];
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
