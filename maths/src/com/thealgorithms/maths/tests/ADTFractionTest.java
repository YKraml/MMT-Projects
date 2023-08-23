package com.thealgorithms.maths.tests;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.ADTFraction;

public class ADTFractionTest {

  private final ADTFraction fraction1 = new ADTFraction(3, 5);
  private final ADTFraction fraction2 = new ADTFraction(7, 8);

  @Test
  void testConstructorWithDenominatorEqualToZero() {
    try {
      new ADTFraction(1, 0);
      fail("Expected an exception");
    } catch (Exception ex) {
      assertEquals("Denominator cannot be 0", ex.getMessage());
      assertEquals(IllegalArgumentException.class, ex.getClass());
    }

  }
  
  @Test
  public void testPlus() {
    assertEquals(new ADTFraction(59, 40), fraction1.plus(fraction2));
  }

  @Test
  public void testTimes() {
    assertEquals(new ADTFraction(12, 5), fraction1.timesInt(4));
    assertEquals(new ADTFraction(21, 40), fraction1.times(fraction2));
  }

  @Test
  public void testReciprocal() {
    assertEquals(new ADTFraction(5, 3), fraction1.reciprocal());
  }

  @Test
  public void testValue() {
    assertEquals(0.6F, fraction1.value());
  }

  @Test
  public void testEqualsAndHashCode() {
    ADTFraction fraction3 = new ADTFraction(3, 5);
    assertEquals(fraction1, fraction3);
    assertEquals(fraction3, fraction1);
  }

  @Test
  public void testEqualsAndHashCode2() {
    ADTFraction fraction3 = new ADTFraction(3, 5);
    assertEquals(fraction1.hashCode(), fraction3.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("3/5", fraction1.toString());
  }
}
