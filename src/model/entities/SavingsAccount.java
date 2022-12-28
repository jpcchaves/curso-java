package model.entities;

public class SavingsAccount {

  private Double interestRate;

  public SavingsAccount() {
    super();
  }

  public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
//    super(number, holder, balance);
    this.interestRate = interestRate;
  }

  public Double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(Double interestRate) {
    this.interestRate = interestRate;
  }

//  public void updateBalance() {
//    balance += balance * interestRate;
//  }
//
//  public void withDraw(double amount) {
//    balance -= amount;
//  }
}
