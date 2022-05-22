package product_manager.View;

import product_manager.Model.AuthenticProduct;
import product_manager.Model.HandProduct;
import product_manager.Model.Product;
import product_manager.Sevice.ProductService;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductService productService;


    public static void main(String[] args) {
        while (true) {
            System.out.println("--- Product Menu ---");
            System.out.println("1. Creat");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4.Search");
            System.out.println("5. Exit");

            int choose = 0;
            do {
                System.out.print("Please input your choice: ");
                choose = Integer.parseInt(scanner.nextLine());

            } while (choose <= 0 && choose > 5);


            switch (choose) {
                case 1:
                    creat();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    System.exit(0);
            }
        }


    }



    private static void creat() {
        System.out.println("Choice type product to creat");
        System.out.println("1.Authentic");
        System.out.println("2.Hand");
        int choice = Integer.parseInt(scanner.nextLine());

        System.out.println("name");
        String name = scanner.nextLine();
        System.out.println("Price");
        Double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Manufacturer");
        String manufacturer = scanner.nextLine();

        Product product;
        if(choice ==1){
            System.out.println("Grantee by year:");
            int granteeByYear = Integer.parseInt(scanner.nextLine());
            product = new AuthenticProduct(0, name, price, manufacturer, granteeByYear);
        }else{
            System.out.print("Country:");
            String country = scanner.nextLine();
            System.out.print("State:");
            String state = scanner.nextLine();
            product = new HandProduct(0, name, price, manufacturer, country, state);

            productService.create(product);
            System.out.println("Created successfully");

        }
    }




    private static void delete() {
        display();
        System.out.print("Enter id to delete:");
        int id = Integer.parseInt(scanner.nextLine());
        productService.delete(id);
        System.out.println("Deleted successfully");

    }

    private static void display() {
        List<Product> products = productService.findAll();
        if(products.size() >0 ){
            for (Product p : products) {
                if(p instanceof AuthenticProduct){
                    System.out.printf("Authentic Product: id = %s, name = %s, price = %s, manufacturer=%s, granteeByYear=%s\n"
                            , p.getiD(), p.getName(), p.getPrice(), p.getManufacturer(), ((AuthenticProduct) p).getGranteeByYear());
                }
                else {
                    System.out.printf("Hand Product: id = %s, name = %s, price = %s, manufacturer=%s, country=%s, status=%s\n"
                            , p.getiD(), p.getName(), p.getPrice(), p.getManufacturer(), ((HandProduct) p).getCountry(), ((HandProduct) p).getState());
                }
            }
        }
        else {
            System.out.println("Product List is empty");
        }
    }


    private static void search() {
        System.out.print("Enter name to search:");
        String name = scanner.nextLine();
        List<Product> products = productService.searchByName(name);

        for (Product p : products){
            System.out.println(p);
        }
    }

}
