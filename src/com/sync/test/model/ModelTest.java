package com.sync.test.model;

import java.util.Objects;

public class ModelTest {

  private int id;
  private  String name;
  private String city;

  public ModelTest() {

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    System.out.println("id: "+id);
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    System.out.println("Name: "+name);
    this.name = name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    System.out.println("City: "+city);
    this.city = city;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ModelTest)) {
      return false;
    }
    ModelTest modelTest = (ModelTest)o;
    return id == modelTest.id && Objects.equals(name, modelTest.name) && Objects.equals(city, modelTest.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, city);
  }
}
