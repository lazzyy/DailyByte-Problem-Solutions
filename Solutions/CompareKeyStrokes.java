import java.util.Scanner;
import java.util.Stack;

public class CompareKeyStrokes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String1 to check : ");
        String s = sc.nextLine();
        System.out.print("Enter string2 to check : ");
        String t = sc.nextLine();
        Stack<Character> S = compareKeyStrokes(s);
        Stack<Character> T = compareKeyStrokes(t);
        if (S.equals(T)) {
            System.out.println("Both Are Same.");
        } else {
            System.out.println("Both are not the Same.");
        }
        sc.close();
    }

    public static Stack<Character> compareKeyStrokes(String tempString) {
        Stack<Character> tempStack = new Stack<>();
        for (char ch : tempString.toCharArray()) {
            if (ch != '#') {
                tempStack.push(ch);
            } else if (!tempStack.isEmpty()) {
                tempStack.pop();
            }
        }
        return tempStack;
    }
}
