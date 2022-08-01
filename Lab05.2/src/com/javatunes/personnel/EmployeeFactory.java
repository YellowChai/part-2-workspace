/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.personnel;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {
  
  // prevent direct instantiation - this is an all-static factory class
  private EmployeeFactory() {
  }
  
  /**
   * TODO: given the input map, create and return the correct object (with its properties set).
   * If the input map's "type" value is not "HE" or "SE", throw IllegalArgumentException with a suitable message.
   */
  public static Employee createEmployee(Map<String,String> inputMap)
  throws IllegalArgumentException {
    // return value

    String name = inputMap.get("name");
    Date hireDate = Date.valueOf(inputMap.get("hireDate"));
    String type = inputMap.get("type");

    switch (type) {
      case "SE":
        Double salary = Double.valueOf(inputMap.get("salary"));


        break;
      case "HE":
        break;
      default:
        throw new IllegalArgumentException(String.format("\"%s\" is not a valid employee type.", type));
    }
    return emp;
  }


}