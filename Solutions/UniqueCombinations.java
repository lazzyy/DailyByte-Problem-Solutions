import java.util.*;

public class UniqueCombinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of numbers : ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.print("Enter numbers : ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        List<List<Integer>> out = uniqueCombinations(nums, target);
        System.out.println("All Possible Unique Combinations : ");
        System.out.println(Arrays.deepToString(out.toArray()));
        sc.close();
    }

    public static List<List<Integer>> uniqueCombinations(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, nums, target, ans, new ArrayList<>());
        return ans;
    }

    public static void findCombinations(int index, int[] nums, int target, List<List<Integer>> ans,
            List<Integer> currentAns) {
        if (index == nums.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(currentAns));
            }
            return;
        }

        if (nums[index] <= target) {
            currentAns.add(nums[index]);
            findCombinations(index, nums, target - nums[index], ans, currentAns);
            currentAns.remove(currentAns.size() - 1);
        }
        findCombinations(index + 1, nums, target, ans, currentAns);
    }
}
