import java.util.Scanner;
import java.lang.StringBuilder;

public class ReverseVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb = sb.append(sc.nextLine());
        StringBuilder out = reverseVowels(sb);
        System.out.println(out);
        sc.close();
    }

    public static StringBuilder reverseVowels(StringBuilder sb) {
        int i = 0, j = sb.length() - 1;
        while (i <= j) {
            if (isVowel(sb.charAt(i))) {
                while (!isVowel(sb.charAt(j))) {
                    j--;
                }
                swap(sb, i, j);
            } else if (isVowel(sb.charAt(j))) {
                while (!isVowel(sb.charAt(i))) {
                    i++;
                }
                swap(sb, i, j);
            }
            i++;
            j--;
        }
        return sb;
    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        } else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        } else
            return false;
    }

    public static void swap(StringBuilder sb, int i, int j) {
        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
    }
}
