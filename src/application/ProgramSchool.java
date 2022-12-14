package application;

import java.util.Locale;
import java.util.Scanner;

import entities.School;

public class ProgramSchool {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		School school = new School();

		System.out.println("Type student name: ");
		school.student = sc.nextLine();
		System.out.println("Type student first grade: ");
		school.n1 = sc.nextDouble();
		System.out.println("Type student second grade: ");
		school.n2 = sc.nextDouble();
		System.out.println("Type student third grade: ");
		school.n3 = sc.nextDouble();

		System.out.println("RESULT: ");
		System.out.printf("FINAL GRADE: %.2f%n",
			school.finalGrade());
		if (school.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n",
				school.missingPoints());
		} else {
			System.out.println("PASS");
		}
		sc.close();
	}

}
