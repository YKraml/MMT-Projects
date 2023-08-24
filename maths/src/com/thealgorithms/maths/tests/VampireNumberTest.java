package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.VampireNumber;

class VampireNumberTest {

  @Test
  void test1() {
    assertTrue(VampireNumber.isVampireNumber(21, 60, false));
    assertTrue(VampireNumber.isVampireNumber(80, 86, false));
  }

  @Test
  void test2() {
    assertFalse(VampireNumber.isVampireNumber(20, 60, false));
  }

  @Test
  void test3() {
    assertFalse(VampireNumber.isVampireNumber(20, 300, true));
  }

  @Test
  void test4() {
    assertFalse(VampireNumber.isVampireNumber(0, 0, true));
  }

  @Test
  void test5() {
    assertFalse(VampireNumber.isVampireNumber(3, 51, true));
  }

  @Test
  void test6() {
    assertTrue(VampireNumber.isVampireNumber(6, 21, true));
  }

  @Test
  void test7() {
    assertFalse(VampireNumber.isVampireNumber(51, 3, true));
  }



}
