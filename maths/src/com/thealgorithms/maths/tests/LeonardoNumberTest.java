package com.thealgorithms.maths.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.GCD;
import com.thealgorithms.maths.code.LeonardoNumber;

public class LeonardoNumberTest {
  @Test
  void leonardoNumberNegative() {
    try {
      LeonardoNumber.leonardoNumber(-1);
      fail("Expected an exception");
    } catch (Exception e) {
      assertTrue(e instanceof ArithmeticException);
    }
  }

  @Test
  void leonardoNumberZero() {
    assertEquals(1, LeonardoNumber.leonardoNumber(0));
  }

  @Test
  void leonardoNumberOne() {
    assertEquals(1, LeonardoNumber.leonardoNumber(1));
  }

  @Test
  void leonardoNumberFive() {
    assertEquals(15, LeonardoNumber.leonardoNumber(5));
  }

  @Test
  void leonardoNumberTwenty() {
    assertEquals(21891, LeonardoNumber.leonardoNumber(20));
  }
  
  
}
