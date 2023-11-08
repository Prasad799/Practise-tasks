package me.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class Billgenerator {
    public static void main(String[] args) {
        List<Product> availableProducts = new ArrayList<>();
        availableProducts.add(new Product("Sugar", 11));
        availableProducts.add(new Product("oil", 80));
        availableProducts.add(new Product("Rice", 30));
        availableProducts.add(new Product("Eggs", 140));
        availableProducts.add(new Product("Toamtoes",20));
        availableProducts.add(new Product("potatoes", 28));
        availableProducts.add(new Product("Bread", 29));
        availableProducts.add(new Product("Jam", 32));
        availableProducts.add(new Product("Sweets", 180));
        availableProducts.add(new Product("Ghee", 600));
        availableProducts.add(new Product("flour", 50));
        

        List<Product> cart = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Available Products:");
            for (int i = 0; i < availableProducts.size(); i++) {
                Product product = availableProducts.get(i);
                System.out.println(i + 1 + ". " + product.getName() + " - $" + product.getPrice());
            }

            System.out.print("Enter the product number to add to the cart (0 to finish): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            } else if (choice >= 1 && choice <= availableProducts.size()) {
                Product selectedProduct = availableProducts.get(choice - 1);
                cart.add(selectedProduct);
                System.out.println(selectedProduct.getName() + " added to the cart.");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        double total = 0;
        System.out.println("===== Invoice =====");
        for (Product item : cart) {
            System.out.println(item.getName() + ": $" + item.getPrice());
            total += item.getPrice();
        }
        System.out.println("Total: $" + total);
        System.out.println("===================");

        scanner.close();
    }
}

