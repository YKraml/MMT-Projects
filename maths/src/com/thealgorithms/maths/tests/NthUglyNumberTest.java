package com.thealgorithms.maths.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.AbsoluteMin;
import com.thealgorithms.maths.code.NthUglyNumber;

public class NthUglyNumberTest {
  @Test
  public void testGetWithNewObject() {
    HashMap<Integer, Long> testCases = new HashMap<>();
    testCases.put(0, 1L);
    testCases.put(1, 2L);
    testCases.put(2, 3L);
    testCases.put(3, 4L);
    testCases.put(4, 5L);
    testCases.put(5, 6L);
    testCases.put(9, 12L);
    testCases.put(19, 36L);
    testCases.put(52, 270L);
    testCases.put(1078, 84934656L);
    testCases.put(1963, 6973568802L);



    for (final Entry<Integer, Long> tc : testCases.entrySet()) {
      NthUglyNumber uglyNumbers = new NthUglyNumber(new int[] {2, 3, 5});
      assertEquals(uglyNumbers.get(tc.getKey()), tc.getValue());

      NthUglyNumber otherUglyNumbers = new NthUglyNumber(new int[] {5, 25, 6, 2, 3, 5});
      assertEquals(otherUglyNumbers.get(tc.getKey()), tc.getValue());
    }
  }

  @Test
  public void testGetWithSameObject() {
    HashMap<Integer, Long> testCases = new HashMap<>();
    testCases.put(0, 1L);
    testCases.put(1, 2L);
    testCases.put(2, 3L);
    testCases.put(3, 4L);
    testCases.put(4, 5L);
    testCases.put(5, 6L);
    testCases.put(6, 7L);
    testCases.put(1499, 1984500L);
    testCases.put(1572, 2449440L);
    testCases.put(1658, 3072000L);
    testCases.put(6625, 4300800000L);

    NthUglyNumber uglyNumbers = new NthUglyNumber(new int[] {7, 2, 5, 3});
    for (final Entry<Integer, Long> tc : testCases.entrySet()) {
      assertEquals(uglyNumbers.get(tc.getKey()), tc.getValue());
    }

    assertEquals(uglyNumbers.get(999), 385875);
  }

  @Test
  public void testGetWithBase1() {
    NthUglyNumber uglyNumbers = new NthUglyNumber(new int[] {1});
    assertEquals(uglyNumbers.get(10), 1);
  }

  @Test
  public void testGetWithBase2() {
    NthUglyNumber uglyNumbers = new NthUglyNumber(new int[] {2});
    assertEquals(uglyNumbers.get(5), 32);
  }

  @Test
  public void testGetThrowsAnErrorForNegativeInput() {
    NthUglyNumber uglyNumbers = new NthUglyNumber(new int[] {1, 2});

    try {
      uglyNumbers.get(-1);
      fail("Expected an exception");
    } catch (Exception e) {
      assertTrue(e instanceof IllegalArgumentException);
    }
  }

  @Test
  public void testConstructorThrowsAnErrorForEmptyInput() {

    try {
      new NthUglyNumber(new int[] {});
      fail("Expected an exception");
    } catch (Exception e) {
      assertTrue(e instanceof IllegalArgumentException);
    }
  }
}
