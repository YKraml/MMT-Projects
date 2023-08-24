package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.DeterminantOfMatrix;

class DeterminantOfMatrixTest {

  @Test
  void test1() {
    assertEquals(0, DeterminantOfMatrix.determinant(
        new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}, 4));
  }
  
  @Test
  void test2() {
    assertEquals(5, DeterminantOfMatrix.determinant(
        new int[][] {{3, 8, 0, 2}, {3, 1, 8, 1}, {4, 0, 9, 1}, {3, 6, 7, 2}}, 4));
  }

  
  
}
