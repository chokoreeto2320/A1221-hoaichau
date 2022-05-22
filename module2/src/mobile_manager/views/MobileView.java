package mobile_manager.views;

import java.util.Scanner;

public class MobileView {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        while (true) {
            System.out.println("1.Creat");
            System.out.println("2.Display");
            System.out.println("3.Delete");
            System.out.println("4.Search by Name");
            System.out.println("5. Enter your choice");

            int choose = 0;
            do {
                choose = Integer.parseInt(scanner.nextLine());
            } while (choose <= 0 && choose > 5);

            switch (choose) {
                case 1:
                    creat();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    System.exit(0);

            }


        }
    }

    private static void search() {
    }

    private static void delete() {
    }

    private static void display() {
    }

    private static void creat() {
        while (true) {
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


        }


    }
}