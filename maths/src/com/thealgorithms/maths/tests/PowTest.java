package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.Pow;

class PowTest {

  @Test
  void test() {

    assertTrue(Pow.pow(2, 0) == Math.pow(2, 0)); // == 1
    assertTrue(Pow.pow(0, 2) == Math.pow(0, 2)); // == 0
    assertTrue(Pow.pow(2, 10) == Math.pow(2, 10)); // == 1024
    assertTrue(Pow.pow(10, 2) == Math.pow(10, 2)); // == 100

  }
  
  

}
