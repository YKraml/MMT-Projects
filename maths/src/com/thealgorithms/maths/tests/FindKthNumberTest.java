package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Random;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.FindKthNumber;

class FindKthNumberTest {

  @Test
  void test() {
    /* generate array with random size and random elements */
    int[] nums = generateArray(100);

    /* get 3th largest element */
    int kth = 3;
    int kthMaxIndex = nums.length - kth;
    int targetMax = FindKthNumber.findKthMax(nums, kthMaxIndex);

    /* get 3th smallest element */
    int kthMinIndex = kth - 1;
    int targetMin = FindKthNumber.findKthMax(nums, kthMinIndex);

    Arrays.sort(nums);
    assertTrue( nums[kthMaxIndex] == targetMax);
    assertTrue( nums[kthMinIndex] == targetMin);
  }
  
  
  private static final Random random = new Random();



  public static int[] generateArray(int capacity) {
      int size = random.nextInt(capacity) + 1;
      int[] array = new int[size];

      for (int i = 0; i < size; i++) {
          array[i] = random.nextInt() % 100;
      }
      return array;
  }
  
  

}
