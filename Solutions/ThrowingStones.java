import java.util.*;

public class ThrowingStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Etner number of stones : ");
        int size = sc.nextInt();
        System.out.print("Enter stone weights : ");
        int[] stones = new int[size];
        for (int i = 0; i < size; i++) {
            stones[i] = sc.nextInt();
        }
        System.out.println("The last remaining stone weight : " + throwingStone(stones));
        sc.close();
    }

    public static int throwingStone(int[] stonesArray) {
        List<Integer> stones = new ArrayList<Integer>();
        for (int i : stonesArray) {
            stones.add(i);
        }
        while (true) {
            Collections.sort(stones);
            if (stones.size() <= 1)
                break;
            int stone1 = stones.remove(stones.size() - 1);
            int stone2 = stones.remove(stones.size() - 1);
            // System.out.println(stone1 + " " + stone2);
            if (stone1 == stone2) {
                continue;
            } else if (stone1 > stone2) {
                stones.add(Math.abs(stone1 - stone2));
            } else if (stone2 > stone1) {
                stones.add(Math.abs(stone2 - stone1));
            }
        }
        if (stones.size() == 0) {
            return 0;
        }
        return stones.get(0);
    }
}
