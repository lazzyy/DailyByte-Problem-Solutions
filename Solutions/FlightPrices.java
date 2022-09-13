import java.util.*;

public class FlightPrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of flights : ");
        int size = sc.nextInt();
        System.out.println("Enter flight prices : ");
        int[][] prices = new int[size][2];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter Cost to send to A Office for flight %d: ", i);
            prices[i][0] = sc.nextInt();
            System.out.printf("Enter Cost to send to B Office for flight %d: ", i);
            prices[i][1] = sc.nextInt();
        }

        System.out.println("Minimum cost the company must pay for all their flights : " + flightPrices(prices));
        sc.close();
    }

    public static int flightPrices(int[][] prices) {
        List<Integer> diff = new ArrayList<Integer>();
        int minCost = 0;
        for (int i = 0; i < prices.length; i++) {
            minCost += prices[i][0];
            diff.add(prices[i][1] - prices[i][0]);
        }
        Collections.sort(diff);
        for (int i = 0; i < prices.length / 2; i++) {
            minCost += diff.get(i);
        }
        return minCost;
    }
}