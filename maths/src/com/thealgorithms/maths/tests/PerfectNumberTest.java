package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.PerfectNumber;

class PerfectNumberTest {

  @Test
  public void perfectNumber() {
    int[] trueTestCases = {6, 28, 496, 8128, 33550336};
    for (Integer n : trueTestCases) {
      assertTrue(PerfectNumber.isPerfectNumber(n));
      assertTrue(PerfectNumber.isPerfectNumber2(n));
    }

  }

  @Test
  public void perfectNumber2() {
    int[] falseTestCases = {-6, 0, 1, 9, 123};

    for (Integer n : falseTestCases) {
      assertFalse(PerfectNumber.isPerfectNumber(n));
      assertFalse(PerfectNumber.isPerfectNumber2(n));
    }
  }

  @Test
  public void perfectNumber3() {
    for (int i = 0; i < 1000; i++) {
      assertEquals(PerfectNumber.isPerfectNumber2(i), PerfectNumber.isPerfectNumber(i));
    }
  }
  



}
