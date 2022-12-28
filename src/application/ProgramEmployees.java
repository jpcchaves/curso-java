package application;

import model.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployees {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Employee> employeesList = new ArrayList<>();

    System.out.println("How many employees will be " + "registered? ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.print("Employee #" + (i + 1) + ":");

      System.out.println();

      System.out.print("ID: ");
      Integer id = sc.nextInt();

      sc.nextLine();
      System.out.print("Name: ");
      String name = sc.nextLine();

      System.out.print("Salary: ");
      Double salary = sc.nextDouble();

      employeesList.add(new Employee(id, name, salary));

    }

    System.out.println("Enter the employee id that will " +
            "have salary increase: ");
    double i = sc.nextDouble();

    Employee employeeToIncreaseSalary =
            employeesList.stream().filter(x -> x.getId() == i).findFirst().orElse(null);

    if (employeeToIncreaseSalary != null) {
      System.out.println("Enter the percentage: ");
      double percentage = sc.nextDouble();

      employeeToIncreaseSalary.setSalary(percentage);

    } else {
      System.out.println("This id does not exist!");
    }

    for (Employee x : employeesList) {
      System.out.println("ID: " + x.getId());
      System.out.println("Name: " + x.getName());
      System.out.println("Salary: " + x.getSalary());

    }

  }
}
