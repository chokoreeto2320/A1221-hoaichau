package case_study.Furuma_resort.views;

import case_study.Furuma_resort.controllers.EmployeeController;

import java.util.Scanner;

public class Employee {
    static Scanner scanner = new Scanner(System.in);
    private static EmployeeController employeeController = new EmployeeController();

    public static void displayEmployeeMenu() {
        int choice;
        do {
            System.out.println("-------------------------");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            System.out.println("Enter your choice:");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice <= 0 || choice > 4);
        switch (choice) {
            case 1:
//                display();
                break;
            case 2:
//                add();
                break;
            case 3:
//                edit();
                break;
            case 4:
                HomeView.displayMenu();
                break;
        }
    }
}


