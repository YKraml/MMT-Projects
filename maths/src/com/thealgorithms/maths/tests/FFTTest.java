package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.Complex;
import com.thealgorithms.maths.code.FFT;

class FFTTest {

  // Testing the simple function getReal
  @Test
  void getRealtest() {
    Complex complex = new Complex(1.0, 1.0);
    assertEquals(1.0, complex.getReal());
  }

  // Testing the simple function getImaginary
  @Test
  void getImaginaryTest() {
    Complex complex = new Complex(0, 0);
    assertEquals(0.0, complex.getImaginary());
  }

  // Testing the function add, assertEqual test
  @Test
  void addTest() {
    Complex complex1 = new Complex(1.0, 1.0);
    Complex complex2 = new Complex(2.0, 2.0);
    double add = complex1.add(complex2).getReal();
    assertEquals(3.0, add);
  }

  // Testing the function add, assertNotEqual test
  @Test
  void addFalseTest() {
    Complex complex1 = new Complex(1.0, 1.0);
    Complex complex2 = new Complex(2.0, 2.0);
    double add = complex1.add(complex2).getReal();
    assertNotEquals(2.0, add);
  }

  // Testing the function substract, assertEqual test
  @Test
  void subtractTest() {
    Complex complex1 = new Complex(2.0, 2.0);
    Complex complex2 = new Complex(1.0, 1.0);
    double sub = complex1.subtract(complex2).getReal();
    assertEquals(1.0, sub);
  }

  // Testing the function multiply complex, assertEqual test
  @Test
  void multiplyWithComplexTest() {
    Complex complex1 = new Complex(2.0, 2.0);
    Complex complex2 = new Complex(1.0, 1.0);
    double multiReal = complex1.multiply(complex2).getReal();
    double multiImg = complex1.multiply(complex2).getImaginary();
    assertEquals(0.0, multiReal);
    assertEquals(4.0, multiImg);
  }

  // Testing the function multiply scalar, assertEqual test
  @Test
  void multiplyWithScalarTest() {
    Complex complex1 = new Complex(2.0, 2.0);

    double multiReal = complex1.multiplyDouble(2).getReal();
    double multiImg = complex1.multiplyDouble(3).getImaginary();
    assertEquals(4.0, multiReal);
    assertEquals(6.0, multiImg);
  }

  // Testing the function conjugate, assertEqual test
  @Test
  void conjugateTest() {
    Complex complex1 = new Complex(2.0, 2.0);
    double conReal = complex1.conjugate().getReal();
    double conImg = complex1.conjugate().getImaginary();
    assertEquals(2.0, conReal);
    assertEquals(-2.0, conImg);
  }

  // Testing the function abs, assertEqual test
  @Test
  void abs() {
    Complex complex1 = new Complex(2.0, 3.0);
    double abs = complex1.abs();
    assertEquals(Math.sqrt(13), abs);
  }

  // Testing the function divide complex, assertEqual test.
  @Test
  void divideWithComplexTest() {
    Complex complex1 = new Complex(2.0, 2.0);
    Complex complex2 = new Complex(1.0, 2.0);
    double divReal = complex1.divide(complex2).getReal();
    double divImg = complex1.divide(complex2).getImaginary();
    assertEquals(1.2, divReal);
    assertEquals(-0.4, divImg);
  }

  // Testing the function divide scalar, assertEqual test.
  @Test
  void divideWithScalarTest() {
    Complex complex1 = new Complex(2.0, 2.0);
    double divReal = complex1.divideDouble(2).getReal();
    double divImg = complex1.divideDouble(2).getImaginary();
    assertEquals(1, divReal);
    assertEquals(1, divImg);
  }

  // Testing the function fft, assertEqual test.
  // https://scistatcalc.blogspot.com/2013/12/fft-calculator.html used this link to
  // ensure the result
  @Test
  void fft() {
    ArrayList<Complex> arr = new ArrayList<Complex>();
    Complex complex1 = new Complex(2.0, 2.0);
    Complex complex2 = new Complex(1.0, 3.0);
    Complex complex3 = new Complex(3.0, 1.0);
    Complex complex4 = new Complex(2.0, 2.0);

    arr.add(complex1);
    arr.add(complex2);
    arr.add(complex3);
    arr.add(complex4);
    arr = FFT.fft(arr, false);
    double realV1 = arr.get(0).getReal();
    double realV2 = arr.get(1).getReal();
    double realV3 = arr.get(2).getReal();
    double imgV1 = arr.get(0).getImaginary();
    double imgV2 = arr.get(1).getImaginary();
    double imgV3 = arr.get(2).getImaginary();
    assertEquals(8.0, realV1);
    assertEquals(0, realV2, 0.001);
    assertEquals(2.0, realV3);
    assertEquals(8.0, imgV1);
    assertEquals(2, imgV2);
    assertEquals(-2.0, imgV3);
  }




}
