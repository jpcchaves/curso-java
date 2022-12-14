package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class ProgramRetangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangle retangle = new Retangle();

		System.out
			.println("Enter rectangle width and height: ");
		System.out.println("Width: ");
		retangle.width = sc.nextDouble();
		System.out.println("Height: ");
		retangle.height = sc.nextDouble();

		System.out.println(
			"Area: " + String.format("%.2f", retangle.getArea()));

		System.out.println("Perimeter: "
			+ String.format("%.2f", retangle.getPerimeter()));

		System.out.println("Diagonal: "
			+ String.format("%.2f", retangle.getDiagonal()));

		sc.close();
	}

}
