package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.MatrixUtil;

class MatrixUtilTest {

  @Test
  void test() {


    final BigDecimal[][] matrix1 =
        {{new BigDecimal(3), new BigDecimal(2)}, {new BigDecimal(0), new BigDecimal(1)},};

    final BigDecimal[][] matrix2 =
        {{new BigDecimal(1), new BigDecimal(3)}, {new BigDecimal(2), new BigDecimal(0)},};


    final BigDecimal[][] actual = (BigDecimal[][]) MatrixUtil.add(matrix1, matrix2).get();

    final BigDecimal[][] expected =
        {{new BigDecimal(4), new BigDecimal(5)}, {new BigDecimal(2), new BigDecimal(1)},};

    assertArrayEquals(actual, expected);
  }
  
  

  @Test
  void test2() {
    final BigDecimal[][] matrix1 =
        {{new BigDecimal(1), new BigDecimal(4)}, {new BigDecimal(5), new BigDecimal(6)},};

    final BigDecimal[][] matrix2 =
        {{new BigDecimal(2), new BigDecimal(0)}, {new BigDecimal(-2), new BigDecimal(-3)},};

    final BigDecimal[][] actual = (BigDecimal[][]) MatrixUtil.subtract(matrix1, matrix2).get();

    final BigDecimal[][] expected =
        {{new BigDecimal(-1), new BigDecimal(4)}, {new BigDecimal(7), new BigDecimal(9)},};

    assertArrayEquals(actual, expected);
  }

  @Test
  void test3() {
    final BigDecimal[][] matrix1 = {{new BigDecimal(1), new BigDecimal(2), new BigDecimal(3)},
        {new BigDecimal(4), new BigDecimal(5), new BigDecimal(6)},
        {new BigDecimal(7), new BigDecimal(8), new BigDecimal(9)},};

    final BigDecimal[][] matrix2 = {{new BigDecimal(1), new BigDecimal(2)},
        {new BigDecimal(3), new BigDecimal(4)}, {new BigDecimal(5), new BigDecimal(6)},};

    final BigDecimal[][] actual = (BigDecimal[][]) MatrixUtil.multiply(matrix1, matrix2).get();

    final BigDecimal[][] expected = {{new BigDecimal(22), new BigDecimal(28)},
        {new BigDecimal(49), new BigDecimal(64)}, {new BigDecimal(76), new BigDecimal(100)},};

    assertArrayEquals(actual, expected);
  }



}
