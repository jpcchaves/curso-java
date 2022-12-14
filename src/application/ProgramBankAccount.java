package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.Bank;

public class ProgramBankAccount {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().toLowerCase().charAt(0);

		if (response == 'y') {
			System.out.print("Enter initital deposit value: ");
			double inititalDeposit = sc.nextDouble();

			account = new Account(number, holder,
				inititalDeposit);

		} else {
			account = new Account(number, holder);
		}
		System.out.println();

		System.out.println("Account data: ");
		System.out.println(account.toString());

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);

		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(account.toString());

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);

		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(account.toString());

		sc.close();
	}

}
