import java.util.*;

public class ComplementaryNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Complementary of " + n + " is : " + complmentaryNumbers(n));
        sc.close();
    }

    public static int complmentaryNumbers(int n) {
        int temp = n;
        int mask = 1;
        while (temp != 0) {
            n = n ^ mask;
            mask <<= 1;
            temp >>= 1;
        }
        return n;
    }
}
