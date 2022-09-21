import java.util.*;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        System.out.print("Enter values : ");
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Longest Increasing Subsequence : " + longesIncreasingSubSequence(nums));
        sc.close();
    }

    public static int longesIncreasingSubSequence(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            int size = list.size();
            if (size == 0 || size > 0 && num > list.get(size - 1)) {
                list.add(num);
            } else {
                int insertIndex = binarySearch(list, num);
                list.set(insertIndex, num);
            }
        }
        return list.size();
    }

    public static int binarySearch(List<Integer> list, int target) {
        int lo = 0;
        int hi = list.size() - 1;

        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (list.get(mid) < target) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}
