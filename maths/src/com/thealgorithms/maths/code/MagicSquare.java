package com.thealgorithms.maths.code;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;

/*
 * A magic square of order n is an arrangement of distinct n^2 integers,in a square, such that the n
 * numbers in all rows, all columns, and both diagonals sum to the same constant. A magic square
 * contains the integers from 1 to n^2.
 */
public class MagicSquare {



  public static String makeSquare(int num) {
    if ((num % 2 == 0) || (num <= 0)) {
      System.out.print("Input number must be odd and >0");
      System.exit(0);
    }
    

    int[][] magic_square = new int[num][num];

    int row_num = num / 2;
    int col_num = num - 1;
    magic_square[row_num][col_num] = 1;

    for (int i = 2; i <= num * num; i++) {
      if (magic_square[(row_num - 1 + num) % num][(col_num + 1) % num] == 0) {
        row_num = (row_num - 1 + num) % num;
        col_num = (col_num + 1) % num;
      } else {
        col_num = (col_num - 1 + num) % num;
      }
      magic_square[row_num][col_num] = i;
    }

    String result = "";
    for (int l = 0; l < num; l++) {
      for (int j = 0; j < num; j++) {
        if (magic_square[l][j] < 10) {
          result += (" ");
        }
        if (magic_square[l][j] < 100) {
          result += (" ");
        }
        result += (magic_square[l][j] + " ");
      }
      result += "\n";
    }

    return result;
  }
}
