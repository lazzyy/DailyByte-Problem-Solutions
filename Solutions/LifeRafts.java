import java.util.Arrays;
import java.util.Scanner;

public class LifeRafts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of passengers : ");
        int size = sc.nextInt();
        System.out.print("Enter weights of passengers : ");
        int[] weights = new int[size];
        for (int i = 0; i < size; i++) {
            weights[i] = sc.nextInt();
        }
        System.out.print("Enter Limit : ");
        int limit = sc.nextInt();
        int numOfBoats = lifeRafts(weights, limit);
        System.out.println("Number of rafts required for an emergency : " + numOfBoats);
        sc.close();
    }

    public static int lifeRafts(int[] weights, int limit) {
        Arrays.sort(weights);

        int numOfBoats = 0, i = 0, j = weights.length - 1;
        while (i <= j) {
            if (weights[i] + weights[j] <= limit) {
                i++;
                j--;
            } else {
                j--;
            }
            numOfBoats++;
        }
        return numOfBoats;
    }
}
