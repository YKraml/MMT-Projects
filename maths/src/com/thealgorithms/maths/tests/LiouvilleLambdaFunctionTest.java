package com.thealgorithms.maths.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.AbsoluteMin;
import com.thealgorithms.maths.code.LiouvilleLambdaFunction;

class LiouvilleLambdaFunctionTest {

  @Test
  void testLiouvilleLambdaMustThrowExceptionIfNumberIsZero() {
    // given
    int number = 0;
    String expectedMessage = "Number must be greater than zero.";


    try {
      LiouvilleLambdaFunction.liouvilleLambda(number);
      fail("Expected an exception");
    } catch (Exception e) {
      assertEquals(expectedMessage, e.getMessage());
      assertTrue(e instanceof IllegalArgumentException);
    }

  }
  
  

  @Test
  void testLiouvilleLambdaMustThrowExceptionIfNumberIsNegative() {
    // given
    int number = -1;
    String expectedMessage = "Number must be greater than zero.";

    try {
      LiouvilleLambdaFunction.liouvilleLambda(number);
      fail("Expected an exception");
    } catch (Exception e) {
      assertEquals(expectedMessage, e.getMessage());
      assertTrue(e instanceof IllegalArgumentException);
    }
  }

  @Test
  void testLiouvilleLambdaMustReturnNegativeOne() {
    // given
    int number = 11;
    int expectedOutput = -1;

    // when
    int actualOutput = LiouvilleLambdaFunction.liouvilleLambda(number);

    // then
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  void testLiouvilleLambdaMustReturnPositiveOne() {
    // given
    int number = 10;
    int expectedOutput = 1;

    // when
    int actualOutput = LiouvilleLambdaFunction.liouvilleLambda(number);

    // then
    assertEquals(expectedOutput, actualOutput);
  }
}
