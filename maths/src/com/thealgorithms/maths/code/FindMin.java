package com.thealgorithms.maths.code;

import java.util.Arrays;
import java.util.Random;

public class FindMin {

    /**
     * @brief finds the minimum value stored in the input array
     *
     * @param array the input array
     * @exception IllegalArgumentException input array is empty
     * @return the mimum value stored in the input array
     */
    public static int findMin(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("array must be non-empty.");
        }
        int min = Integer.MAX_VALUE;
        for (final int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
    
}
