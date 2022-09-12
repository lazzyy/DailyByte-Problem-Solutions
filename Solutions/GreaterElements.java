import java.util.*;

public class GreaterElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter nums1 size : ");
        int nums1Size = sc.nextInt();
        System.out.print("Enter nums1 elements : ");
        int[] nums1 = new int[nums1Size];
        for (int i = 0; i < nums1Size; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter nums2 size : ");
        int nums2Size = sc.nextInt();
        System.out.print("Enter nums2 elements : ");
        int[] nums2 = new int[nums2Size];
        for (int i = 0; i < nums2Size; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] output = greaterElements(nums1, nums2);
        System.out.println(Arrays.toString(output));
        sc.close();
    }

    public static int[] greaterElements(int[] nums1, int[] nums2) {
        int[] output = new int[nums1.length];
        HashMap<Integer, Integer> nextGreater = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreater.put(stack.pop(), num);
            }
            stack.push(num);
        }
        for (int i = 0; i < nums1.length; i++) {
            output[i] = nextGreater.getOrDefault(nums1[i], -1);
        }
        return output;
    }
}
