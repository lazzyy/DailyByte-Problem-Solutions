import java.util.Scanner;

public class DistanceToRabbitHoles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter array elements : ");
        int[][] nums = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        nums = distanceToRabbitHoles(nums);
        System.out.println("Output : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static int[][] distanceToRabbitHoles(int[][] nums) {
        // Yet to work
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == 1) {
                    dfs(i, j, 0, nums);
                }
            }
        }
        return nums;
    }

    public static void dfs(int i, int j, int count, int[][] nums) {
        if (i < 0 || i >= nums.length || j < 0 || j >= nums[i].length || nums[i][j] < count) {
            return;
        }

        nums[i][j] = count;
        dfs(i + 1, j, count + 1, nums);
        dfs(i - 1, j, count + 1, nums);
        dfs(i, j + 1, count + 1, nums);
        dfs(i, j - 1, count + 1, nums);
    }
}