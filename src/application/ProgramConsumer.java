package application;

import model.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramConsumer {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    List<Product> list = new ArrayList<>();

    list.add(new Product("TV", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));

//    list.forEach(new PriceUpdate());

    double factor = 1.1;
    list.forEach(product -> product.setPrice(product.getPrice() * factor));

    for (Product p : list
    ) {
      System.out.printf("Produto: " + "%s" + ", Preço: " + "R$ " + "%.2f%n", p.getName(),
              p.getPrice());
    }


  }
}
