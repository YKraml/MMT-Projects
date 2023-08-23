package com.thealgorithms.maths.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.FindMax;
import com.thealgorithms.maths.code.FindMin;

public class FindMinTest {

    @Test
    public void testFindMinValue() {
        assertEquals(1, FindMin.findMin(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    @Test
    public void test1() {
        assertEquals(1, FindMin.findMin(new int[] {1, 3, 5, 7, 9}));
    }

    @Test
    public void test2() {
        assertEquals(0, FindMin.findMin(new int[] {0, 192, 384, 576}));
    }

    @Test
    public void test3() {
        assertEquals(0, FindMin.findMin(new int[] {10, 10, 0, 10}));
    }

    @Test
    public void testFindMinThrowsExceptionForEmptyInput() {
        
        try {
          FindMin.findMin(new int[] {});
          fail("Expected an exception");
        } catch (Exception e) {
          assertTrue(e instanceof IllegalArgumentException);
        }
        
        
    }
}
