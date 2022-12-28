package model.entities;

import model.exceptions.BusinessException;

public class Account {
  private Double balance;
  private Integer number;
  private String holder;
  private Double withdrawLimit;

  public Account() {
  }

  public Account(Integer number, String holder, Double balance, double withdrawLimit) {
    this.balance = balance;
    this.number = number;
    this.holder = holder;
    this.withdrawLimit = withdrawLimit;
  }

  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }

  public Double getWithdrawLimit() {
    return withdrawLimit;
  }

  public void setWithdrawLimit(Double withdrawLimit) {
    this.withdrawLimit = withdrawLimit;
  }

  public void withDraw(double amount) throws BusinessException {
    validateWithdraw(amount);
    balance -= amount + 5.0;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  private void validateWithdraw(double amount) throws BusinessException {
    if (amount > getWithdrawLimit()) {
      throw new BusinessException("Erro de saque: A quantia excede o limite de saque.");
    }
    if (amount > getBalance()) {
      throw new BusinessException("Erro de saque: Saldo insuficiente!");
    }
  }
}
