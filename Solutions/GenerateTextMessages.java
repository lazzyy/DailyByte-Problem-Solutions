import java.util.*;

public class GenerateTextMessages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digits : ");
        String digits = sc.next();
        List<String> output = generateTextMessages(digits);
        System.out.println("Possible Text Messages : " + output);
        sc.close();
    }

    public static List<String> generateTextMessages(String digits) {
        List<String> result = new ArrayList<String>();
        if (digits.length() == 0 || digits == null) {
            return result;
        }
        String[] mapping = {
                "0",
                "1",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };

        letterCombinationsRecursive(result, digits, "", 0, mapping);
        return result;
    }

    public static void letterCombinationsRecursive(List<String> result, String digits, String current, int index,
            String[] mapping) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        String letters = mapping[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            letterCombinationsRecursive(result, digits, current + letters.charAt(i), index + 1, mapping);
        }
    }
}