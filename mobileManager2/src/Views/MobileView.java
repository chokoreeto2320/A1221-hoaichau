package MoblieManager.Views;

import MoblieManager.Models.AuthenticMobile;
import MoblieManager.Models.HandCarriedMobile;
import MoblieManager.Models.Mobile;
import MoblieManager.Service.MobileService;

import java.util.List;
import java.util.Scanner;


public class MobileView {
    public static void main(String[] args) {
        mainMenu();
    }
    static MobileService mobileService = new MobileService();
    private static Scanner scanner = new Scanner(System.in);
    public static void mainMenu(){
        while (true){
            System.out.println("------ Mobile Manager ------");
            System.out.println("1. Add new Mobile");
            System.out.println("2. Delete by ID");
            System.out.println("3. Display all Mobiles");
            System.out.println("4. Search by Name");
            System.out.println("5. Exit");
            System.out.println(" Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    searchByName();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
    private static  void add(){
        while (true){
            System.out.println("1. Authentic Mobile");
            System.out.println("2. Hand-Carried Mobile");
            System.out.println("3. Return Main Menu");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Price: ");
            Double price = Double.parseDouble(scanner.nextLine());
            System.out.print("Manufacturer: ");
            String manufacturer = scanner.nextLine();

            if (choice == 1){
                System.out.print("Warranty Period: ");
                int warrantyPeriod = Integer.parseInt(scanner.nextLine());
                System.out.print("Warranty Code: ");
                int warrantyCode = Integer.parseInt(scanner.nextLine());
                AuthenticMobile mobile = new  AuthenticMobile("Authentic Mobile",
                        0,name,price,manufacturer,warrantyPeriod,warrantyCode);
                mobileService.add(mobile);

            }
            else if (choice == 2){
                System.out.print("Nation: ");
                String nation = scanner.nextLine();
                System.out.print("Status: ");
                String status = scanner.nextLine();
                HandCarriedMobile mobile = new HandCarriedMobile("Hand-Carried Mobile",
                        0,name,price,manufacturer,nation,status);
                mobileService.add(mobile);
            }
            else {
                return;
            }
            System.out.println("Create Successfully!!!");
        }
    }

    private static void display() {
        List<Mobile> mobiles = MobileService.findAll();
        if(mobiles.size() >0 ){
            for (Mobile p : mobiles) {
                if(p instanceof AuthenticMobile){
                    System.out.printf("Authentic Product: id = %s, name = %s, price = %s," +
                                    " manufacturer=%s, WarrantyPeriod =%s, WarrantyCode = %s\n "
                            , p.getId(), p.getName(), p.getPrice(),
                            p.getManufacturer(), ((AuthenticMobile) p).getWarrantyPeriod(),((AuthenticMobile) p).getWarrantyCode());
                }
                else {
                    System.out.printf("Hand Product: id = %s, name = %s, price = %s," +
                                    " manufacturer=%s, nation = %s, status = %s\n"
                            , p.getId(), p.getName(), p.getPrice(),
                            p.getManufacturer(), ((HandCarriedMobile) p).getNation(), ((HandCarriedMobile) p).getStatus());
                }
            }
        }
        else {
            System.out.println("Product List is empty");
        }
    }

    private static void delete() {
        display();
        System.out.print("Enter id to delete:");
        int id = Integer.parseInt(scanner.nextLine());
        MobileService.delete(id);
        System.out.println("Deleted successfully");
    }

    private static void searchByName() {
        System.out.print("Enter name to search:");
        String name = scanner.nextLine();
        List<Mobile> mobiles = MobileService.searchByName(name);

        for (Mobile p : mobiles){

            if(p instanceof AuthenticMobile){
                System.out.printf("Authentic Product: id = %s, name = %s, price = %s," +
                                " manufacturer=%s, WarrantyPeriod =%s, WarrantyCode = %s\n "
                        , p.getId(), p.getName(), p.getPrice(),
                        p.getManufacturer(), ((AuthenticMobile) p).getWarrantyPeriod(),((AuthenticMobile) p).getWarrantyCode());
            }
            else {
                System.out.printf("Hand Product: id = %s, name = %s, price = %s," +
                                " manufacturer=%s, nation = %s, status = %s\n"
                        , p.getId(), p.getName(), p.getPrice(),
                        p.getManufacturer(), ((HandCarriedMobile) p).getNation(), ((HandCarriedMobile) p).getStatus());
            }
        }
    }


}
