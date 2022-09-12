import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        if (isValidPalindrome(str)) {
            System.out.println("\"" + str + "\" is a Valid Palindrome.");
        } else {
            System.out.println("\"" + str + "\" is Not a Valid Palindrome.");
        }
        sc.close();
    }

    public static boolean isValidPalindrome(String s) {
        String str = s.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (!Character.isAlphabetic(str.charAt(left))) {
                left++;
            } else if (!Character.isAlphabetic(str.charAt(right))) {
                right--;
            } else if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
