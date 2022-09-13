import java.util.Arrays;
import java.util.Scanner;

public class MovingBricks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of bricks : ");
        int size = sc.nextInt();
        System.out.print("Enter brick's weights : ");
        int[] bricks = new int[size];
        for (int i = 0; i < size; i++) {
            bricks[i] = sc.nextInt();
        }
        System.out.print("Enter size of wheelbarrow : ");
        int limit = sc.nextInt();
        System.out.println(
                "Maximum number of bricks which can be placed in wheelbarrow are : " + movingBricks(bricks, limit));
        sc.close();
    }

    public static int movingBricks(int[] bricks, int limit) {
        Arrays.sort(bricks);
        int weight = 0, count = 0;
        for (int brick : bricks) {
            weight += brick;
            count++;
            if (weight >= limit) {
                break;
            }
        }
        if (weight >= limit) {
            return count - 1;
        }
        return count;
    }
}