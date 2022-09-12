import java.util.Scanner;

public class PopsicleStand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of customers : ");
        int size = sc.nextInt();
        System.out.print("Enter customers : ");
        int[] customers = new int[size];
        for (int i = 0; i < size; i++) {
            customers[i] = sc.nextInt();
        }
        if (popsicleStand(customers)) {
            System.out.println("Every Customer is serviced properly with proper change.");
        } else {
            System.out.println("Customers can't be serviced due to lack of change.");
        }
        sc.close();
    }

    public static boolean popsicleStand(int[] customers) {
        int fives = 0, tens = 0;
        for (int customer : customers) {
            if (customer == 5) {
                fives++;
            } else if (customer == 10) {
                tens++;
                fives--;
            } else if (tens > 0) {
                tens--;
                fives--;
            } else {
                fives -= 3;
            }
            if (fives < 0)
                return false;
        }
        return true;
    }
}
