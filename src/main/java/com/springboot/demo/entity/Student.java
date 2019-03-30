package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity
public class Student {

  @Id private Integer rollNumber;

  private String name;

  public Student(Integer rollNumber, String name) {
    this.rollNumber = rollNumber;
    this.name = name;
  }

  public Student() {}

  public Integer getRollNumber() {
    return rollNumber;
  }

  public void setRollNumber(Integer rollNumber) {
    this.rollNumber = rollNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student{" + "rollNumber=" + rollNumber + ", name='" + name + '\'' + '}';
  }
}
