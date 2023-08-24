package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.GcdSolutionWrapper;
import com.thealgorithms.maths.code.Solution;

class GcdSolutionWrapperTest {

  @Test
  void testSolutionWrapper() {

    GcdSolutionWrapper wrapper = new GcdSolutionWrapper(3, new Solution(12, 32));
    GcdSolutionWrapper wrapper2 = new GcdSolutionWrapper(3, new Solution(12, 32));

    GcdSolutionWrapper wrapper3 = new GcdSolutionWrapper(2, new Solution(12, 32));
    GcdSolutionWrapper wrapper4 = new GcdSolutionWrapper(3, new Solution(43, 32));
    GcdSolutionWrapper wrapper5 = new GcdSolutionWrapper(3, new Solution(12, 543));

    String different = "";

    assertEquals(wrapper, wrapper2);
    assertEquals(wrapper, wrapper);
    assertNotEquals(wrapper, wrapper3);
    assertNotEquals(wrapper, wrapper4);
    assertNotEquals(wrapper, wrapper5);
    assertNotEquals(wrapper, different);

  }

  @Test
  void testSolutionWrapper2() {

    Solution s = new Solution(0, 0);
    GcdSolutionWrapper w = new GcdSolutionWrapper(1, null);

    assertNull(w.getSolution());
    w.setSolution(s);
    assertEquals(s, w.getSolution());
  }

}
