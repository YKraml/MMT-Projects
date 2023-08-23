package com.thealgorithms.maths.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.AbsoluteMin;
import com.thealgorithms.maths.code.ReverseNumber;

public class ReverseNumberTest {

  @Test
  public void testReverseNumber() {
    HashMap<Integer, Integer> testCases = new HashMap<>();
    testCases.put(0, 0);
    testCases.put(1, 1);
    testCases.put(10, 1);
    testCases.put(123, 321);
    testCases.put(7890, 987);

    for (final Entry<Integer, Integer> tc : testCases.entrySet()) {
      assertEquals(ReverseNumber.reverseNumber(tc.getKey()), tc.getValue());
    }
  }

  @Test
  public void testReverseNumberThrowsExceptionForNegativeInput() {
    try {
      ReverseNumber.reverseNumber(-1);
      fail("Expected an exception");
    } catch (Exception e) {
      assertTrue(e instanceof IllegalArgumentException);
    }
    
    
  }

}
