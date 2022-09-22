import java.util.*;

public class PaintingHouses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] costs = new int[3][3];
        System.out.println("Enter costs : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                costs[i][j] = sc.nextInt();
            }
        }
        System.out.println("Minimum Painting cost : " + paintingHouses(costs));
        sc.close();
    }

    public static int paintingHouses(int[][] costs) {
        if (costs == null || costs.length == 0) {
            return 0;
        }

        for (int i = 1; i < costs.length; i++) {
            costs[i][0] += Math.min(costs[i - 1][1], costs[i - 1][2]);
            costs[i][1] += Math.min(costs[i - 1][0], costs[i - 1][2]);
            costs[i][2] += Math.min(costs[i - 1][0], costs[i - 1][1]);
        }

        return Math.min(Math.min(costs[costs.length - 1][0], costs[costs.length - 1][1]), costs[costs.length - 1][2]);
    }
}