import java.util.Scanner;

public class FlipFloppingBits {
    public static boolean flipFloppingBits(int n) {
        String binaryN = Integer.toBinaryString(n);
        for (int i = 1; i < binaryN.length(); i++) {
            if (binaryN.charAt(i) == binaryN.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        if (flipFloppingBits(n)) {
            System.out.println("Yes " + n + " has alternating bit values.");
        } else {
            System.out.println("No " + n + " doesn't contain alternating bits");
        }
        sc.close();

    }
}
