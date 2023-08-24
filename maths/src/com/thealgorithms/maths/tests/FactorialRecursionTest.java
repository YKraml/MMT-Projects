package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.FactorialRecursion;

class FactorialRecursionTest {


  @Test
  void test() {
    assertTrue(FactorialRecursion.factorial(0) == 1);
    assertTrue(FactorialRecursion.factorial(1) == 1);
  }
  
  @Test
  void test2() {
    assertTrue(FactorialRecursion.factorial(5) == 120);
    assertTrue(FactorialRecursion.factorial(10) == 3628800);
  }
  
  
  

}
