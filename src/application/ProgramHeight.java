package application;

import model.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class ProgramHeight {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Quantas pessoas serão digitadas? ");
    int N = sc.nextInt();

    Person[] person = new Person[N];

    for (int i = 0; i < N; i++) {
      System.out.println("Nome: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.println("Idade: ");
      int age = sc.nextInt();
      System.out.println("Altura: ");
      double height = sc.nextDouble();

      person[i] = new Person(name, age, height);

    }

    for (int i = 0; i < N; i++) {
      System.out.printf("Dados da %dª pessoa %n", i + 1);

      System.out.println("Nome: " + person[i].getName());
      System.out.println("Idade: " + person[i].getAge());
      System.out.println("Altura: " + person[i].getHeight());


    }
    double allHeights = 0.0;
    double avgHeight = 0.0;
    int lessThanSixty = 0;
    for (int i = 0; i < N; i++) {
      if (person[i].getAge() < 16) {
        lessThanSixty++;
      }

      allHeights += person[i].getHeight();
    }

    avgHeight = allHeights / N;

    double lessThanSixtyPercentage = lessThanSixty / N;

    System.out.printf("Média das idades: %.3f", avgHeight);
    System.out.println();

    System.out.print("Pessoas com menos de 16 anos: " +
            String.format("%.1f", lessThanSixtyPercentage * 100)
            + "%");
    System.out.println();
    for (int i = 0; i < N; i++) {
      if (person[i].getAge() < 16) {
        System.out.println(person[i].getName());
      }
    }

    sc.close();
  }
}


