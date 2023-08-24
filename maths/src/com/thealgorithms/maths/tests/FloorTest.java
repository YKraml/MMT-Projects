package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.Floor;

class FloorTest {

  @Test
  void test() {
    Random random = new Random();
    for (int i = 1; i <= 1000; ++i) {
      double randomNumber = random.nextDouble() * 1000 - 500;
      assertEquals(Math.floor(randomNumber), Floor.floor(randomNumber));
    }
  }

  
  @Test
  void test2() {
    assertEquals(Math.floor(0.01), Floor.floor(0.01));
  }
  
  @Test
  void test4() {
    assertEquals(Math.floor(-1), Floor.floor(-1));
  }
  
  @Test
  void test5() {
    assertEquals(Math.floor(4), Floor.floor(4));
  }
  
  

}
