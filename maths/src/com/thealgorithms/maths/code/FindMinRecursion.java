package com.thealgorithms.maths.code;

import java.util.Arrays;
import java.util.Random;

public class FindMinRecursion {



    /**
     * Get min of array using divide and conquer algorithm
     *
     * @param array contains elements
     * @param low the index of the first element
     * @param high the index of the last element
     * @return min of {@code array}
     */
    public static int min(int[] array, int low, int high) {
        if (low == high) {
            return array[low]; // or array[high]
        }

        int mid = (low + high) >>> 1;

        int leftMin = min(array, low, mid); // get min in [low, mid]
        int rightMin = min(array, mid + 1, high); // get min in [mid+1, high]

        return Math.min(leftMin, rightMin);
    }

    /**
     * Get min of array using recursion algorithm
     *
     * @param array contains elements
     * @param len length of given array
     * @return min value of {@code array}
     */
    public static int minWithoutHigh(int[] array, int len) {
        return len == 1 ? array[0] : Math.min(minWithoutHigh(array, len - 1), array[len - 1]);
    }
    
}
