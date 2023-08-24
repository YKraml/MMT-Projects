package com.thealgorithms.maths.code;

public class PiNilakantha {



    /**
     * @param iterations number of times the infinite series gets repeated Pi
     * get more accurate the higher the value of iterations is Values from 0 up
     * to 500 are allowed since double precision is not sufficient for more than
     * about 500 repetitions of this algorithm
     * @return the pi value of the calculation with a precision of x iteration
     */
    public static double calculatePi(int iterations) {
        if (iterations < 0 || iterations > 500) {
            throw new IllegalArgumentException("Please input Integer Number between 0 and 500");
        }

        double pi = 3;
        int divCounter = 2;

        for (int i = 0; i < iterations; i++) {
            if (i % 2 == 0) {
                pi = pi + 4.0 / (divCounter * (divCounter + 1) * (divCounter + 2));
            } else {
                pi = pi - 4.0 / (divCounter * (divCounter + 1) * (divCounter + 2));
            }

            divCounter += 2;
        }
        return pi;
    }
    
    
}
