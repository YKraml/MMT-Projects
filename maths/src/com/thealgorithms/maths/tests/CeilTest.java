package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.Ceil;

public class CeilTest {

  @Test
  void testCei1l() {
    assertEquals(8, Ceil.ceil(7.057));
    assertEquals(8, Ceil.ceil(7.004));
    assertEquals(1, Ceil.ceil(.98));
  }

  @Test
  void testCeil2() {
    assertEquals(-13, Ceil.ceil(-13.004));
    assertEquals(-11, Ceil.ceil(-11.357));
  }
  
  @Test
  void testCeil3() {
    assertEquals(12, Ceil.ceil(12));
  }
  


  

}
