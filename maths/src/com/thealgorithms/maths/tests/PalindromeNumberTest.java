package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.PalindromeNumber;

class PalindromeNumberTest {

  @Test
  void test() {
    assertTrue(PalindromeNumber.isPalindrome(12321));
    assertTrue(PalindromeNumber.isPalindrome(1));
  }

  @Test
  void test2() {
    assertTrue(!PalindromeNumber.isPalindrome(1234));
  }
  
  

}
