package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.LucasSeries;

public class LucasSeriesTest {
  @Test
  void lucasSeriesTwo() {
    assertEquals(2, LucasSeries.lucasSeries(1));
    assertEquals(2, LucasSeries.lucasSeriesIteration(1));
  }

  @Test
  void lucasSeriesOne() {
    assertEquals(1, LucasSeries.lucasSeries(2));
    assertEquals(1, LucasSeries.lucasSeriesIteration(2));
  }
  

  @Test
  void lucasSeriesSeven() {
    assertEquals(7, LucasSeries.lucasSeries(5));
    assertEquals(7, LucasSeries.lucasSeriesIteration(5));
  }

  @Test
  void lucasSeriesEleven() {
    assertEquals(123, LucasSeries.lucasSeries(11));
    assertEquals(123, LucasSeries.lucasSeriesIteration(11));
  }
  
  
}
