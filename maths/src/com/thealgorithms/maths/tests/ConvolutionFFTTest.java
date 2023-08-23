package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.Complex;
import com.thealgorithms.maths.code.ConvolutionFFT;

class ConvolutionFFTTest {

  private ArrayList<Complex> a;
  private ArrayList<Complex> b;
  private ArrayList<Complex> expected;

  @BeforeEach
  void setup() {
    a = new ArrayList<>();
    b = new ArrayList<>();
    expected = new ArrayList<>();
  }

  @Test
  void test1() {

    a.add(new Complex(1, 0));
    a.add(new Complex(1, 0));
    a.add(new Complex(1, 0));
    a.add(new Complex(0, 0));
    a.add(new Complex(0, 0));
    a.add(new Complex(0, 0));

    b.add(new Complex(0.5, 0));
    b.add(new Complex(0.2, 0));
    b.add(new Complex(0.3, 0));

    expected.add(new Complex(0.5, 0));
    expected.add(new Complex(0.7, 0));
    expected.add(new Complex(1, 0));
    expected.add(new Complex(0.5, 0));
    expected.add(new Complex(0.3, 0));
    expected.add(new Complex(0, 0));
    expected.add(new Complex(0, 0));
    expected.add(new Complex(0, 0));

    ArrayList<Complex> real = ConvolutionFFT.convolutionFFT(a, b);

    for (int i = 0; i < real.size(); i++) {
      assertEquals(expected.get(i).getReal(), real.get(i).getReal(), 0.001);
      assertEquals(expected.get(i).getImaginary(), real.get(i).getImaginary(), 0.001);
    }

  }
  
  


}
