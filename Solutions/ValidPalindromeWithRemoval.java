import java.util.Scanner;

public class ValidPalindromeWithRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();

        if (isValidPalindromeWithRemoval(str)) {
            System.out.println(str + " is a Valid Palindrome with Removal.");
        } else {
            System.out.println(str + " is Not a Valid Palindrome with Removal.");
        }
        sc.close();
    }

    public static boolean isValidPalindromeWithRemoval(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindrome(String str, int left, int right) {
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
