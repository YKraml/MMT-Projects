package com.thealgorithms.maths.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/*
 * Find the mode of an array of numbers
 *
 * The mode of an array of numbers is the most frequently occurring number in the array,
 * or the most frequently occurring numbers if there are multiple numbers with the same frequency
 */
public class Mode {



    /*
     * Find the mode of an array of integers
     *
     * @param numbers array of integers
     * @return mode of the array
     */
  
    public static int[] mode(int[] numbers) {
        if (numbers.length == 0) {
            return null;
        }

        HashMap<Integer, Integer> count = new HashMap<>();

        for (int num : numbers) {
            if (count.containsKey(num)) {
                count.put(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }
        }

        int max = Collections.max(count.values());
        ArrayList<Integer> modes = new ArrayList<>();

        for (int num2 : count.keySet()) {
            if (count.get(num2) == max) {
                modes.add(num2);
            }
        }
        
        int[] array = new int[modes.size()];
        for (int i = 0; i < array.length; i++) {
			array[i] = modes.get(i);
		}
        
        return array;
    }
}
