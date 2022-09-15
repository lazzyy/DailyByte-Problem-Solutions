import java.util.*;

public class RiverCrossing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of stones : ");
        int size = sc.nextInt();
        int[] stones = new int[size];
        System.out.print("Enter stones : ");
        for (int i = 0; i < size; i++) {
            stones[i] = sc.nextInt();
        }
        if (riverCrossing(stones)) {
            System.out.print("The river can be passed.");
        } else {
            System.out.print("The river can't be passed.");
        }
        sc.close();
    }

    public static boolean riverCrossing(int[] stones) {
        for (int i = 3; i < stones.length; i++) {
            if (stones[i] > stones[i - 1] * 2) {
                return false;
            }
        }

        HashSet<Integer> stonePositions = new HashSet<>();
        for (int stone : stones) {
            stonePositions.add(stone);
        }

        int lastStone = stones[stones.length - 1];
        Stack<Integer> positions = new Stack<>();
        Stack<Integer> jumps = new Stack<>();
        positions.add(0);
        jumps.add(0);
        while (!positions.isEmpty()) {
            int position = positions.pop();
            int jumpDistance = jumps.pop();
            for (int i = jumpDistance - 1; i <= jumpDistance + 1; i++) {
                if (i <= 0) {
                    continue;
                }

                int nextPosition = position + i;
                if (nextPosition == lastStone) {
                    return true;
                } else if (stonePositions.contains(nextPosition)) {
                    positions.add(nextPosition);
                    jumps.add(i);
                }
            }
        }
        return false;
    }
}
