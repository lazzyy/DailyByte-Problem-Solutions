package SortingTechniques;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1, 8, 0, -1, 6, -8 };
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    // TC:O(n*Log(n))
    static void mergeSort(int[] nums, int start, int end) {
        if ((end - start) == 1) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid, end);

        merge(nums, start, mid, end);
    }

    static void merge(int[] nums, int start, int mid, int end) {
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (nums[i] < nums[j]) {
                mix[k] = nums[i];
                i++;
            } else {
                mix[k] = nums[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            mix[k] = nums[i];
            i++;
            k++;
        }
        while (j < end) {
            mix[k] = nums[j];
            j++;
            k++;
        }

        for (int it = 0; it < mix.length; it++) {
            nums[start + it] = mix[it];
        }
    }
}
