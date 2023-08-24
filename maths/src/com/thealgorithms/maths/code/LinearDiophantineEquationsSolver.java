package com.thealgorithms.maths.code;

import java.util.Objects;

public final class LinearDiophantineEquationsSolver {


  public static Solution findAnySolution(final Equation equation) {
    if (equation.a() == 0 && equation.b() == 0 && equation.c() == 0) {
      return Solution.INFINITE_SOLUTIONS;
    }
    final GcdSolutionWrapper stub = new GcdSolutionWrapper(0, new Solution(0, 0));
    final GcdSolutionWrapper gcdSolution = gcd(equation.a(), equation.b(), stub);
    if (equation.c() % gcdSolution.getGcd() != 0) {
      return Solution.NO_SOLUTION;

    }
    final Solution toReturn = new Solution(0, 0);
    int xToSet = stub.getSolution().getX() * (equation.c() / stub.getGcd());
    int yToSet = stub.getSolution().getY() * (equation.c() / stub.getGcd());
    toReturn.setX(xToSet);
    toReturn.setY(yToSet);
    return toReturn;
  }


  private static GcdSolutionWrapper gcd(final int a, final int b,
      final GcdSolutionWrapper previous) {
    if (b == 0) {
      return new GcdSolutionWrapper(a, new Solution(1, 0));
    }
    // stub wrapper becomes the `previous` of the next recursive call
    final GcdSolutionWrapper stubWrapper = new GcdSolutionWrapper(0, new Solution(0, 0));
    final GcdSolutionWrapper next = /* recursive call */ gcd(b, a % b, stubWrapper);
    previous.getSolution().setX(next.getSolution().getY());
    previous.getSolution().setY(next.getSolution().getX() - (a / b) * (next.getSolution().getY()));
    previous.setGcd(next.getGcd());
    return new GcdSolutionWrapper(next.getGcd(), previous.getSolution());
  }





  
}
