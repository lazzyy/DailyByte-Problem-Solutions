import java.util.*;

public class Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s : ");
        String s = sc.nextLine();
        System.out.print("Enter t : ");
        String t = sc.nextLine();
        System.out.println(subsequence(s, t));
        sc.close();
    }

    private static boolean subsequence(String s, String t) {
        int i = 0, j = 0, sLen = s.length(), tLen = t.length();
        if (sLen < 1) {
            return true;
        }
        char[] sCharArr = s.toCharArray();
        char[] tCharArr = t.toCharArray();
        while (i < tLen && j < sLen) {
            if (tCharArr[i] == sCharArr[j]) {
                j++;
            }
            i++;
        }
        return j == sLen;
    }
}
