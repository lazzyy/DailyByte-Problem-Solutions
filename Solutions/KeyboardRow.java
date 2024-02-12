import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KeyboardRow {
    public static String getRow(char ch, String[] rows) {
        for (String row : rows) {
            if (row.contains(Character.toString(ch))) {
                return row;
            }
        }
        return "";
    }

    public static String[] keyboardRow(String[] words) {
        List<String> result = new ArrayList<>();
        String[] keyboardRows = { "qwertyuiop", "asdfghjkl", "zxcvbnm" };
        for (String word : words) {
            boolean singleRow = true;
            char firstChar = word.charAt(0);
            String row = getRow(firstChar, keyboardRows);

            for (int i = 1; i < word.length(); i++) {
                char c = word.charAt(i);
                if (!row.contains(Character.toString(c))) {
                    singleRow = false;
                    break;
                }
            }
            if (singleRow) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter words : ");
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        String[] outputString = keyboardRow(words);
        if (outputString.length != 0) {
            for (int i = 0; i < outputString.length; i++) {
                System.out.print(outputString[i] + " ");
            }
        } else {
            System.out.println("No words are of single row in keyboard.");
        }
        sc.close();
    }
}
