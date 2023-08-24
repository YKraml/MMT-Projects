package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.AbsoluteValue;

public class AbsoluteValueTest {

  @Test
  void testGetAbsValue() {

    for (int i = 0; i < 1000; i++) {
      int number = ThreadLocalRandom.current().nextInt();
      assertEquals(Math.abs(number), AbsoluteValue.getAbsValue(number));
    }

    
  }
}
