package com.thealgorithms.maths.code;

import java.util.Objects;

public class Solution {

  public static final Solution NO_SOLUTION = new Solution(Integer.MAX_VALUE, Integer.MAX_VALUE);
  public static final Solution INFINITE_SOLUTIONS =
      new Solution(Integer.MIN_VALUE, Integer.MIN_VALUE);
  private int x;
  private int y;

  public Solution(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj == null || obj.getClass() != this.getClass()) {
      return false;
    }
    Solution that = (Solution) obj;
    return this.x == that.x && this.y == that.y;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }

  @Override
  public String toString() {
    return "Solution[" + "x=" + x + ", " + "y=" + y + ']';
  }
}
