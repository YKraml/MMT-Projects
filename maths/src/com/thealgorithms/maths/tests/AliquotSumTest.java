package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.AliquotSum;

public class AliquotSumTest {

    @Test
    void testGetMaxValue() {
        assertEquals(0, AliquotSum.getAliquotValue(1));
        assertEquals(6, AliquotSum.getAliquotValue(6));
        assertEquals(9, AliquotSum.getAliquotValue(15));
        assertEquals(1, AliquotSum.getAliquotValue(19));
    }
    
    
    @Test
    void testGetMaxValue2() {
        assertEquals(0, AliquotSum.getAliquotSum(1));
        assertEquals(6, AliquotSum.getAliquotSum(6));
        assertEquals(9, AliquotSum.getAliquotSum(15));
        assertEquals(1, AliquotSum.getAliquotSum(19));
    }
}
