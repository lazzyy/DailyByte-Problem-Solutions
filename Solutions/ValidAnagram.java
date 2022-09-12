import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s : ");
        String s = sc.next();
        System.out.print("Enter t : ");
        String t = sc.next();
        if (validAnagram(s, t)) {
            System.out.println(t + " is an anagram of " + s);
        } else {
            System.out.println(t + " is not an anagram of " + s);
        }
        sc.close();
    }

    public static boolean validAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for (int i : counts) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
