package com.thealgorithms.maths.code;

import java.util.Objects;

/**
 * This class represents a complex number and has methods for basic
 * operations.
 *
 * <p>
 * More info:
 * https://introcs.cs.princeton.edu/java/32class/Complex.java.html
 */
public class Complex {

    private double real, img;

    /**
     * Constructor. Creates a complex number.
     *
     * @param r The real part of the number.
     * @param i The imaginary part of the number.
     */
    public Complex(double r, double i) {
        real = r;
        img = i;
    }

    
    /**
     * Returns the real part of the complex number.
     *
     * @return The real part of the complex number.
     */
    public double getReal() {
        return real;
    }

    /**
     * Returns the imaginary part of the complex number.
     *
     * @return The imaginary part of the complex number.
     */
    public double getImaginary() {
        return img;
    }

    /**
     * Adds this complex number to another.
     *
     * @param z The number to be added.
     * @return The sum.
     */
    public Complex add(Complex z) {
        Complex temp = new Complex(0,0);
        temp.real = this.real + z.real;
        temp.img = this.img + z.img;
        return temp;
    }

    /**
     * Subtracts a number from this complex number.
     *
     * @param z The number to be subtracted.
     * @return The difference.
     */
    public Complex subtract(Complex z) {
        Complex temp = new Complex(0,0);
        temp.real = this.real - z.real;
        temp.img = this.img - z.img;
        return temp;
    }

    /**
     * Multiplies this complex number by another.
     *
     * @param z The number to be multiplied.
     * @return The product.
     */
    public Complex multiply(Complex z) {
        Complex temp = new Complex(0,0);
        temp.real = this.real * z.real - this.img * z.img;
        temp.img = this.real * z.img + this.img * z.real;
        return temp;
    }

    /**
     * Multiplies this complex number by a scalar.
     *
     * @param n The real number to be multiplied.
     * @return The product.
     */
    public Complex multiplyDouble(double n) {
        Complex temp = new Complex(0,0);
        temp.real = this.real * n;
        temp.img = this.img * n;
        return temp;
    }

    /**
     * Finds the conjugate of this complex number.
     *
     * @return The conjugate.
     */
    public Complex conjugate() {
        Complex temp = new Complex(0,0);
        temp.real = this.real;
        temp.img = -this.img;
        return temp;
    }

    /**
     * Finds the magnitude of the complex number.
     *
     * @return The magnitude.
     */
    public double abs() {
        return Math.hypot(this.real, this.img);
    }

    /**
     * Divides this complex number by another.
     *
     * @param z The divisor.
     * @return The quotient.
     */
    public Complex divide(Complex z) {
        Complex temp = new Complex(0,0);
        double d = z.abs() * z.abs();
        d = (double) Math.round(d * 1000000000d) / 1000000000d;
        temp.real = (this.real * z.real + this.img * z.img) / (d);
        temp.img = (this.img * z.real - this.real * z.img) / (d);
        return temp;
    }

    /**
     * Divides this complex number by a scalar.
     *
     * @param n The divisor which is a real number.
     * @return The quotient.
     */
    public Complex divideDouble(double n) {
        Complex temp = new Complex(0,0);
        temp.real = this.real / n;
        temp.img = this.img / n;
        return temp;
    }

    @Override
    public int hashCode() {
      return Objects.hash(img, real);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Complex other = (Complex) obj;
      return Double.doubleToLongBits(img) == Double.doubleToLongBits(other.img)
          && Double.doubleToLongBits(real) == Double.doubleToLongBits(other.real);
    }

    @Override
    public String toString() {
      return "Complex [real=" + real + ", img=" + img + "]";
    }
    
    
}
