package com.thealgorithms.maths.code;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void test() {
    
    Solution s1 = new Solution(3, 2);
    Solution s2 = new Solution(3, 2);
    Solution s3 = new Solution(3, 1);
    Solution s4 = new Solution(1, 2);
    String s5 = "";
    
    assertEquals(s1, s1);
    assertEquals(s1, s2);
    
    assertNotEquals(s1, s3);
    assertNotEquals(s1, s4);
    assertNotEquals(s1, s5);
    
  }

}
