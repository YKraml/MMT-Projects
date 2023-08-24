package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.FibonacciNumber;

class FibonacciNumberTest {

  @Test
  void test() {
    assertTrue(FibonacciNumber.isFibonacciNumber(1));
    assertTrue(FibonacciNumber.isFibonacciNumber(2));
    assertTrue(FibonacciNumber.isFibonacciNumber(21));
  }
  
  @Test
  void test2() {
    assertTrue(!FibonacciNumber.isFibonacciNumber(9));
    assertTrue(!FibonacciNumber.isFibonacciNumber(10));
  }
  
  

}
