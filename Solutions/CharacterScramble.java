import java.util.*;

public class CharacterScramble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Passage : ");
        String passage = sc.nextLine();
        System.out.print("Enter Text : ");
        String text = sc.nextLine();
        System.out.println(characterScramble(passage, text));
        sc.close();
    }

    private static boolean characterScramble(String passage, String text) {
        HashMap<Character, Integer> textMap = new HashMap<>();
        for (Character ch : text.toCharArray()) {
            textMap.put(ch, textMap.getOrDefault(ch, 0) + 1);
        }

        for (Character ch : passage.toCharArray()) {
            // System.out.println(textMap.get(ch) + " + " + ch);
            textMap.put(ch, textMap.getOrDefault(ch, 0) - 1);
            if (textMap.get(ch) < 0) {
                return false;
            }
        }
        return true;
    }
}
