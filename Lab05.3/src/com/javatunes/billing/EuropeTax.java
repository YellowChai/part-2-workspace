/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.billing;

/**
 * European orders are taxed as follows:
 *  VAT is 17% of taxable amount.
 *  Luxury tax is an additional 25% on amount over $100.
 *  
 * TODO: implement this algorithm.
 */
public class EuropeTax implements TaxCalculator{


  public static final double BASIC_RATE = 0.17;
  public static final double LUXURY_THRESHOLD = 0.25;

  @Override
  public double taxAmount(double taxable) {

    double tax = taxable * BASIC_RATE;
    if (taxable > 100) {
      tax += LUXURY_THRESHOLD * (taxable -100);

      //return BASIC_RATE * taxable
      //+ ((taxable > LU
    }
    return tax;
  }
}