package com.sync.test.dao;

import java.time.ZonedDateTime;
import java.util.Objects;

public class Employee {

  private int id;
  private String name;
  private ZonedDateTime timestamp;

  public Employee() {
  }

  public Employee(int id, String name, ZonedDateTime timestamp) {
    this.id = id;
    this.name = name;
    this.timestamp = timestamp;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ZonedDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(ZonedDateTime timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Employee)) {
      return false;
    }
    Employee employee = (Employee)o;
    return getId() == employee.getId() && Objects.equals(getName(), employee.getName()) && Objects.equals(getTimestamp(), employee.getTimestamp());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getName(), getTimestamp());
  }

  @Override
  public String toString() {
    return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", timestamp=" + timestamp + '}';
  }
}
