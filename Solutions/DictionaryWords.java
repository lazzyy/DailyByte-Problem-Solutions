import java.util.*;

public class DictionaryWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = sc.next();
        System.out.print("Enter dictionary length : ");
        int lengthDictionary = sc.nextInt();
        System.out.print("Enter dictionary values : ");
        List<String> wordDict = new ArrayList<String>();
        for (int i = 0; i < lengthDictionary; i++) {
            wordDict.add(sc.next());
        }
        System.out.println("The word is available in dictionary : " + wordBreak(s, wordDict));
        sc.close();
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] dp = new Boolean[s.length()];
        return helper(s, 0, wordDict, dp);
    }

    public static boolean helper(String s, int i, List<String> list, Boolean[] dp) {
        if (i == s.length()) {
            return true;
        }
        if (dp[i] != null) {
            return dp[i];
        }
        for (int j = i; j <= s.length(); j++) {
            String sub = s.substring(i, j);
            if (list.contains(sub)) {
                if (helper(s, j, list, dp)) {
                    return dp[i] = true;
                }
            }
        }
        return dp[i] = false;
    }
}
