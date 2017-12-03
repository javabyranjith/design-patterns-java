package jbr.iteratorpattern.common;

public class Student {

  private String name;
  private String department;
  private int regNo;
  private String address;
  private long phone;

  public Student(String name, String department, int regNo, String address, long phone) {
    this.name = name;
    this.department = department;
    this.regNo = regNo;
    this.address = address;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public int getRegNo() {
    return regNo;
  }

  public void setRegNo(int regNo) {
    this.regNo = regNo;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public long getPhone() {
    return phone;
  }

  public void setPhone(long phone) {
    this.phone = phone;
  }

}
