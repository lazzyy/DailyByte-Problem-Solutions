import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class DistanceToRabbitHoles {

    static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

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
        updateRabbitDistance(nums);
        System.out.println("Output : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

public static void updateRabbitDistance(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> queue = new ArrayDeque<>();

        // Find all rabbit holes and add them to the queue
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        // Perform BFS from each rabbit hole
        while (!queue.isEmpty()) {
            int[] hole = queue.poll();
            int holeX = hole[0];
            int holeY = hole[1];

            for (int[] dir : directions) {
                int newX = holeX + dir[0];
                int newY = holeY + dir[1];

                if (newX >= 0 && newX < m && newY >= 0 && newY < n && grid[newX][newY] == 1) {
                    // Update the distance to the rabbit hole
                    grid[newX][newY] = grid[holeX][holeY] + 1;
                    queue.offer(new int[]{newX, newY});
                }
            }
        }

        // Set unreachable rabbit cells to -1
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    grid[i][j] = -1;
                }
            }
        }
    }
}