package com.thealgorithms.maths.code;

import java.util.Arrays;
import java.util.Random;

/**
 * use quick sort algorithm to get kth largest or kth smallest element in given array
 */
public class FindKthNumber {



    public static int findKthMax(int[] nums, int k) {
        int start = 0, end = nums.length;
        while (start < end) {
            int pivot = partition(nums, start, end);
            if (k == pivot) {
                return nums[pivot];
            } else if (k > pivot) {
                start = pivot + 1;
            } else {
                end = pivot;
            }
        }
        return -1;
    }
    

    private static int partition(int[] nums, int start, int end) {
        int pivot = nums[start];
        int j = start;
        for (int i = start + 1; i < end; i++) {
            if (nums[i] < pivot) {
                j++;
                swap(nums, i, j);
            }
        }
        swap(nums, start, j);
        return j;
    }

    private static void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
