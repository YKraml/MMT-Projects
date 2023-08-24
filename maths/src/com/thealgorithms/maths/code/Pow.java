package com.thealgorithms.maths.code;

// POWER (exponentials) Examples (a^b)
public class Pow {


    /**
     * Returns the value of the first argument raised to the power of the second
     * argument
     *
     * @param a the base.
     * @param b the exponent.
     * @return the value {@code a}<sup>{@code b}</sup>.
     */
    public static long pow(int a, int b) {
        long result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
    
    
}
