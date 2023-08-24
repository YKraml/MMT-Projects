package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.GCDRecursion;

class GCDRecursionTest {

  @Test
  void test() {
    assertEquals(5, GCDRecursion.gcd(20, 15));
    assertEquals(8, GCDRecursion.gcd(16, 24));
    assertEquals(1, GCDRecursion.gcd(7, 32));
  }
  
  

}
