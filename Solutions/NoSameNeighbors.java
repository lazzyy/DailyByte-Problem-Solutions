import java.util.Scanner;

public class NoSameNeighbors {
    public static String noSameNeighbors(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '?') {
                char prev = (i == 0) ? ' ' : chars[i - 1];
                char next = (i == chars.length - 1) ? ' ' : chars[i + 1];

                for (char c = 'a'; c <= 'z'; c++) {
                    if (c != prev && c != next) {
                        chars[i] = c;
                        break;
                    }
                }
            } else if ((i > 0 && chars[i] == chars[i - 1]) || (i < chars.length - 1 && chars[i] == chars[i + 1])) {
                return "";
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = sc.next();
        System.out.print(noSameNeighbors(s));
        sc.close();
    }
}
