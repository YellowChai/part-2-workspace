/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.math;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

  @Test
  public void add() {
    Calculator calc = new Calculator();
    assertEquals(5, calc.add(1, 4));  // expected, actual

  }

  @Test
  public void divide() {
    Calculator calc = new Calculator();
    assertEquals(1.5, calc.divide(3, 2), 0.000001);// adding acceptable tolerance
  }

  @Test
  public void isEven() {
    Calculator calc = new Calculator();
    assertTrue( calc.isEven(6) );

  }

}