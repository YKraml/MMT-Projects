package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Random;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.SquareRootWithNewtonRaphsonMethod;

public class SquareRootWithNewtonRaphsonMethodTest {

  @Test
  void testfor1() {
    Assertions.assertEquals(1, SquareRootWithNewtonRaphsonMethod.squareRoot(1));
  }
  
  @Test
  void testfor3() {
    Assertions.assertEquals(1.7320508075688772, SquareRootWithNewtonRaphsonMethod.squareRoot(3));
  }

  @Test
  void testfor2() {
    Assertions.assertEquals(1.414213562373095, SquareRootWithNewtonRaphsonMethod.squareRoot(2));
  }

  @Test
  void testfor625() {
    Assertions.assertEquals(25.0, SquareRootWithNewtonRaphsonMethod.squareRoot(625));
  }
  
  @Test
  void testfor1554223575() {
    Assertions.assertEquals(39423.64233, SquareRootWithNewtonRaphsonMethod.squareRoot(1554223575),0.001);
  }



}
