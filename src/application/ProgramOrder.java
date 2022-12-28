package application;

import model.entities.Client;
import model.entities.Order2;
import model.entities.OrderItem;
import model.entities.Product2;
import model.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramOrder {

  public static void main(String[] args) throws ParseException {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter client data:");
    System.out.print("Name: ");
    String name = sc.nextLine();
    System.out.print("Email: ");
    String email = sc.next();
    System.out.print("Birth date (DD/MM/YYYY): ");
    Date birthDate = sdf.parse(sc.next());

    Client client = new Client(name, email, birthDate);

    System.out.println("Enter order data:");
    System.out.print("Status: ");
    OrderStatus status = OrderStatus.valueOf(sc.next());

    Order2 order = new Order2(new Date(), status, client);

    System.out.print("How many items to this order? ");
    int N = sc.nextInt();

    for (int i = 1; i <= N; i++) {
      System.out.println("Enter #" + i + " item data:");
      System.out.print("Product name: ");
      sc.nextLine();
      String productName = sc.nextLine();
      System.out.print("Product price: ");
      double productPrice = sc.nextDouble();
      System.out.print("Quantity: ");
      int quantity = sc.nextInt();

      Product2 product = new Product2(productName, productPrice);

      OrderItem it = new OrderItem(quantity, productPrice, product);

      order.addItem(it);
    }

    System.out.println();
    System.out.println(order);


    sc.close();
  }
}