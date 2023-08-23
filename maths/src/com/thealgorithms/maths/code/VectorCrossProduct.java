package com.thealgorithms.maths.code;

import java.util.Objects;

/**
 * @file
 *
 * @brief Calculates the [Cross
 * Product](https://en.wikipedia.org/wiki/Cross_product) and the magnitude of
 * two mathematical 3D vectors.
 *
 *
 * @details Cross Product of two vectors gives a vector. Direction Ratios of a
 * vector are the numeric parts of the given vector. They are the tree parts of
 * the vector which determine the magnitude (value) of the vector. The method of
 * finding a cross product is the same as finding the determinant of an order 3
 * matrix consisting of the first row with unit vectors of magnitude 1, the
 * second row with the direction ratios of the first vector and the third row
 * with the direction ratios of the second vector. The magnitude of a vector is
 * it's value expressed as a number. Let the direction ratios of the first
 * vector, P be: a, b, c Let the direction ratios of the second vector, Q be: x,
 * y, z Therefore the calculation for the cross product can be arranged as:
 *
 * ``` P x Q: 1	1	1 a	b	c x	y	z ```
 *
 * The direction ratios (DR) are calculated as follows: 1st DR, J: (b * z) - (c
 * * y) 2nd DR, A: -((a * z) - (c * x)) 3rd DR, N: (a * y) - (b * x)
 *
 * Therefore, the direction ratios of the cross product are: J, A, N The
 * following Java Program calculates the direction ratios of the cross products
 * of two vector. The program uses a function, cross() for doing so. The
 * direction ratios for the first and the second vector has to be passed one by
 * one separated by a space character.
 *
 * Magnitude of a vector is the square root of the sum of the squares of the
 * direction ratios.
 *
 *
 * For maintaining filename consistency, Vector class has been termed as
 * VectorCrossProduct
 *
 * @author [Syed](https://github.com/roeticvampire)
 */


public class VectorCrossProduct {

    int x1;
    int y1;
    int z1;

   

    /**
     * constructor, initialises Vector with given Direction Ratios
     *
     * @param x2 set to x
     * @param y2 set to y
     * @param z2 set to z
     */
    public VectorCrossProduct(int x2, int y2, int z2) {
        x1 = x2;
        y1 = y2;
        z1 = z2;
    }

    /**
     * Returns the magnitude of the vector
     *
     * @return double
     */
    public double magnitude() {
        return Math.sqrt(x1 * x1 + y1 * y1 + z1 * z1);
    }

    /**
     * Returns the dot product of the current vector with a given vector
     *
     * @param b: the second vector
     * @return int: the dot product
     */
    public int dotProduct(VectorCrossProduct b) {
        return x1 * b.x1 + y1 * b.y1 + z1 * b.z1;
    }

    /**
     * Returns the cross product of the current vector with a given vector
     *
     * @param b: the second vector
     * @return vectorCrossProduct: the cross product
     */
    public VectorCrossProduct crossProduct(VectorCrossProduct b) {
        VectorCrossProduct product = new VectorCrossProduct(0,0,0);
        product.x1 = (y1 * b.z1) - (z1 * b.y1);
        product.y1 = -((x1 * b.z1) - (z1 * b.x1));
        product.z1 = (x1 * b.y1) - (y1 * b.x1);
        
        return product;
    }

    @Override
    public int hashCode() {
      return Objects.hash(x1, y1, z1);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      VectorCrossProduct other = (VectorCrossProduct) obj;
      return x1 == other.x1 && y1 == other.y1 && z1 == other.z1;
    }

    
    
}
