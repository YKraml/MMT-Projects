package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.HarshadNumber;

public class HarshadNumberTest {

  @Test
  public void harshadNumber0() {
    assertTrue(HarshadNumber.isHarshad(18));
    assertTrue(HarshadNumber.isHarshad(999999999));
  }

  @Test
  public void harshadNumber1() {
    assertTrue(HarshadNumber.isHarshadWithString("18"));
    assertTrue(HarshadNumber.isHarshadWithString("999999999"));
    assertTrue(HarshadNumber.isHarshadWithString("99999999999100"));
  }

  @Test
  public void harshadNumber2() {
    assertFalse(HarshadNumber.isHarshad(-18));
    assertFalse(HarshadNumber.isHarshad(19));
    assertFalse(HarshadNumber.isHarshad(0));
  }

  @Test
  public void harshadNumber3() {
    assertFalse(HarshadNumber.isHarshadWithString("-18"));
    assertFalse(HarshadNumber.isHarshadWithString("19"));
  }
  
  
}
