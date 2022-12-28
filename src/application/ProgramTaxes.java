package application;

import model.entities.Company;
import model.entities.Individual;
import model.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramTaxes {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<TaxPayer> list = new ArrayList<>();

    System.out.println("Enter the number of taxpayers: ");
    Integer N = sc.nextInt();

    for (int i = 1; i <= N; i++) {
      System.out.println("Taxpayer #" + i + " data: ");

      System.out.print("Individual or company: ");
      char indOrComp = sc.next().toLowerCase().charAt(0);
      sc.nextLine();

      if (indOrComp == 'i') {
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Anual income: ");
        Double anualIncome = sc.nextDouble();

        System.out.print("Health expenditures: ");
        Double healthExpenditures = sc.nextDouble();

        list.add(new Individual(name, anualIncome, healthExpenditures));

      } else if (indOrComp == 'c') {
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Anual income: ");
        Double anualIncome = sc.nextDouble();

        System.out.print("Number of employees: ");
        Integer employeesAmount = sc.nextInt();

        list.add(new Company(name, anualIncome, employeesAmount));

      }
    }
    System.out.println("Taxes paid: ");
    for (TaxPayer txp : list
    ) {
      System.out.println(txp.getName() + ": $" + String.format("%.2f", txp.tax()));
    }

    System.out.println("Total Taxes: ");
    Double sum = 0.0;
    for (TaxPayer txp : list
    ) {
      sum += txp.tax();
    }
    System.out.println("Total taxes: " + String.format("%.2f", sum));
  }
}
