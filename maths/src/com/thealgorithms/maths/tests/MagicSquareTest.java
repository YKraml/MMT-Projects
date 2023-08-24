package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.MagicSquare;

class MagicSquareTest {

  @Test
  void test() {
    int num = 7;

    assertEquals(" 20  12   4  45  37  29  28 \n" + " 11   3  44  36  35  27  19 \n"
        + "  2  43  42  34  26  18  10 \n" + " 49  41  33  25  17   9   1 \n"
        + " 40  32  24  16   8   7  48 \n" + " 31  23  15  14   6  47  39 \n"
        + " 22  21  13   5  46  38  30 \n" + "", MagicSquare.makeSquare(num));
  }
  
  

}
