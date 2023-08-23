package com.thealgorithms.maths.code;

import java.util.ArrayList;

/**
 * Class for calculating the Fast Fourier Transform (FFT) of a discrete signal using the Bluestein's
 * algorithm.
 *
 * @author Ioannis Karavitsis
 * @version 1.0
 */
public class FFTBluestein {


  
  /**
   * Bluestein's FFT Algorithm.
   *
   * <p>
   * More info: https://en.wikipedia.org/wiki/Chirp_Z-transform#Bluestein.27s_algorithm
   * http://tka4.org/materials/lib/Articles-Books/Numerical%20Algorithms/Hartley_Trasform/Bluestein%27s%20FFT%20algorithm%20-%20Wikipedia,%20the%20free%20encyclopedia.htm
   *
   * @param x The discrete signal which is then converted to the FFT or the IFFT of signal x.
   * @param inverse True if you want to find the inverse FFT.
   */
  public static void fftBluestein(ArrayList<Complex> x, boolean inverse) {
    int N = x.size();
    int bnSize = 2 * N - 1;
    int direction = inverse ? -1 : 1;
    ArrayList<Complex> an = new ArrayList<>();
    ArrayList<Complex> bn = new ArrayList<>();

    /*
     * Initialization of the b(n) sequence (see Wikipedia's article above for the symbols used)
     */
    for (int i = 0; i < bnSize; i++) {
      bn.add(new Complex(0, 0));
    }

    for (int p = 0; p < N; p++) {
      double angleP = (p - N + 1) * (p - N + 1) * Math.PI / N * direction;
      bn.set(p, new Complex(Math.cos(angleP), Math.sin(angleP)));
      bn.set(bnSize - p - 1, new Complex(Math.cos(angleP), Math.sin(angleP)));
    }

    /* Initialization of the a(n) sequence */
    for (int m = 0; m < N; m++) {
      double angleM = -m * m * Math.PI / N * direction;
      an.add(x.get(m).multiply(new Complex(Math.cos(angleM), Math.sin(angleM))));
    }

    ArrayList<Complex> convolution = ConvolutionFFT.convolutionFFT(an, bn);

    /* The final multiplication of the convolution with the b*(k) factor */
    for (int l = 0; l < N; l++) {
      double angleN = -1 * l * l * Math.PI / N * direction;
      Complex bk = new Complex(Math.cos(angleN), Math.sin(angleN));
      x.set(l, bk.multiply(convolution.get(l + N - 1)));
    }

    /* Divide by N if we want the inverse FFT */
    if (inverse) {
      for (int k = 0; k < N; k++) {
        Complex z = x.get(k);
        x.set(k, z.divideDouble(N));
      }
    }
  }
}
