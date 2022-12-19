package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class PromgramComposition {
  public static void main(String[] args) throws ParseException {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter department's name: ");
    String departmentName = sc.nextLine();

    System.out.println("Enter worker data: ");
    System.out.print("Name: ");
    String workerName = sc.nextLine();
    System.out.print("Level: ");
    String workerLevel = sc.nextLine();
    System.out.print("Base salary: ");
    Double baseSalary = sc.nextDouble();

    Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary
            , new Department(departmentName));

    System.out.print("How many contracts to this worker? ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println("Enter contract #" + i + " data:");
      sc.nextLine();
      System.out.print("Date (DD/MM/YYYY): ");
      Date contractDate = sdf.parse(sc.next());

      System.out.println("Value per hour: ");
      double valuePerHour = sc.nextDouble();

      System.out.println("Duration (hours): ");
      int hours = sc.nextInt();


      HourContract contract = new HourContract(contractDate, valuePerHour, hours);

      worker.addContract(contract);
    }
    System.out.println();
    sc.nextLine();
    System.out.println("Enter month and year to calculate income (MM/YYYY): ");
    String monthAndYear = sc.nextLine();

    System.out.println(monthAndYear);

    int month = Integer.parseInt((monthAndYear.substring(0, 2)));
    int year = Integer.parseInt((monthAndYear.substring(3)));

    System.out.println(month);
    System.out.println(year);

    System.out.println("Name: " + worker.getName());
    System.out.println("Department: " + worker.getDepartment().getName());
    System.out.println("Income for: " + monthAndYear + ": " + String.format("%.2f",
            worker.income(year, month)));

    sc.close();

  }
}
