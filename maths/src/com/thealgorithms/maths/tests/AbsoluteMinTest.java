package com.thealgorithms.maths.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.AbsoluteMax;
import com.thealgorithms.maths.code.AbsoluteMin;

public class AbsoluteMinTest {

  @Test
  void testGetMinValue() {
    assertEquals(-2, AbsoluteMin.getMinValue(3, -10, -2));
  }

  @Test
  void testGetMinValue2() {
    assertEquals(-2, AbsoluteMin.getMinValue(3, -10, -2));
  }

  
  
  @Test
  void testGetMinValueWithNoArguments() {

    try {
      AbsoluteMin.getMinValue();
      fail("Expected an exception");
    } catch (Exception e) {
      assertTrue(e instanceof IllegalArgumentException);
      assertEquals("Numbers array cannot be empty", e.getMessage());
    }

  }
}
