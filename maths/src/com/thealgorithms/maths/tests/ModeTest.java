package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.Mode;

class ModeTest {

  @Test
  void test() {
    assertTrue((Mode.mode(new int[] {})) == null);
    assertTrue(Arrays.equals(Mode.mode(new int[] {5}), new int[] {5}));
  }

  @Test
  void test2() {
    assertTrue(Arrays.equals(Mode.mode(new int[] {1, 2, 3, 4, 5}), new int[] {1, 2, 3, 4, 5}));
    assertTrue(Arrays.equals(Mode.mode(new int[] {7, 9, 9, 4, 5, 6, 7, 7, 8}), new int[] {7}));
    assertTrue(Arrays.equals(Mode.mode(new int[] {7, 9, 9, 4, 5, 6, 7, 7, 9}), new int[] {7, 9}));
  }

  
  
}
