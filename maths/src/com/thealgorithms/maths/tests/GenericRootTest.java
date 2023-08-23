package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.GenericRoot;

class GenericRootTest {

  @Test
  void test() {
    int number1 = 1234;
    int result1 = GenericRoot.genericRoot(number1);

    assertEquals(1, result1);
  }

  @Test
  void test2() {
    int number2 = 12345;
    int result2 = GenericRoot.genericRoot(number2);

    assertEquals(6, result2);
  }
  
  

}
