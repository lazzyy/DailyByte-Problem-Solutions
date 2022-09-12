import java.util.*;

public class StringPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String input = sc.next();
        List<String> out = stringPermutations(input);
        System.out.println(out);
        sc.close();
    }

    public static List<String> stringPermutations(String s) {
        LinkedList<String> result = new LinkedList<String>();
        result.add(s);
        int size = s.length();
        for (int i = size - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            if (Character.isAlphabetic(currentChar)) {
                int n = result.size();
                while (n-- > 0) {
                    String temp = result.poll();
                    String leftTemp = temp.substring(0, i);
                    String rightTemp = temp.substring(i + 1, size);
                    result.add(leftTemp + Character.toLowerCase(currentChar) + rightTemp);
                    result.add(leftTemp + Character.toUpperCase(currentChar) + rightTemp);
                }
            }
        }
        return result;
    }
}