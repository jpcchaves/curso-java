package application;

import model.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramFunction {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    List<Product> list = new ArrayList<>();

    list.add(new Product("TV", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));

    List<String> names = list.stream().map(p -> p.getName().toUpperCase()).toList();

    names.forEach(System.out::println);

  }
}
