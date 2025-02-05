package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestInstance.Lifecycle;

// @TestInstance(Lifecycle.PER_METHOD) 
// ! New Test Object to call each test cases

public class CalculatorPerMethodTest {
  // Test Object
  private int x; // test env variable

  @Test
  void testSum(){
    this.x += Calculator.sum2(1, 2);
    assertEquals(3, this.x);
  }

  @Test
  void testSum2(){
    this.x += Calculator.sum2(1, 2);
    assertEquals(3, this.x);
  }

  public static void main(String[] args) {
    CalculatorPerMethodTest testObject = new CalculatorPerMethodTest();
    testObject.testSum();
    CalculatorPerMethodTest testObject2 = new CalculatorPerMethodTest();
    testObject2.testSum2();
  }

}
