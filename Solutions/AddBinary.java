import java.util.Scanner;
import java.math.BigInteger;

public class AddBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        String num1 = sc.nextLine();
        System.out.print("Enter 2nd Number : ");
        String num2 = sc.nextLine();

        System.out.println("Addition of " + num1 + " & " + num2 + " is " + addBinary(num1, num2));
        sc.close();
    }

    public static String addBinary(String num1, String num2) {
        return new BigInteger(num1, 2).add(new BigInteger(num2, 2)).toString(2);
    }
}
