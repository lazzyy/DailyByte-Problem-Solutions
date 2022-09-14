import java.util.Scanner;

public class MessageDecryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String message = sc.next();
        System.out.print("Number of ways which can be decrypted : " + messageDecryption(message));
        sc.close();
    }

    public static int messageDecryption(String message) {
        int[] dp = new int[message.length() + 1];
        dp[0] = 1;
        dp[1] = message.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i <= message.length(); i++) {
            int oneDigit = Integer.valueOf(message.substring(i - 1, i));
            int twoDigits = Integer.valueOf(message.substring(i - 2, i));
            if (oneDigit >= 1) {
                dp[i] += dp[i - 1];
            }

            if (twoDigits >= 10 && twoDigits <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[message.length()];
    }
}
