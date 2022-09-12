import java.util.Arrays;
import java.util.Scanner;

public class SpotTheDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s : ");
        String s = sc.next();
        System.out.print("Enter t : ");
        String t = sc.next();
        char difference = spotTheDifference(s, t);
        if (difference != ' ') {
            System.out.println("\'" + difference + "\' is not in s but is available in t.");
        } else {
            System.out.println("There are no additional Random Character.");
        }
        System.out
                .println("\'" + spotTheDifference2(s, t)
                        + "\' is not in s but is available in t.(Using another Method)");
        sc.close();
    }

    public static char spotTheDifference(String s, String t) {
        char[] tempSArray = s.toCharArray();
        Arrays.sort(tempSArray);
        char[] tempTArray = t.toCharArray();
        Arrays.sort(tempTArray);
        for (int i = 0; i < tempTArray.length; i++) {
            if (i >= tempSArray.length) {
                return tempTArray[i];
            }
            if (tempTArray[i] != tempSArray[i]) {
                return tempTArray[i];
            }
        }
        return ' ';
    }

    public static char spotTheDifference2(String s, String t) {
        char temp = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            temp ^= s.charAt(i);
        }
        for (char c : t.toCharArray()) {
            temp ^= c;
        }
        return temp;

    }
}
