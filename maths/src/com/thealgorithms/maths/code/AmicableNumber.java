package com.thealgorithms.maths.code;

/**
 * Amicable numbers are two different numbers so related that the sum of the
 * proper divisors of each is equal to the other number. (A proper divisor of a
 * number is a positive factor of that number other than the number itself. For
 * example, the proper divisors of 6 are 1, 2, and 3.) A pair of amicable
 * numbers constitutes an aliquot sequence of period 2. It is unknown if there
 * are infinitely many pairs of amicable numbers. *
 *
 * <p>
 * link: https://en.wikipedia.org/wiki/Amicable_numbers *
 *
 * <p>
 * Simple Example : (220,284) 220 is divisible by {1,2,4,5,10,11,20,22,44,55,110
 * } <- Sum = 284
 * 284 is divisible by -> 1,2,4,71,142 and the Sum of that is. Yes right you
 * probably expected it 220
 */
public class AmicableNumber {

  

    /**
     * Check if {@code numberOne and numberTwo } are AmicableNumbers or not
     *
     * @param numberOne numberTwo
     * @return {@code true} if {@code numberOne numberTwo} isAmicableNumbers
     * otherwise false
     */
    public static boolean isAmicableNumber(int numberOne, int numberTwo) {
        return (recursiveCalcOfDividerSum(numberOne, numberOne) == numberTwo && numberOne == recursiveCalcOfDividerSum(numberTwo, numberTwo));
    }

    /**
     * calculated in recursive calls the Sum of all the Dividers beside it self
     *
     * @param number div = the next to test dividely by using the modulo
     * operator
     * @return sum of all the dividers
     */
    static int recursiveCalcOfDividerSum(int number, int div) {
        if (div == 1) {
            return 0;
        } else if (number % --div == 0) {
            return recursiveCalcOfDividerSum(number, div) + div;
        } else {
            return recursiveCalcOfDividerSum(number, div);
        }
    }
}
