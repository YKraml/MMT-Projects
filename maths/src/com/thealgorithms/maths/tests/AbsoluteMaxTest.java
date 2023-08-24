package com.thealgorithms.maths.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import com.thealgorithms.maths.code.AbsoluteMax;

public class AbsoluteMaxTest {

  @Test
  void testGetMaxValue() {
    assertEquals(16, AbsoluteMax.getMaxValue(-2, 0, 16));
    assertEquals(-22, AbsoluteMax.getMaxValue(-3, -10, -22));
  }

  @Test
  void testGetMaxValue2() {
    assertEquals(-888, AbsoluteMax.getMaxValue(-888));
  }

  
  
  
  @Test
  void testGetMaxValueWithNoArguments() {
    
    try {
      AbsoluteMax.getMaxValue();
      fail("Expected an exception");
   } catch (Exception e) {
      assertTrue(e instanceof IllegalArgumentException);
   }
    
 
  }
}
