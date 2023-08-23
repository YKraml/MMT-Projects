package com.thealgorithms.maths.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.LeastCommonMultiple;

public class LeastCommonMultipleTest {

  /*
   * Test for first number greater than second number
   */
  @Test
  public void testForFirst() {
    int result = LeastCommonMultiple.lcm(6, 8);
    int expected = 24;
    Assertions.assertEquals(result, expected);
  }

  /*
   * Test for second number greater than first number
   */
  @Test
  public void testForSecond() {
    int result = LeastCommonMultiple.lcm(8, 6);
    int expected = 24;
    Assertions.assertEquals(result, expected);
  }

  @Test
  public void test3() {
    int result = LeastCommonMultiple.lcm(12, 6);
    int expected = 12;
    Assertions.assertEquals(result, expected);
  }



}
