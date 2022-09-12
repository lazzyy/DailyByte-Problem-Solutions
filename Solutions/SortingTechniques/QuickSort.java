package SortingTechniques;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        // int[] arr = { 82, 62, 45, 38, 96, 63, 37, 33, 32, 90, 100, 53, 35, 95, 74 };
        int[] arr = { 5, 4, 3, 2, 1, -8, -7, -6 };
        quickSort(arr, 0, arr.length - 1);
        // Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivotEle = nums[mid];

        while (start <= end) {
            while (nums[start] < pivotEle) {
                start++;
            }
            while (nums[end] > pivotEle) {
                end--;
            }

            if (start <= end) {
                swap(nums, start, end);
                start++;
                end--;
            }
        }
        // System.out.println(low + " " + end + " " + start + " " + high);
        quickSort(nums, low, end);
        quickSort(nums, start, high);
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
