package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.TrinomialTriangle;

class TrinomialTriangleTest {

  @Test
  void test1() {
    assertEquals(2850, TrinomialTriangle.TrinomialValue(10, 4));
  }
  
  @Test
  void test2() {
    assertEquals(1, TrinomialTriangle.TrinomialValue(1, 0));
  }
  

}
