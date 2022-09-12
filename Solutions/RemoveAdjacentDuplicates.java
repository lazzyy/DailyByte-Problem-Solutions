import java.util.Scanner;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = sc.next();
        String S = removeAdjacentDuplicates(s);
        System.out.printf("After Removing Adjacent Duplicates : \"%s\".", S);
        sc.close();
    }

    public static String removeAdjacentDuplicates(String s) {
        char[] stack = new char[s.length()];
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            char currentChar = s.charAt(j);
            if (i > 0 && stack[i - 1] == currentChar) {
                i--;
            } else {
                stack[i] = currentChar;
                i += 1;
            }
        }
        return new String(stack, 0, i);
    }
}
