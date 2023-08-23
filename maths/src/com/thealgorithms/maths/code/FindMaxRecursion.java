package com.thealgorithms.maths.code;

import java.util.Arrays;
import java.util.Random;

public class FindMaxRecursion {



    /**
     * Get max of array using divide and conquer algorithm
     *
     * @param array contains elements
     * @param low the index of the first element
     * @param high the index of the last element
     * @return max of {@code array}
     */
    public static int max(int[] array, int low, int high) {
        if (low == high) {
            return array[low]; // or array[high]
        }

        int mid = (low + high) >>> 1;

        int leftMax = max(array, low, mid); // get max in [low, mid]
        int rightMax = max(array, mid + 1, high); // get max in [mid+1, high]

        return Math.max(leftMax, rightMax);
    }

    /**
     * Get max of array using recursion algorithm
     *
     * @param array contains elements
     * @param len length of given array
     * @return max value of {@code array}
     */
    public static int maxWithNotHigh(int[] array, int len) {
        return len == 1 ? array[0] : Math.max(maxWithNotHigh(array, len - 1), array[len - 1]);
    }
    
}
