package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.KrishnamurthyNumber;

class KrishnamurthyNumberTest {

  @Test
  void test1() {
    assertTrue(KrishnamurthyNumber.isKMurthy(145));
  }
  
  @Test
  void test2() {
    assertFalse(KrishnamurthyNumber.isKMurthy(14));
  }

  
  
}
