package com.thealgorithms.maths.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.Armstrong;

/**
 * @author Vivek
 * @since 15/03/22
 */
class ArmstrongTest {

  @Test
  void testIsArmstrong() {
    Armstrong armstrong = new Armstrong();
    assertTrue(armstrong.isArmstrong(0));
    assertTrue(armstrong.isArmstrong(1));
    assertTrue(armstrong.isArmstrong(153));
    assertTrue(armstrong.isArmstrong(371));
  }
  
  
  @Test
  void testIsArmstrong2() {
    Armstrong armstrong = new Armstrong();
    assertFalse(armstrong.isArmstrong(1634));
    assertFalse(armstrong.isArmstrong(200));
  }

  @Test
  public void testArmstrong() {
    Armstrong armstrong = new Armstrong();
    assertTrue(armstrong.isArmstrong(371));
  }
  
  @Test
  public void testArmstrong2() {
    Armstrong armstrong = new Armstrong();
    assertFalse(armstrong.isArmstrong(200));
  }
}
