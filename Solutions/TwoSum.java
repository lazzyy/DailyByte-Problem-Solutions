import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> nums = new LinkedList<Integer>();

        System.out.print("Enter size : ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            nums.add(sc.nextInt());
        }
        System.out.print("Enter Target value : ");
        int target = sc.nextInt();

        if (twoSum1(nums, target)) {
            System.out.println("Target is found with the sum of Two Numbers.");
        } else {
            System.out.println("Traget is Not Found!!!");
        }
        System.out.println("--------------------------------------------");
        if (twoSum2(nums, target)) {
            System.out.println("Target is found with the sum of Two Numbers.");
        } else {
            System.out.println("Traget is Not Found!!!");
        }

        sc.close();
    }

    // TC - O(n*log(n))
    // SC - O(1)
    public static boolean twoSum1(LinkedList<Integer> nums, int target) {
        Collections.sort(nums);
        int i = 0;
        int j = nums.size() - 1;
        while (i < j) {
            if (nums.get(i) + nums.get(j) == target) {
                return true;
            } else if (nums.get(i) + nums.get(j) > target) {
                j--;
            } else if (nums.get(i) + nums.get(j) < target) {
                i++;
            }
        }
        return false;
    }

    // TC - O(n)
    // SC - O(n)
    public static boolean twoSum2(LinkedList<Integer> nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.size(); i++) {
            int difference = k - nums.get(i);
            if (map.containsKey(difference)) {
                return true;
            }
            map.put(nums.get(i), i);
        }
        return false;

    }
}
