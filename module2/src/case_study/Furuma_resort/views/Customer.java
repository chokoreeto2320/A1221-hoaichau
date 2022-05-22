package case_study.Furuma_resort.views;

import case_study.Furuma_resort.controllers.FuramaControllers;

import java.util.Scanner;

public class Customer {
    static Scanner scanner = new Scanner(System.in);
    private static FuramaControllers controller = new FuramaControllers();

    public static void displayCustomerMenu() {
        int choice;
        do {
            System.out.println("-------------------------");
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            System.out.println("Enter your choice:");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice <= 0 || choice > 4);
        switch (choice) {
            case 1:
                displayCustomerList();
                break;
            case 2:
                inputCustomerList();
                break;
            case 3:
                editCustomerList();
                break;
            case 4:
                HomeView.displayMenu();
                break;
        }

    }


    public static void displayCustomerList() {

    }

    public static void inputCustomerList() {

    }

    public static void editCustomerList() {

    }

}
