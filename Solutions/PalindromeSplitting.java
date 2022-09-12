import java.util.*;

public class PalindromeSplitting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string s : ");
        String s = sc.next();
        List<List<String>> output = palindromeSplitting(s);
        for (List<String> out : output) {
            System.out.println(out);
        }
        sc.close();
    }

    public static List<List<String>> palindromeSplitting(String s) {
        List<List<String>> output = new ArrayList<>();
        helper(0, s, new ArrayList<String>(), output);
        return output;
    }

    public static void helper(int index, String s, List<String> currentAns, List<List<String>> output) {
        if (index == s.length()) {
            output.add(new ArrayList<>(currentAns));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                currentAns.add(s.substring(index, i + 1));
                helper(i + 1, s, currentAns, output);
                currentAns.remove(currentAns.size() - 1);
            }
        }
    }

    public static boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}