package com.thealgorithms.maths.tests;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.AmicableNumber;

public class AmicableNumberTest {

  @Test
  void testAmicableNumber() {
    assertTrue(AmicableNumber.isAmicableNumber(220, 284));
  }
  
  @Test
  void testAmicableNumber2() {
    assertTrue(AmicableNumber.isAmicableNumber(1184, 1210));
  }
  
  
  @Test
  void testAmicableNumber3() {
    assertTrue(AmicableNumber.isAmicableNumber(2620, 2924));
  }
}
