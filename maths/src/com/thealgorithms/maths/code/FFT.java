package com.thealgorithms.maths.code;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Class for calculating the Fast Fourier Transform (FFT) of a discrete signal using the
 * Cooley-Tukey algorithm.
 *
 * @author Ioannis Karavitsis
 * @version 1.0
 */
public class FFT {


  

  /**
   * Iterative In-Place Radix-2 Cooley-Tukey Fast Fourier Transform Algorithm with Bit-Reversal. The
   * size of the input signal must be a power of 2. If it isn't then it is padded with zeros and the
   * output FFT will be bigger than the input signal.
   *
   * <p>
   * More info: https://www.algorithm-archive.org/contents/cooley_tukey/cooley_tukey.html
   * https://www.geeksforgeeks.org/iterative-fast-fourier-transformation-polynomial-multiplication/
   * https://en.wikipedia.org/wiki/Cooley%E2%80%93Tukey_FFT_algorithm
   * https://cp-algorithms.com/algebra/fft.html
   * 
   * @param x The discrete signal which is then converted to the FFT or the IFFT of signal x.
   * @param inverse True if you want to find the inverse FFT.
   * @return
   */
  public static ArrayList<Complex> fft(ArrayList<Complex> x, boolean inverse) {
    /* Pad the signal with zeros if necessary */
    int N = x.size();
    int log2N = findLog2(N);
    x = fftBitReversal(N, log2N, x);
    int direction = inverse ? -1 : 1;
    for (int len = 2; len <= N; len *= 2) {
      double angle = -2 * Math.PI / len * direction;
      Complex wlen = new Complex(Math.cos(angle), Math.sin(angle));
      for (int i = 0; i < N; i += len) {
        Complex w = new Complex(1, 0);
        for (int j = 0; j < len / 2; j++) {
          Complex u = x.get(i + j);
          Complex v = w.multiply(x.get(i + j + len / 2));
          x.set(i + j, u.add(v));
          x.set(i + j + len / 2, u.subtract(v));
          w = w.multiply(wlen);
        }
      }
    }
    x = inverseFFT(N, inverse, x);
    return x;
  }

  /* Find the log2(N) */
  public static int findLog2(int N) {
    int log2N = 0;
    while ((1 << log2N) < N) {
      log2N++;
    }
    return log2N;
  }

  /* Swap the values of the signal with bit-reversal method */
  public static ArrayList<Complex> fftBitReversal(int N, int log2N, ArrayList<Complex> x) {
    int reverse;
    for (int i = 0; i < N; i++) {
      reverse = reverseBits(i, log2N);
      if (i < reverse) {
        Collections.swap(x, i, reverse);
      }
    }
    return x;
  }

  /* Divide by N if we want the inverse FFT */
  public static ArrayList<Complex> inverseFFT(int N, boolean inverse, ArrayList<Complex> x) {
    if (inverse) {
      for (int i = 0; i < x.size(); i++) {
        Complex z = x.get(i);
        x.set(i, z.divideDouble(N));
      }
    }
    return x;
  }

  /**
   * This function reverses the bits of a number. It is used in Cooley-Tukey FFT algorithm.
   *
   * <p>
   * E.g. num = 13 = 00001101 in binary log2N = 8 Then reversed = 176 = 10110000 in binary
   *
   * <p>
   * More info: https://cp-algorithms.com/algebra/fft.html
   * https://www.geeksforgeeks.org/write-an-efficient-c-program-to-reverse-bits-of-a-number/
   *
   * @param num The integer you want to reverse its bits.
   * @param log2N The number of bits you want to reverse.
   * @return The reversed number
   */
  private static int reverseBits(int num, int log2N) {
    int reversed = 0;
    for (int i = 0; i < log2N; i++) {
      if ((num & (1 << i)) != 0) {
        reversed |= 1 << (log2N - 1 - i);
      }
    }
    return reversed;
  }
}
