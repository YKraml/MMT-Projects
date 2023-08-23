package com.thealgorithms.maths.code;

/**
 * Class for linear convolution of two discrete signals
 *
 * @author Ioannis Karavitsis
 * @version 1.0
 */
public class Convolution {

    /**
     * Discrete linear convolution function. Both input signals and the output
     * signal must start from 0. If you have a signal that has values before 0
     * then shift it to start from 0.
     *
     * @param array1 The first discrete signal
     * @param array2 The second discrete signal
     * @return The convolved signal
     */
    public static double[] convolution(double[] array1, double[] array2) {
        double[] convolved = new double[array1.length + array2.length - 1];

        /*
         * 
    The discrete convolution of two signals A and B is defined as:

          A.length
    C[i] = Σ (A[k]*B[i-k])
          k=0

    It's obvious that:  0 <= k <= A.length , 0 <= i <= A.length + B.length - 2  and  0 <= i-k <=
    B.length - 1 From the last inequality we get that:  i - B.length + 1 <= k <= i and thus we get
    the conditions below.
         */
        for (int i = 0; i < convolved.length; i++) {
            convolved[i] = 0;
            int k = Math.max(i - array2.length + 1, 0);

            while (k < i + 1 && k < array1.length) {
                convolved[i] += array1[k] * array2[i - k];
                k++;
            }
        }

        return convolved;
    }
}
