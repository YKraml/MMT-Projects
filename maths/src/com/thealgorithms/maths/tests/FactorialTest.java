package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.Factorial;

class FactorialTest {

  @Test
  void test() {;
    assertTrue(Factorial.factorial(5) == 120);
    assertTrue(Factorial.factorial(10) == 3628800);
  }
  
  @Test
  void test2() {
    assertTrue(Factorial.factorial(0) == 1);
    assertTrue(Factorial.factorial(1) == 1);
  }
  
  

}
