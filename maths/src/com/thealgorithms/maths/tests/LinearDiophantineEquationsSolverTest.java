package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.Equation;
import com.thealgorithms.maths.code.GcdSolutionWrapper;
import com.thealgorithms.maths.code.LinearDiophantineEquationsSolver;
import com.thealgorithms.maths.code.Solution;

class LinearDiophantineEquationsSolverTest {

  @Test
  void test() {
    // 3x + 4y = 7
    final Equation toSolve = new Equation(3, 4, 7);
    assertEquals("Solution[x=-3, y=6]",
        LinearDiophantineEquationsSolver.findAnySolution(toSolve).toString());
  }






}
