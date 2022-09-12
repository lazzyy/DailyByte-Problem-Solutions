import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class JewelsAndStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Jewels : ");
        String jewels = sc.nextLine();
        System.out.print("Enter Stones : ");
        String stones = sc.nextLine();
        System.out.println("Number of Stones that are also Jewels are : " + jewelsAndStones(jewels, stones));
        sc.close();
    }

    public static int jewelsAndStones(String jewels, String stones) {
        int jewelsCount = 0;
        HashSet<Character> st = new LinkedHashSet<Character>();
        for (char j : jewels.toCharArray()) {
            st.add(j);
        }
        for (int i = 0; i < stones.length(); i++) {
            if (st.contains(stones.charAt(i))) {
                jewelsCount++;
            }
        }
        return jewelsCount;
    }
}
