package com.sync.test.model;

import com.sync.test.dao.Employee;

import java.time.ZonedDateTime;

public class ModelMain {

  public static void main(String[] args) {

    ModelTest modelTest = new ModelTest();
    modelTest.setId(12345);
    modelTest.setName("Gangashiva");
    modelTest.setCity("Bangalore");

    Employee employee = new Employee();
    employee.setId(12345);
    employee.setName("Gangashiva M N");

    System.out.println("Employee: "+employee);
  }

}
