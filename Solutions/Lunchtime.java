import java.util.*;

public class Lunchtime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter items : ");
        String items = sc.next();
        System.out.println("Number of balanced meals : " + lunctime(items));
        sc.close();
    }

    public static int lunctime(String items) {
        int foodItems = 0, drinkItems = 0, balancedMeals = 0;
        for (int i = 0; i < items.length(); i++) {
            if (items.charAt(i) == 'F') {
                foodItems++;
            } else {
                drinkItems++;
            }

            if (foodItems == drinkItems) {
                balancedMeals++;
            }
        }
        return balancedMeals;
    }
}