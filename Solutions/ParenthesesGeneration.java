import java.util.*;

public class ParenthesesGeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int N = sc.nextInt();
        List<String> output = parenthesesGeneration(N);
        System.out.println("All Possible Combinations of Parentheses : ");
        for (String out : output)
            System.out.println(out);
        sc.close();
    }

    public static List<String> parenthesesGeneration(int n) {
        List<String> output = new ArrayList<String>();
        dfs(output, "", 0, 0, n);
        return output;
    }

    public static void dfs(List<String> output, String currentString, int open, int close, int max) {
        if (currentString.length() == max * 2) {
            output.add(currentString);
            return;
        }

        if (open < max)
            dfs(output, currentString + "(", open + 1, close, max);
        if (close < open)
            dfs(output, currentString + ")", open, close + 1, max);
    }
}
