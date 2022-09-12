package SortingTechniques;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = { 82, 62, 45, 38, 96, 63, 37, 33, 32, 90, 100, 53, 35, 95, 74 };
        // System.out.printf("Before Sort:\n" + Arrays.toString(arr) + "\n");
        // System.out.println("During Sort:");
        insertionSort(arr);
        // System.out.println("After Sort:");
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                } else {
                    break;
                }
            }
            // System.out.println(Arrays.toString(nums));
        }
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
