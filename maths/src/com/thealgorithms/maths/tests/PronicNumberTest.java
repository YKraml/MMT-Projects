package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.PronicNumber;

public class PronicNumberTest {

    @Test
    void testForPronicNumber() {
        assertTrue(PronicNumber.isPronic(30));
    }
    
    @Test
    void testForPronicNumber2() {
        assertTrue(PronicNumber.isPronic(2));
    }

    @Test
    void testForNonPronicNumber() {
        assertFalse(PronicNumber.isPronic(21));
    }
    
    @Test
    void testForNonPronicNumber2() {
        assertFalse(PronicNumber.isPronic(239));
    }
    
    
}
