package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.MinValue;

class MinValueTest {

  @Test
  void test() {
    Random rand = new Random();

    /* test 100 times using rand numbers */
    for (int i = 1; i <= 100; ++i) {
      /* generate number from -50 to 49 */
      int a = rand.nextInt(100) - 50;
      int b = rand.nextInt(100) - 50;
      assertTrue(MinValue.min(a, b) == Math.min(a, b));
    }
    
    
  }

}
