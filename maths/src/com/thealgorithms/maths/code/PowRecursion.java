package com.thealgorithms.maths.code;

public class PowRecursion {



    /**
     * Returns the value of the first argument raised to the power of the second
     * argument
     *
     * @param a the base.
     * @param b the exponent.
     * @return the value {@code a}<sup>{@code b}</sup>.
     */
    public static long pow(int a, int b) {
        return b == 0 ? 1 : a * pow(a, b - 1);
    }
    
}
