package com.thealgorithms.maths.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.AbsoluteMin;
import com.thealgorithms.maths.code.GCD;

public class GCDTest {

  @Test
  void test1() {
    try {
      GCD.gcd(10, -2);
      fail("Expected an exception");
    } catch (Exception e) {
      assertTrue(e instanceof ArithmeticException);
    }
  }

  @Test
  void test2() {
    try {
      GCD.gcd(10, -2);
      fail("Expected an exception");
    } catch (Exception e) {
      assertTrue(e instanceof ArithmeticException);
    }
  }

  @Test
  void test3() {
    try {
      GCD.gcd(-5, -3);
      fail("Expected an exception");
    } catch (Exception e) {
      assertTrue(e instanceof ArithmeticException);
    }
  }
  
  

  @Test
  void test4() {
    Assertions.assertEquals(GCD.gcd(0, 2), 2);
  }


  @Test
  void test5() {
    Assertions.assertEquals(GCD.gcd(10, 0), 10);
  }

  @Test
  void test6() {
    Assertions.assertEquals(GCD.gcd(1, 0), 1);
  }

  @Test
  void test7() {
    Assertions.assertEquals(GCD.gcd(9, 6), 3);
  }

  @Test
  void testArrayGcd1() {
    Assertions.assertEquals(GCD.gcdWithArray(new int[] {9, 6}), 3);
  }

  @Test
  void testArrayGcd2() {
    Assertions.assertEquals(
        GCD.gcdWithArray(new int[] {2 * 3 * 5 * 7, 2 * 5 * 5 * 5, 2 * 5 * 11, 5 * 5 * 5 * 13}), 5);
  }

  @Test
  void testArrayGcdForEmptyInput() {
    Assertions.assertEquals(GCD.gcdWithArray(new int[] {}), 0);
  }
}
