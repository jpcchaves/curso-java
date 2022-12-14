package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();

		System.out.println("Employee name: ");
		employee.name = sc.nextLine();
		System.out.println("Employee Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();

		System.out.println("Employee: " + employee.name + "$ "
			+ employee.netSalary());

		System.out
			.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);

		System.out.println("Employee: " + employee.name + "$ "
			+ employee.netSalary());

		sc.close();
	}

}
