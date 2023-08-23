package com.thealgorithms.maths.code;

import java.util.Arrays;
import java.util.Random;

public class FindMax {


    /**
     * @brief finds the maximum value stored in the input array
     *
     * @param array the input array
     * @exception IllegalArgumentException input array is empty
     * @return the maximum value stored in the input array
     */
    public static int findMax(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("array must be non-empty.");
        }
        int max = Integer.MIN_VALUE;
        for (final int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
    
}
