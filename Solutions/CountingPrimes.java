import java.util.Scanner;

public class CountingPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N to see the number of prime numbers less than N : ");
        int N = sc.nextInt();
        System.out.println("Number of Primes less than " + N + " are " + countingPrimes(N));
        sc.close();
    }

    public static int countingPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
