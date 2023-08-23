package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.JosephusProblem;

public class JosephusProblemTest {

  @Test
  void testJosephusProblem() {
    assertEquals(3, JosephusProblem.findTheWinner(5, 2));
  }

  @Test
  void testJosephusProblem2() {
    assertEquals(5, JosephusProblem.findTheWinner(6, 4));
  }
  
  
}
