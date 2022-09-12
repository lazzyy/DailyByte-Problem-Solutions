import java.util.HashMap;
import java.util.Scanner;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.next();
        System.out.println(firstUniqueCharacter(str));
        sc.close();
    }

    public static int firstUniqueCharacter(String str) {
        HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (!hMap.containsKey(str.charAt(i))) {
                hMap.put(str.charAt(i), i);
            } else {
                hMap.put(str.charAt(i), -1);
            }
        }
        int min = Integer.MAX_VALUE;
        for (char c : hMap.keySet()) {
            if (hMap.get(c) > -1 && hMap.get(c) < min) {
                min = hMap.get(c);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
