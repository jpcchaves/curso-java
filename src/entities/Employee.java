package entities;

public class Employee {
  private final int id;
  private final String name;
  private double salary;

  public Employee(Integer id, String name, Double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(double percentage) {
    this.salary += salary * (percentage / 100);
  }

}
