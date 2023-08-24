package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.FastInverseSqrt;

public class FastInverseSqrtTests {

    @Test
    void testForOneElement() {
        assertFalse(FastInverseSqrt.inverseSqrt(1332));
        // calls for the 2nd inverse method
    }

    @Test
    void testForsecond() {
        assertFalse(FastInverseSqrt.inverseSqrtFloat(1332f));
        // calls for the 1st inverse method
    }

    @Test
    void testForThird() {
        assertFalse(FastInverseSqrt.inverseSqrtFloat(1));
    }

    @Test
    void testForFourth() {
        assertFalse(FastInverseSqrt.inverseSqrtFloat(1f));
    }

    @Test
    void testForFifth() {
        assertFalse(FastInverseSqrt.inverseSqrt(4522));
    }

    @Test
    void testForSixth() {
        assertFalse(FastInverseSqrt.inverseSqrtFloat(4522f));
    }

    @Test
    void testForSeventh() {
        assertFalse(FastInverseSqrt.inverseSqrt(21));
    }

    @Test
    void testForEighth() {
        assertFalse(FastInverseSqrt.inverseSqrtFloat(21f));
    }
    
    @Test
    void testFor54() {
        assertTrue(FastInverseSqrt.inverseSqrtFloat(54f));
    }
    

    
    
}
