package com.thealgorithms.maths.code;

import java.util.Arrays;

public class AbsoluteMin {

	/**
	 * Compares the numbers given as arguments to get the absolute min value.
	 *
	 * @param numbers The numbers to compare
	 * @return The absolute min value
	 */
  
	public static int getMinValue(int... numbers) {
		if (numbers.length == 0) {
			throw new IllegalArgumentException("Numbers array cannot be empty");
		}

		int value = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			int number = numbers[i];
			if (Math.abs(number) < Math.abs(value)) {
				value = number;
			}
		}

		return value;
	}
}
