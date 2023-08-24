package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.RomanNumeralUtil;

class RomanNumeralUtilTest {

  @Test
  void test() {
    assertEquals("VIII", RomanNumeralUtil.generate(8));
  }
  
  

}
