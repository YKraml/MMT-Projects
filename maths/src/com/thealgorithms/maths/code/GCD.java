package com.thealgorithms.maths.code;

/**
 * This is Euclid's algorithm which is used to find the greatest common
 * denominator Overide function name gcd
 *
 * @author Oskar Enmalm 3/10/17
 */
public class GCD {

    /**
     * get greatest common divisor
     *
     * @param num1 the first number
     * @param num2 the second number
     * @return gcd
     */
    public static int gcd(int num1, int num2) {
        if (num1 < 0 || num2 < 0) {
            throw new ArithmeticException();
        }

        if (num1 == 0 || num2 == 0) {
            return Math.abs(num1 - num2);
        }

        while (num1 % num2 != 0) {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        return num2;
    }
    

    /**
     * @brief computes gcd of an array of numbers
     *
     * @param numbers the input array
     * @return gcd of all of the numbers in the input array
     */
    public static int gcdWithArray(int[] numbers) {
        int result = 0;
        for (final int number : numbers) {
            result = gcd(result, number);
        }

        return result;
    }


}
