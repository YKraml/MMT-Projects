package com.thealgorithms.maths.tests;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.ADTFraction;
import com.thealgorithms.maths.code.Area;

/**
 * @author Amarildo Aliaj
 */
class AreaTest {

  @Test
  void testSurfaceAreaCube() {
    assertEquals(6.0, Area.surfaceAreaCube(1));
  }

  @Test
  void testSurfaceAreaSphere() {
    assertEquals(12.566370614359172, Area.surfaceAreaSphere(1));
  }
  

  @Test
  void testSurfaceAreaRectangle() {
    assertEquals(200.0, Area.surfaceAreaRectangle(10, 20));
  }

  @Test
  void testSurfaceAreaCylinder() {
    assertEquals(18.84955592153876, Area.surfaceAreaCylinder(1, 2));
  }

  @Test
  void testSurfaceAreaSquare() {
    assertEquals(100.0, Area.surfaceAreaSquare(10));
  }

  @Test
  void testSurfaceAreaTriangleRectangle() {
    assertEquals(50.0, Area.surfaceAreaTriangleRectangle(10, 10));
  }

  @Test
  void testSurfaceAreaParallelogram() {
    assertEquals(200.0, Area.surfaceAreaParallelogram(10, 20));
  }

  @Test
  void testSurfaceAreaTrapezium() {
    assertEquals(450.0, Area.surfaceAreaTrapezium(10, 20, 30));
  }

  @Test
  void testSurfaceAreaCircle() {
    assertEquals(1256.6370614359173, Area.surfaceAreaCircle(20));
  }

  @Test
  void surfaceAreaHemisphere() {
    assertEquals(235.61944901923448, Area.surfaceAreaHemisphere(5));
  }

  @Test
  void surfaceAreaCone() {
    assertEquals(301.59289474462014, Area.surfaceAreaCone(6, 8));
  }

  @Test
  void testAllIllegalInput() {

    try {
      Area.surfaceAreaCube(0);
      fail("Expected an exception");
    } catch (Exception ex) {
      assertEquals(IllegalArgumentException.class, ex.getClass());
    }

    try {
      Area.surfaceAreaSphere(0);
      fail("Expected an exception");
    } catch (Exception ex) {
      assertEquals(IllegalArgumentException.class, ex.getClass());
    }

    try {
      Area.surfaceAreaRectangle(0, 10);
      fail("Expected an exception");
    } catch (Exception ex) {
      assertEquals(IllegalArgumentException.class, ex.getClass());
    }

    try {
      Area.surfaceAreaRectangle(10, 0);
      fail("Expected an exception");
    } catch (Exception ex) {
      assertEquals(IllegalArgumentException.class, ex.getClass());
    }

    try {
      Area.surfaceAreaCylinder(0, 1);
      fail("Expected an exception");
    } catch (Exception ex) {
      assertEquals(IllegalArgumentException.class, ex.getClass());
    }

    try {
      Area.surfaceAreaCylinder(1, 0);
      fail("Expected an exception");
    } catch (Exception ex) {
      assertEquals(IllegalArgumentException.class, ex.getClass());
    }

    try {
      Area.surfaceAreaSquare(0);
      fail("Expected an exception");
    } catch (Exception ex) {
      assertEquals(IllegalArgumentException.class, ex.getClass());
    }

    try {
      Area.surfaceAreaCone(0, 1);
      fail("Expected an exception");
    } catch (Exception ex) {
      assertEquals(IllegalArgumentException.class, ex.getClass());
    }

    try {
      Area.surfaceAreaCone(1, 0);
      fail("Expected an exception");
    } catch (Exception ex) {
      assertEquals(IllegalArgumentException.class, ex.getClass());
    }

    try {
      Area.surfaceAreaHemisphere(0);
      fail("Expected an exception");
    } catch (Exception ex) {
      assertEquals(IllegalArgumentException.class, ex.getClass());
    }

    try {
      Area.surfaceAreaCircle(0);
      fail("Expected an exception");
    } catch (Exception ex) {
      assertEquals(IllegalArgumentException.class, ex.getClass());
    }

    try {
      Area.surfaceAreaTrapezium(1, 1, 0);
      fail("Expected an exception");
    } catch (Exception ex) {
      assertEquals(IllegalArgumentException.class, ex.getClass());
    }

    try {
      Area.surfaceAreaTrapezium(1, 0, 1);
      fail("Expected an exception");
    } catch (Exception ex) {
      assertEquals(IllegalArgumentException.class, ex.getClass());
    }

    try {
      Area.surfaceAreaTrapezium(0, 1, 1);
      fail("Expected an exception");
    } catch (Exception ex) {
      assertEquals(IllegalArgumentException.class, ex.getClass());
    }

    try {
      Area.surfaceAreaParallelogram(1, 0);
      fail("Expected an exception");
    } catch (Exception ex) {
      assertEquals(IllegalArgumentException.class, ex.getClass());
    }

    try {
      Area.surfaceAreaParallelogram(0, 1);
      fail("Expected an exception");
    } catch (Exception ex) {
      assertEquals(IllegalArgumentException.class, ex.getClass());
    }

    try {
      Area.surfaceAreaTriangleRectangle(1, 0);
      fail("Expected an exception");
    } catch (Exception ex) {
      assertEquals(IllegalArgumentException.class, ex.getClass());
    }

    try {
      Area.surfaceAreaTriangleRectangle(0, 1);
      fail("Expected an exception");
    } catch (Exception ex) {
      assertEquals(IllegalArgumentException.class, ex.getClass());
    }

  }
}
