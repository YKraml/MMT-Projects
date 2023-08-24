package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.NumberOfDigits;

class NumberOfDigitsTest {

  @Test
  void test() {
    int[] numbers = {0, 12, 123, 1234, -12345, 123456, 1234567, 12345678, 123456789,};
    for (int i = 0; i < numbers.length; ++i) {
      assertTrue(NumberOfDigits.numberOfDigits(numbers[i]) == i + 1);
      assertTrue(NumberOfDigits.numberOfDigitsFast(numbers[i]) == i + 1);
      assertTrue(NumberOfDigits.numberOfDigitsFaster(numbers[i]) == i + 1);
      assertTrue(NumberOfDigits.numberOfDigitsRecursion(numbers[i]) == i + 1);
    }
    
  }

}
