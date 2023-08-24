package com.thealgorithms.maths.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.PerfectCube;

class PerfectCubeTest {

  @Test
  public void perfectCube() {

    Assertions.assertTrue(PerfectCube.isPerfectCube(-27));
    Assertions.assertTrue(PerfectCube.isPerfectCube(-1));
    Assertions.assertTrue(PerfectCube.isPerfectCube(0));
    Assertions.assertTrue(PerfectCube.isPerfectCube(1));
    Assertions.assertTrue(PerfectCube.isPerfectCube(8));
    Assertions.assertTrue(PerfectCube.isPerfectCube(27));

  }

  
  @Test
  public void perfectCube0() {

    Assertions.assertTrue(PerfectCube.isPerfectCubeMathCbrt(-27));
    Assertions.assertTrue(PerfectCube.isPerfectCubeMathCbrt(-1));
    Assertions.assertTrue(PerfectCube.isPerfectCubeMathCbrt(0));
    Assertions.assertTrue(PerfectCube.isPerfectCubeMathCbrt(1));
    Assertions.assertTrue(PerfectCube.isPerfectCubeMathCbrt(8));
    Assertions.assertTrue(PerfectCube.isPerfectCubeMathCbrt(27));

  }

  @Test
  public void perfectCube2() {
    Assertions.assertFalse(PerfectCube.isPerfectCube(-9));
    Assertions.assertFalse(PerfectCube.isPerfectCube(2));
    Assertions.assertFalse(PerfectCube.isPerfectCube(4));
    Assertions.assertFalse(PerfectCube.isPerfectCube(30));
  }
}
