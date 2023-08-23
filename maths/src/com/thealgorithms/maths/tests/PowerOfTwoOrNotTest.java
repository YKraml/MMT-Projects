package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.PowerOfTwoOrNot;

class PowerOfTwoOrNotTest {

  @Test
  void test() {
    assertTrue(PowerOfTwoOrNot.checkIfPowerOfTwoOrNot(1));
    assertTrue(PowerOfTwoOrNot.checkIfPowerOfTwoOrNot(8));
    assertTrue(PowerOfTwoOrNot.checkIfPowerOfTwoOrNot(16));
    assertTrue(PowerOfTwoOrNot.checkIfPowerOfTwoOrNot(1024));
  }

  @Test
  void test2() {
    assertTrue(!PowerOfTwoOrNot.checkIfPowerOfTwoOrNot(0));
    assertTrue(!PowerOfTwoOrNot.checkIfPowerOfTwoOrNot(1023));
  }
  
  

}
