import java.util.*;

public class UncommonWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence1 : ");
        String sentence1 = sc.nextLine();
        System.out.print("Enter sentence2 : ");
        String sentence2 = sc.nextLine();
        ArrayList<String> out = unCommonWords(sentence1, sentence2);

        System.out.print("Uncommon Words : ");
        for (int i = 0; i < out.size() - 1; i++) {
            System.out.printf("%s, ", out.get(i));
        }
        System.out.printf("%s.", out.get(out.size() - 1));
        sc.close();
    }

    public static ArrayList<String> unCommonWords(String s1, String s2) {
        String s = s1 + " " + s2;
        String[] sArray = s.split(" ");
        HashMap<String, Integer> hMap = new HashMap<String, Integer>();
        for (String c : sArray) {
            hMap.put(c, hMap.getOrDefault(c, 0) + 1);
        }
        ArrayList<String> out = new ArrayList<String>();
        for (Map.Entry<String, Integer> entry : hMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            if (value == 1) {
                out.add(key);
            }
        }
        return out;
    }
}
