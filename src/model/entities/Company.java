package model.entities;

public class Company extends TaxPayer {

  Integer employeesAmount;

  public Company() {
  }

  public Company(String name, Double anualIcome, Integer employeesAmount) {
    super(name, anualIcome);
    this.employeesAmount = employeesAmount;
  }

  public Integer getEmployeesAmount() {
    return employeesAmount;
  }

  public void setEmployeesAmount(Integer employeesAmount) {
    this.employeesAmount = employeesAmount;
  }

  @Override
  public Double tax() {
    if (employeesAmount > 10) {
      return getAnualIcome() * 0.14;
    } else {
      return getAnualIcome() * 0.16;
    }
  }
}
