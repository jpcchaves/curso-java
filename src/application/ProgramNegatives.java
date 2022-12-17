package application;

import entities.Negative;

import java.util.Locale;
import java.util.Scanner;

public class ProgramNegatives {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Quantos nums vc vai digitar? ");
    int N = sc.nextInt();
    Negative[] num = new Negative[N];
    int negativeAmount = 0;

    if (N > 10) {
      System.out.println("Só é permitido digitar até 10 números!");
      return;
    }

    for (int i = 0; i < num.length; i++) {
      sc.nextLine();

      int insertedNumber = sc.nextInt();

      if (insertedNumber < 0) {
        negativeAmount++;
      }

      num[i] = new Negative(insertedNumber);

    }

    System.out.println("Negative numbers: ");
    if (!(negativeAmount > 0)) {
      System.out.println("Não foram inseridos números negativos!");
      return;
    }

    for (Negative negative : num) {
      if (negative.getNum() < 0) {
        System.out.println(negative.getNum());
      }
    }

    sc.close();

  }
}
