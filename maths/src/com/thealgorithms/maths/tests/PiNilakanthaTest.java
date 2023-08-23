package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.PiNilakantha;

class PiNilakanthaTest {

  @Test
  void test() {
    assertTrue(PiNilakantha.calculatePi(0) == 3.0);
    assertTrue(PiNilakantha.calculatePi(100) > 3.0);
    assertTrue(PiNilakantha.calculatePi(100) < 4.0);
  }
  
  @Test
  void test2() {
    assertEquals(PiNilakantha.calculatePi(100), Math.PI, 0.01);
  }

  
}
