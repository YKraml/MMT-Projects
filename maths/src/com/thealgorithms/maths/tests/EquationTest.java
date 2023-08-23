package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.Equation;

class EquationTest {

  @Test
  void test1() {
    Equation equation = new Equation(1, 2, 3);
    Equation equation2 = new Equation(1, 2, 3);
    Equation equation3 = new Equation(0, 0, 0);
    String differentObject = "";

    assertTrue(equation.equals(equation2));
    assertTrue(equation2.equals(equation));
    assertFalse(equation.equals(differentObject));
  }

}
