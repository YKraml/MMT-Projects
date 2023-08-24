package com.thealgorithms.maths.code;

public class FactorialRecursion {


    /**
     * Recursive FactorialRecursion Method
     *
     * @param n The number to factorial
     * @return The factorial of the number
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("number is negative");
        }
        return n == 0 || n == 1 ? 1 : n * factorial(n - 1);
    }
    
}
