package com.thealgorithms.maths.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.AbsoluteMin;
import com.thealgorithms.maths.code.FindMax;

public class FindMaxTest {

    @Test
    public void testFindMax0() {
        assertEquals(10, FindMax.findMax(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    @Test
    public void testFindMax1() {
        assertEquals(7, FindMax.findMax(new int[] {6, 3, 5, 1, 7, 4, 1}));
    }

    @Test
    public void testFindMax2() {
        assertEquals(10, FindMax.findMax(new int[] {10, 0}));
        
    }

    @Test
    public void testFindMaxThrowsExceptionForEmptyInput() {
      
      try {
        FindMax.findMax(new int[] {});
        fail("Expected an exception");
      } catch (Exception e) {
        assertTrue(e instanceof IllegalArgumentException);
      }
      
      
      
    }
}
