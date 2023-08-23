package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.ParseInteger;

class ParseIntegerTest {

  @Test
  void test() {
    assertTrue(ParseInteger.parseInt("-123") == Integer.parseInt("-123"));
  }

  @Test
  void test3() {
    assertTrue(ParseInteger.parseInt("+123") == Integer.parseInt("+123"));
  }

  @Test
  void test2() {
    assertTrue(ParseInteger.parseInt("123") == Integer.parseInt("123"));
    assertTrue(ParseInteger.parseInt("0123") == Integer.parseInt("0123"));
  }
  
  

}
