package com.thealgorithms.maths.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.thealgorithms.maths.code.Volume;

public class VolumeTest {

  @Test
  public void volume() {

    /* test cube */
    assertTrue(Volume.volumeCube(7) == 343.0);
  }

  @Test
  public void volume1() {


    /* test cuboid */
    assertTrue(Volume.volumeCuboid(2, 5, 7) == 70.0);

  }

  @Test
  public void volume2() {

    /* test sphere */
    assertTrue(Volume.volumeSphere(7) == 1436.7550402417319);


  }

  @Test
  public void volume3() {


    /* test cylinder */
    assertTrue(Volume.volumeCylinder(3, 7) == 197.92033717615698);
  }

  @Test
  public void volume4() {


    /* test hemisphere */
    assertTrue(Volume.volumeHemisphere(7) == 718.3775201208659);
  }
  

  @Test
  public void volume5() {


    /* test cone */
    assertTrue(Volume.volumeCone(3, 7) == 65.97344572538566);

  }

  @Test
  public void volume6() {


    /* test prism */
    assertTrue(Volume.volumePrism(10, 2) == 20.0);

  }

  @Test
  public void volume7() {
    /* test prism */
    assertEquals(6.66, Volume.volumePyramid(10, 2), 0.01);

  }
  
  
}
