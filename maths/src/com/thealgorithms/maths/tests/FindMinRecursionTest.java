package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Random;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.FindMinRecursion;

class FindMinRecursionTest {

  @Test
  void test() {
    Random rand = new Random();

    /* rand size */
    int size = rand.nextInt(100) + 1;
    int[] array = new int[size];

    /* init array with rand numbers */
    for (int i = 0; i < size; i++) {
      array[i] = rand.nextInt() % 100;
    }

    assertTrue(FindMinRecursion.min(array, 0, array.length - 1) == Arrays.stream(array).min().getAsInt());
  }
  
  
  @Test
  void test2() {
    Random rand = new Random();

    /* rand size */
    int size = rand.nextInt(100) + 1;
    int[] array = new int[size];

    /* init array with rand numbers */
    for (int i = 0; i < size; i++) {
      array[i] = rand.nextInt() % 100;
    }

    assertTrue(FindMinRecursion.minWithoutHigh(array, array.length) == Arrays.stream(array).min().getAsInt());
  }

  
  
}
