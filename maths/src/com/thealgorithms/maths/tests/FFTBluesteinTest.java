package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.Complex;
import com.thealgorithms.maths.code.FFTBluestein;

class FFTBluesteinTest {

  @Test
  void test() {
    ArrayList<Complex> list = new ArrayList<>();
    list.add(new Complex(1, 0));
    FFTBluestein.fftBluestein(list, false);

    assertEquals("[Complex [real=1.0, img=0.0]]", list.toString());
  }

  
  
}
