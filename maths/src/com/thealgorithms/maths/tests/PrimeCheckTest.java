package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.PrimeCheck;

public class PrimeCheckTest {

    @Test
    void test1() {
        Assertions.assertTrue(PrimeCheck.isPrime(2));
    }

    @Test
    void test2() {
        Assertions.assertFalse(PrimeCheck.isPrime(-1));
    }

    @Test
    void test3() {
        Assertions.assertFalse(PrimeCheck.isPrime(4));
    }

    @Test
    void test4() {
        Assertions.assertTrue(PrimeCheck.isPrime(5));
    }

    @Test
    void test5() {
        Assertions.assertFalse(PrimeCheck.isPrime(15));
    }

    @Test
    void test6() {
        Assertions.assertTrue(PrimeCheck.isPrime(11));
    }

    @Test
    void test7() {
        Assertions.assertFalse(PrimeCheck.isPrime(49));
    }
    
    @Test
    void test8() {
        Assertions.assertFalse(PrimeCheck.fermatPrimeChecking(49, 10));
    }
    
    @Test
    void test9() {
        Assertions.assertTrue(PrimeCheck.fermatPrimeChecking(5, 10));
    }
    
    @Test
    void test10() {
        for (int i = 1; i < 1000; i++) {
         assertEquals(PrimeCheck.isPrime(i), PrimeCheck.fermatPrimeChecking(i, 100));
        }
    }
    
    
}
