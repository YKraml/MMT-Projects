package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.JugglerSequence;

class JugglerSequenceTest {

  @Test
  void test() {
    assertEquals("3,5,11,36,6,2,1", JugglerSequence.jugglerSequence(3));
  }

  
}
