import java.util.*;

public class GymLockers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int N = sc.nextInt();
        System.out.println("Number of Lockers open : " + gymLockers(N));
        sc.close();
    }

    public static int gymLockers(int n) {
        return (int) Math.sqrt(n);
    }
}
