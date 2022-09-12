import java.util.LinkedList;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<String>();
        System.out.print("Enter number of Strings : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        System.out.println("Longest Common Prefix : " + longestCommonPrefix(list));
        sc.close();
    }

    public static String longestCommonPrefix(LinkedList<String> list) {
        String longestCommonPrefix = "";
        if (list.size() == 0 || list == null) {
            return longestCommonPrefix;
        }

        int index = 0;
        for (char c : list.get(0).toCharArray()) {
            for (int i = 1; i < list.size(); i++) {
                if (index >= list.get(i).length() || c != list.get(i).charAt(index)) {
                    return longestCommonPrefix;
                }
            }
            longestCommonPrefix += c;
            index++;
        }
        return longestCommonPrefix;
    }
}
