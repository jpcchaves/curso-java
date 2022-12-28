package model.entities;

public class Individual extends TaxPayer {

  Double healthExpenditures;

  public Individual() {
  }

  public Individual(String name, Double anualIcome, Double healthExpenditures) {
    super(name, anualIcome);
    this.healthExpenditures = healthExpenditures;
  }

  public Double getHealthExpenditures() {
    return healthExpenditures;
  }

  public void setHealthExpenditures(Double healthExpenditures) {
    this.healthExpenditures = healthExpenditures;
  }

  @Override
  public Double tax() {
    double basicTax;
    if (getAnualIcome() < 20000.00) {
      basicTax = getAnualIcome() * 0.15;
    } else {
      basicTax = getAnualIcome() * 0.25;
    }

    basicTax -= getHealthExpenditures() * 0.5;

    if (basicTax < 0.0) {
      return basicTax = 0.0;
    } else {
      return basicTax;
    }
  }
}
