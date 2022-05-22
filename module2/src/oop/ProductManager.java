package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    static List<Product> productList = new ArrayList<>();



    public static List<Product> getProductList() {
        return productList;
    }

    public static void setProductList(List<Product> productList) {
        ProductManager.productList = productList;
    }

    Scanner scanner = new Scanner(System.in);


    public void add(Product product){
        productList.add(product);


    }
    public Product showAddProduct() {
        System.out.println(" Enter the ID");
        int ID = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the Name of Product");
        String name = scanner.nextLine();
        System.out.println("Enter price of Product");
        int price = Integer.parseInt(scanner.nextLine());
        return new Product(ID, name, price);
    }
    public void displayProduct(List<Product> productList){
        for (Product product : productList
             ) {
            System.out.println(product);
        }
    }


}
