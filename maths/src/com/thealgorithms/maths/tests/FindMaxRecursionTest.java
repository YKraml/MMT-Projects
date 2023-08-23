package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Random;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.FindMaxRecursion;

class FindMaxRecursionTest {

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
    

    assertTrue(FindMaxRecursion.maxWithNotHigh(array, array.length) == Arrays.stream(array).max()
        .getAsInt());
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

    assertTrue(
        FindMaxRecursion.max(array, 0, array.length - 1) == Arrays.stream(array).max().getAsInt());
  }

  
  
}
