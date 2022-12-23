package entities;

public class Product162 {
  protected Double price;
  private String name;

  public Product162() {
  }

  public Product162(String name, Double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Double totalPrice() {
    return price;
  }

  public String priceTag() {
    return name
            + " $ "
            + String.format("%.2f", price);
  }

}
