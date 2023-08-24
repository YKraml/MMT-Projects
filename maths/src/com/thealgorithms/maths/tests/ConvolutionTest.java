package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.Convolution;

class ConvolutionTest {

  @Test
  void test1() {

    assertArrayEquals(new double[] {0.5, 0.7, 1, 0.5, 0.3, 0, 0, 0},
        Convolution.convolution(new double[] {1, 1, 1, 0, 0, 0}, new double[] {0.5, 0.2, 0.3}));

  }

  @Test
  void test2() {

    assertArrayEquals(new double[] {1},
        Convolution.convolution(new double[] {1}, new double[] {1}));

  }
  
  

}
