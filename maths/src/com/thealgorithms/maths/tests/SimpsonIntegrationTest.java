package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.SimpsonIntegration;

class SimpsonIntegrationTest {

  @Test
  void test() {

    SimpsonIntegration integration = new SimpsonIntegration();

    // Give random data for the example purposes
    int N = 16;
    double a = 1;
    double b = 3;

    // Check so that N is even
    if (N % 2 != 0) {
      System.out.println("N must be even number for Simpsons method. Aborted");
      System.exit(1);
    }

    // Calculate step h and evaluate the integral
    double h = (b - a) / (double) N;
    double integralEvaluation = integration.simpsonsMethod(N, h, a);

    assertEquals(0.2793534789079481, integralEvaluation, 0.001);
  }

  
}
