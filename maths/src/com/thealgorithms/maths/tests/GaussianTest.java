package com.thealgorithms.maths.tests;

import static com.thealgorithms.maths.code.Gaussian.gaussian;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.Gaussian;

public class GaussianTest {

  @Test
  void passTest1() {
    ArrayList<Double> list = new ArrayList<Double>();
    ArrayList<Double> gaussian = new ArrayList<Double>();
    ArrayList<Double> answer = new ArrayList<Double>();
    answer.add(0.0);
    answer.add(1.0);

    int matrixSize = 2;
    list.add(1.0);
    list.add(1.0);
    list.add(1.0);
    list.add(2.0);
    list.add(1.0);
    list.add(1.0);
    gaussian = gaussian(matrixSize, list);

    assertEquals(answer, gaussian);
  }


  // easy pass test for the whole class. Matrix of 2*3.
  @Test
  void passTest2() {
    ArrayList<Double> list = new ArrayList<Double>();
    ArrayList<Double> gaussian = new ArrayList<Double>();
    ArrayList<Double> answer = new ArrayList<Double>();


    int matrixSize = 3;
    list.add(12d);
    list.add(2d);
    list.add(7d);
    list.add(23d);
    list.add(1d);
    list.add(43d);
    list.add(67d);
    list.add(6d);
    list.add(2d);
    gaussian = gaussian(matrixSize, list);

    assertTrue(Double.isNaN(gaussian.get(0)));
    assertEquals(0, gaussian.get(1));
    assertTrue(Double.isNaN(gaussian.get(2)));
  }

  @Test
  void passTest3() {
    ArrayList<Double> list = new ArrayList<Double>(
        List.of(1.2147131918567148E308, 8.156844993704483E307, 1.2682314925472543E308,
            1.5515851352242872E308, 2.2205880068919932E307, 2.864649382355823E307,
            1.7877713480551336E308, 2.9333423786585927E307, 1.3739908403755822E308));


    ArrayList<Double> answer = new ArrayList<Double>(List.of(0.0, 1.0, 0.0));

    ArrayList<Double> gaussian = gaussian(3, list);

    for (int i = 0; i < answer.size(); i++) {
      assertEquals(answer.get(i), gaussian.get(i));
    }
  }



}
