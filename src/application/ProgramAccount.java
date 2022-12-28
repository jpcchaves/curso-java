package application;

import model.entities.Account;
import model.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAccount {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    try {

      System.out.println("Informe os dados da conta: ");
      System.out.print("Número: ");
      Integer number = sc.nextInt();
      System.out.print("Titular: ");
      sc.nextLine();
      String holder = sc.nextLine();


      System.out.print("Saldo inicial: ");
      double balance = sc.nextDouble();

      System.out.print("Limite de saque: ");
      Double withdrawLimit = sc.nextDouble();

      Account acc = new Account(number, holder, balance, withdrawLimit);

      System.out.println();
      System.out.println("Informe uma quantia para sacar: ");
      Double amount = sc.nextDouble();


      acc.withDraw(amount);
      System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
    } catch (BusinessException e) {
      System.out.println(e.getMessage());
    } catch (RuntimeException e) {
      System.out.println("Erro inesperado! ");
    }


    sc.close();
  }
}
