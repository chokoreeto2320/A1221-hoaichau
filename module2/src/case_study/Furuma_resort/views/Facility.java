package case_study.Furuma_resort.views;

import java.util.Scanner;

public class Facility {
    static Scanner scanner = new Scanner(System.in);

    public static void displayFacilityMenu() {
        int choice;
        do {
            System.out.println("-------------------------");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            System.out.println("Enter your choice:");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice <= 0 || choice > 4);
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                HomeView.displayMenu();
                break;
        }
    }
}
