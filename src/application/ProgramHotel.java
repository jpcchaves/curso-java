package application;

import model.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class ProgramHotel {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Rent[] vect = new Rent[10];

    System.out.println("how many rooms will be rentend? ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println("Rent #:" + i + ":");
      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.print("Email: ");
      String email = sc.next();

      System.out.print("Room: ");
      int roomNum = sc.nextInt();

      vect[roomNum] = new Rent(name, email);
    }

    System.out.println();
    System.out.println("Busy rooms: ");
    for (int i = 0; i < 10; i++) {
      if (vect[i] != null) {
        System.out.println(i + ": " + vect[i]);
      }
    }
  }
}
