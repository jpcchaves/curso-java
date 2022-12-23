package application;

import entities.ImportedProduct;
import entities.Product162;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ProgramProducts {
  public static void main(String[] args) throws ParseException {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Date manufactureDate;

    List<Product162> list = new ArrayList<>();

    System.out.print("Enter the number of products: ");
    Integer N = sc.nextInt();

    for (int i = 1; i <= N; i++) {
      System.out.println("Product #" + i + " data: ");

      System.out.print("Common, user or imported (c/u/i)? ");
      Character priceTag = sc.next().charAt(0);

      sc.nextLine();
      System.out.print("Name: ");
      String name = sc.nextLine();

      System.out.print("Price: ");
      Double price = sc.nextDouble();


      if (priceTag == 'i') {
        System.out.print("Customs fee: ");
        Double customsFee = sc.nextDouble();

        Product162 prod = new ImportedProduct(name, price, customsFee);

        list.add(prod);
      } else if (priceTag == 'c') {

        Product162 prod = new Product162(name, price);
        list.add(prod);

      } else if (priceTag == 'u') {
        System.out.print("Manufactured data (DD/MM/YYYY): ");
        Date manufacturedData = sdf.parse(sc.next());

        Product162 prod = new UsedProduct(name, price, manufacturedData);

        list.add(prod);
      }

    }
    System.out.println();
    System.out.println("Price tags: ");
    for (Product162 prod : list
    ) {
      System.out.println(prod.priceTag());
    }

    sc.close();
  }
}


