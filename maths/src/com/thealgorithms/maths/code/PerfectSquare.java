package com.thealgorithms.maths.code;

/**
 * https://en.wikipedia.org/wiki/Perfect_square
 */
public class PerfectSquare {

 

    /**
     * Check if a number is perfect square number
     *
     * @param number the number to be checked
     * @return <tt>true</tt> if {@code number} is perfect square, otherwise
     * <tt>false</tt>
     */
    public static boolean isPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }
    
    
}
