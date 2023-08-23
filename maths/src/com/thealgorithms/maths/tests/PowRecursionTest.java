package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.PowRecursion;

class PowRecursionTest {

  @Test
  void test() {
    assertTrue(Double.compare(PowRecursion.pow(2, 0), Math.pow(2, 0)) == 0);
    assertTrue(Double.compare(PowRecursion.pow(0, 2), Math.pow(0, 2)) == 0);
    assertTrue(Double.compare(PowRecursion.pow(2, 10), Math.pow(2, 10)) == 0);
    assertTrue(Double.compare(PowRecursion.pow(10, 2), Math.pow(10, 2)) == 0);
  }
  
  



}
