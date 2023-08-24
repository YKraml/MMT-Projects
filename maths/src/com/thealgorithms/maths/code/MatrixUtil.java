package com.thealgorithms.maths.code;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

/**
 * @author: caos321
 * @date: 31 October 2021 (Sunday)
 */
public class MatrixUtil {

	public static boolean isValid(final BigDecimal[][] matrix) {
		return matrix != null && matrix.length > 0 && matrix[0].length > 0;
	}

	public static boolean hasEqualSizes(final BigDecimal[][] matrix1, final BigDecimal[][] matrix2) {
		return (isValid(matrix1) && isValid(matrix2) && matrix1.length == matrix2.length
				&& matrix1[0].length == matrix2[0].length);
	}

	
	public static boolean canMultiply(final BigDecimal[][] matrix1, final BigDecimal[][] matrix2) {
		return (isValid(matrix1) && isValid(matrix2) && matrix1[0].length == matrix2.length);
	}


	public static Optional<BigDecimal[][]> add(final BigDecimal[][] matrix1, final BigDecimal[][] matrix2) {
		if (!hasEqualSizes(matrix1, matrix2)) {
			return Optional.empty();
		}

		final int rowSize = matrix1.length;
		final int columnSize = matrix1[0].length;

		final BigDecimal[][] result = new BigDecimal[rowSize][columnSize];

		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < columnSize; j++) {
				final BigDecimal value1 = matrix1[i][j];
				final BigDecimal value2 = matrix2[i][j];
				result[i][j] = value1.add(value2);
			}
		}

		return Optional.of(result);
	}

	public static Optional<BigDecimal[][]> subtract(final BigDecimal[][] matrix1, final BigDecimal[][] matrix2) {
		if (!hasEqualSizes(matrix1, matrix2)) {
			return Optional.empty();
		}

		final int rowSize = matrix1.length;
		final int columnSize = matrix1[0].length;

		final BigDecimal[][] result = new BigDecimal[rowSize][columnSize];

		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < columnSize; j++) {
				final BigDecimal value1 = matrix1[i][j];
				final BigDecimal value2 = matrix2[i][j];
				result[i][j] = value1.subtract(value2);
			}
		}

		return Optional.of(result);
	}

	public static Optional<BigDecimal[][]> multiply(final BigDecimal[][] matrix1, final BigDecimal[][] matrix2) {
		if (!canMultiply(matrix1, matrix2)) {
			return Optional.empty();
		}

		final int size = matrix1[0].length;

		final int matrix1RowSize = matrix1.length;
		final int matrix2ColumnSize = matrix2[0].length;

		final BigDecimal[][] result = new BigDecimal[matrix1RowSize][matrix2ColumnSize];

		for (int i = 0; i < matrix1RowSize; i++) {
			for (int j = 0; j < matrix2ColumnSize; j++) {

				BigDecimal sum = BigDecimal.ZERO;
				for (int k = 0; k < size; k++) {
					final BigDecimal value1 = matrix1[i][k];
					final BigDecimal value2 = matrix2[k][j];

					sum = sum.add(value1.multiply(value2));
				}

				result[i][j] = sum;
			}

		}

		return Optional.of(result);

	}

}
