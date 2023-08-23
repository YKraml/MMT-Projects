package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.Complex;

class ComplexTest2 {

  @Test
  void addTest() {
    assertEquals(new Complex(7, 8), new Complex(4, 6).add(new Complex(3, 2)));
  }

  @Test
  void subtractaddTest() {
    assertEquals(new Complex(1, 4), new Complex(4, 6).subtract(new Complex(3, 2)));
  }

  @Test
  void multiplyTest() {
    assertEquals(new Complex(14, -31), new Complex(8, -5).multiply(new Complex(3, -2)));
  }

  @Test
  void multiplyDoubleTest() {
    assertEquals(new Complex(16, -10), new Complex(8, -5).multiplyDouble(2));
  }

  
  
  @Test
  void conjugateTest() {
    assertEquals(new Complex(16, 10), new Complex(16, -10).conjugate());
  }

  @Test
  void absTest() {
    assertEquals(5, new Complex(4, 3).abs());
  }

  @Test
  void divideTest() {
    assertEquals(new Complex(2, 0), new Complex(4, 6).divide(new Complex(2, 3)));
  }

  @Test
  void divideDoubleTest() {
    assertEquals(new Complex(4, -2.5), new Complex(8, -5).divideDouble(2));
  }

}
