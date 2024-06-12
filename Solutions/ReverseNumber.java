import java.util.Scanner;

public class ReverseNumber {

    public static int reverseNumber(int n) {
        boolean isNegative;
        if (n < 0) {
            isNegative = true;
            n = n * -1;
        } else {
            isNegative = false;
        }
        int output = 0;
        while (n > 0) {
            output = output * 10 + (n % 10);
            n /= 10;
        }
        if (isNegative == true) {
            output *= -1;
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        System.out.print(reverseNumber(num));
        sc.close();
    }
}
