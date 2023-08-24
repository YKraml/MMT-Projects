package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.VectorCrossProduct;

class VectorCrossProductTest {

  // Create two vectors
  VectorCrossProduct aaa = new VectorCrossProduct(1, -2, 3);
  VectorCrossProduct bbb = new VectorCrossProduct(2, 0, 3);

  @Test
  void test1() {
    assertEquals(new VectorCrossProduct(-6, 3, 4), aaa.crossProduct(bbb));
  }

  @Test
  void test2() {
    assertEquals(11, aaa.dotProduct(bbb));
  }


  @Test
  void test3() {
    assertEquals(3.74165, aaa.magnitude(), 0.001);
  }


  
}
