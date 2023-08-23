package com.thealgorithms.maths.code;

/* This is a program to check if a number is a Krishnamurthy number or not.
A number is a Krishnamurthy number if the sum of the factorials of the digits of the number is equal
to the number itself. For example, 1, 2 and 145 are Krishnamurthy numbers. Krishnamurthy number is
also referred to as a Strong number.
 */
import java.io.*;

public class KrishnamurthyNumber {

    // returns True if the number is a Krishnamurthy number and False if it is not.

    public static boolean isKMurthy(int n) {
        // initialising the variable s that will store the sum of the factorials of the digits to 0
        int s = 0;
        // storing the number n in a temporary variable tmp
        int tmp = n;

        // Krishnamurthy numbers are positive
        if (n <= 0) {
            return false;
        } // checking if the number is a Krishnamurthy number
        else {
            while (n != 0) {
                // initialising the variable fact that will store the factorials of the digits
                int fact = 1;
                // computing factorial of each digit
                for (int i = 1; i <= n % 10; i++) {
                    fact = fact * i;
                }
                
                // computing the sum of the factorials
                s = s + fact;
                // discarding the digit for which factorial has been calculated
                n = n / 10;
            }

            // evaluating if sum of the factorials of the digits equals the number itself
            return tmp == s;
        }
    }


}
