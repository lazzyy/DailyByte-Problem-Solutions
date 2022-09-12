package SortingTechniques;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { 82, 62, 45, 38, 96, 63, 37, 33, 32, 90, 100, 53, 35, 95, 74 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = getMinIndex(nums, i, nums.length);
            swap(nums, i, minIndex);
        }
    }

    static int getMinIndex(int[] nums, int start, int end) {
        int minIndex = start;
        for (int i = start + 1; i < end; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
