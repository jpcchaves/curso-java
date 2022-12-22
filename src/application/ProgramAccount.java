package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramAccount {
  public static void main(String[] args) {


    Account acc = new Account(1001, "João", 0.0);
    BusinessAccount bacc = new BusinessAccount(1002, "João 2", 0.0, 500.0);


    //  Upcasting - atribuir uma subclasse e atribuir para uma variável da super classe!
    Account acc1 = bacc;
    Account acc2 = new BusinessAccount(1003, "Jp", 0.0, 200.0);
    Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

    // Downcasting - é o processo inverso de upcasting
    BusinessAccount acc4 = (BusinessAccount) acc2;
    acc4.loan(100.0);

    if (acc3 instanceof BusinessAccount acc5) {
      System.out.println("Emprestimo permitido");
    } else {
      System.out.println("acc3 não é uma instancia de BusinessAccount");
    }

    if (acc3 instanceof SavingsAccount acc5) {
      acc5.updateBalance();
      System.out.println("Update");
    }

  }
}
