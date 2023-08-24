package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.KeithNumber;

class KeithNumberTest {

  @Test
  void test1() {
    assertTrue(KeithNumber.isKeith(14));
    assertTrue(KeithNumber.isKeith(7385));
  }

  @Test
  void test2() {
    assertFalse(KeithNumber.isKeith(2342));
    assertFalse(KeithNumber.isKeith(1084050));
  }
  
  
  


}
