package oop;

import java.util.List;
import java.util.Scanner;

public class Main {
   static Scanner scanner = new Scanner(System.in);
   private List<Product> productList = ProductManager.getProductList();
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        while(true){
            System.out.println("1. Add Product");
            System.out.println("2. Edit Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Products");
            System.out.println("5. Find Product by name");
            System.out.println("6. Sort product ");
            System.out.println("7. Exit");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    productManager.add(productManager.showAddProduct());

                    break;
                case 4:
                    productManager.displayProduct(ProductManager.getProductList());
                    break;

            }

        }
    }
}
