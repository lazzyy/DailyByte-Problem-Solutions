import java.util.*;

public class MaxPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of coins : ");
        int size = sc.nextInt();
        System.out.print("Enter coins : ");
        int[] coins = new int[size];
        for (int i = 0; i < size; i++) {
            coins[i] = sc.nextInt();
        }
        System.out.print("Enter E : ");
        int E = sc.nextInt();
        System.out.println("Maximum number of points : " + maxPoints(coins, E));
        sc.close();
    }

    public static int maxPoints(int[] coins, int E) {
        Arrays.sort(coins);
        int maxOfPoints = 0;
        int energies = 0;
        int i = 0;
        int j = coins.length - 1;
        while (i <= j) {
            if (E >= coins[i]) {
                energies++;
                E -= coins[i++];
                maxOfPoints = Math.max(maxOfPoints, energies);
            } else if (energies > 0) {
                energies--;
                E += coins[j--];
            } else {
                return maxOfPoints;
            }
        }
        return maxOfPoints;
    }
}
