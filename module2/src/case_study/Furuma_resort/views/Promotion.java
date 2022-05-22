package case_study.Furuma_resort.views;

import java.util.Scanner;

public class Promotion {
    static Scanner scanner = new Scanner(System.in);

    public static void displayBookingMenu() {
        int choice;
        do {
            System.out.println("-------------------------");
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new constracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            System.out.println("Enter your choice:");
            choice= Integer.parseInt(scanner.nextLine());
        }while (choice <=0||choice > 6);

        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                HomeView.displayMenu();
                break;
        }
    }

    public static void displayPromotionMenu() {
    }
}
