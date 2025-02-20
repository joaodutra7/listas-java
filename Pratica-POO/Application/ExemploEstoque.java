package Application;

import Entities.Product;
import java.util.Scanner;

public class ExemploEstoque {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price: ");
        double price = input.nextDouble();
        System.out.print("Quantity in Stock: ");
        int quantity = input.nextInt();

        Product product = new Product(name,price,quantity);

        product.setName("Computer");
        System.out.println("Updated name: " + product.getName());
        product.setPrice(1900);
        System.out.println("Updated price: " + product.getPrice());

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        quantity = input.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed in stock: ");
        quantity = input.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

    }

}
