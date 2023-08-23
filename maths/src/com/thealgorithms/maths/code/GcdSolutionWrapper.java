package com.thealgorithms.maths.code;

import java.util.Objects;


public  final class GcdSolutionWrapper {

  private int gcd;
  private Solution solution;

  public GcdSolutionWrapper(int gcd, Solution solution) {
    this.gcd = gcd;
    this.solution = solution;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj == null || obj.getClass() != this.getClass()) {
      return false;
    }
    GcdSolutionWrapper that = (GcdSolutionWrapper) obj;
    return (this.gcd == that.gcd && Objects.equals(this.solution, that.solution));
  }

  public int getGcd() {
    return gcd;
  }

  public void setGcd(int gcd) {
    this.gcd = gcd;
  }

  public Solution getSolution() {
    return solution;
  }

  public void setSolution(Solution solution) {
    this.solution = solution;
  }

  @Override
  public int hashCode() {
    return Objects.hash(gcd, solution);
  }

  @Override
  public String toString() {
    return ("GcdSolutionWrapper[" + "gcd=" + gcd + ", " + "solution=" + solution + ']');
  }
}
