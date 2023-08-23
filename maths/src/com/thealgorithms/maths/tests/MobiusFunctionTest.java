package com.thealgorithms.maths.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.AbsoluteMin;
import com.thealgorithms.maths.code.MobiusFunction;

class MobiusFunctionTest {

  @Test
  void testMobiusForZero() {
    // given
    int number = 0;
    String expectedMessage = "Number must be greater than zero.";



    try {
      MobiusFunction.mobius(number);
      fail("Expected an exception");
    } catch (Exception e) {
      assertTrue(e instanceof IllegalArgumentException);
      assertEquals(expectedMessage, e.getMessage());
    }
  }

  @Test
  void testMobiusForNegativeNumber() {
    // given
    int number = -1;
    String expectedMessage = "Number must be greater than zero.";



    try {
      MobiusFunction.mobius(number);
      fail("Expected an exception");
    } catch (Exception e) {
      assertTrue(e instanceof IllegalArgumentException);
      assertEquals(expectedMessage, e.getMessage());
    }
  }
  
  

  @Test
  void testMobiusFunction() {
    int[] expectedResultArray = {1, -1, -1, 0, -1, 1, -1, 0, 0, 1, -1, 0, -1, 1, 1, 0, -1, 0, -1, 0,
        1, 1, -1, 0, 0, 1, 0, 0, -1, -1, -1, 0, 1, 1, 1, 0, -1, 1, 1, 0, -1, -1, -1, 0, 0, 1, -1, 0,
        0, 0, 1, 0, -1, 0, 1, 0, 1, 1, -1, 0, -1, 1, 0, 0, 1, -1, -1, 0, 1, -1, -1, 0, -1, 1, 0, 0,
        1, -1, -1, 0, 0, 1, -1, 0, 1, 1, 1, 0, -1, 0, 1, 0, 1, 1, 1, 0, -1, 0, 0, 0,};

    for (int i = 1; i <= 100; i++) {
      // given
      int expectedValue = expectedResultArray[i - 1];

      // when
      int actualValue = MobiusFunction.mobius(i);

      // then
      assertEquals(expectedValue, actualValue);
    }
  }
}
