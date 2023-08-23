package com.thealgorithms.maths.code;

import java.util.Objects;

public class ADTFraction {
	
	private final int numerator;
	private final int denominator;
	
	
    /**
     * Initializes a newly created {@code ADTFraction} object so that it represents
     * a fraction with the {@code numerator} and {@code denominator} provided as arguments.
     *
     * @param numerator   The fraction numerator
     * @param denominator The fraction denominator
     */
    public ADTFraction(int numerator, int denominator) {
        this.numerator = numerator;
		this.denominator = denominator;
		if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be 0");
        }
    }

    /**
     * Add two fractions.
     *
     * @param fraction the {@code ADTFraction} to add
     * @return A new {@code ADTFraction} containing the result of the operation
     */
    public ADTFraction plus(ADTFraction fraction) {
        int numerator = this.denominator * fraction.numerator + this.numerator * fraction.denominator;
        int denominator = this.denominator * fraction.denominator;
        return new ADTFraction(numerator, denominator);
    }

    /**
     * Multiply fraction by a number.
     *
     * @param number the number to multiply
     * @return A new {@code ADTFraction} containing the result of the operation
     */
    public ADTFraction timesInt(int number) {
        return times(new ADTFraction(number, 1));
    }

    /**
     * Multiply two fractions.
     *
     * @param fraction the {@code ADTFraction} to multiply
     * @return A new {@code ADTFraction} containing the result of the operation
     */
    public ADTFraction times(ADTFraction fraction) {
    	int numerator = this.numerator * fraction.numerator;
    	int denominator = this.denominator * fraction.denominator;
        return new ADTFraction(numerator, denominator);
    }

    /**
     * Generates the reciprocal of the fraction.
     *
     * @return A new {@code ADTFraction} with the {@code numerator} and {@code denominator} switched
     */
    public ADTFraction reciprocal() {
        return new ADTFraction(this.denominator, this.numerator);
    }

    /**
     * Calculates the result of the fraction.
     *
     * @return The numerical result of the division between {@code numerator} and {@code
     *     denominator}
     */
    public float value() {
        return (float) this.numerator / this.denominator;
    }

    /**
     * Returns a string representation of this {@code ADTFraction} in the format
     * {@code numerator}/{@code denominator}.
     *
     * @return A string representation of this {@code ADTFraction}
     */
    @Override
    public String toString() {
        return String.format("%d/%d", this.numerator, this.denominator);
    }

	@Override
	public int hashCode() {
		return Objects.hash(denominator, numerator);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ADTFraction other = (ADTFraction) obj;
		return denominator == other.denominator && numerator == other.numerator;
	}
    
   
}