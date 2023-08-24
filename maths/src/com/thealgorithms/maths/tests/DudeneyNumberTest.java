package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.DudeneyNumber;

class DudeneyNumberTest {

    @Test
    void isDudeney() {
        final int validDudeneyNumber = 512;

        assertTrue(DudeneyNumber.isDudeney(validDudeneyNumber));
    }
    
    
    
    @Test
    void isDudeney2() {
        final int invalidDudeneyNumber = 125;

        assertFalse(DudeneyNumber.isDudeney(invalidDudeneyNumber));
    }
}