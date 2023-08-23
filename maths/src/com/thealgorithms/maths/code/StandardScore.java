package com.thealgorithms.maths.code;

public class StandardScore {

    public static double zScore(double num, double mean, double stdDev) {
        return (num - mean) / stdDev;
    }
    
    
}
