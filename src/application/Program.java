package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.println("Product name: ");
        String name = sc.nextLine();
        System.out.println("Product price: ");
        double price = sc.nextDouble();
        System.out.println("Product quantity: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        double total = product.totalValueInStrock();

        System.out.printf(
                "Product data: %s, $ %.2f, %d units, Total: %.2f %n",
                product.getName(), product.getPrice(),
                product.getQuantity(), total);

        System.out.println(
                "Enter the number of products to be added in stock: ");
        int qtdAdded = sc.nextInt();


        System.out.printf("Quantity added to stock %d %n",
                qtdAdded);

        double updatedTotal = product.totalValueInStrock();

        System.out.printf(
                "%s, $ %.2f, %d units, Total: $ %.2f %n",
                product.getName(), product.getPrice(),
                product.getQuantity(), updatedTotal);

        System.out.println(
                "Enter the number of products to be removed from stock: ");
        int qtdeToRemove = sc.nextInt();
        product.removeproduct(qtdeToRemove);

        double updatedTotalAfterRemove = product
                .totalValueInStrock();

        System.out.println(product.toString());

        sc.close();
    }

}
