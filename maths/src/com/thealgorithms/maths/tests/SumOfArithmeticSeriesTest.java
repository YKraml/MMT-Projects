package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.SumOfArithmeticSeries;

class SumOfArithmeticSeriesTest {

  @Test
  void test() {
    /* 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 */
    assertTrue(Double.compare(55.0, SumOfArithmeticSeries.sumOfSeries(1, 1, 10)) == 0);

    /* 1 + 3 + 5 + 7 + 9 + 11 + 13 + 15 + 17 + 19 */
    assertTrue(Double.compare(100.0, SumOfArithmeticSeries.sumOfSeries(1, 2, 10)) == 0);

    /* 1 + 11 + 21 + 31 + 41 + 51 + 61 + 71 + 81 + 91 */
    assertTrue(Double.compare(460.0, SumOfArithmeticSeries.sumOfSeries(1, 10, 10)) == 0);

    assertTrue(Double.compare(49600.0, SumOfArithmeticSeries.sumOfSeries(1, 10, 100)) == 0);
  }

  @Test
  void test2() {

    /* 0.1 + 0.2 + 0.3 + 0.4 + 0.5 + 0.6 + 0.7 + 0.8 + 0.9 + 1.0 */
    assertTrue(Double.compare(5.5, SumOfArithmeticSeries.sumOfSeries(0.1, 0.1, 10)) == 0);
  }

  
}
