package case_study.Furuma_resort.views;

import java.util.Scanner;


public class HomeView {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        while (true) {
            System.out.println("1.Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6.Exit");
            System.out.println("Nhap vao lua chon cua ban: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    Employee.displayEmployeeMenu();
                    break;
                case 2:
                    Customer.displayCustomerMenu();
                    break;
                case 3:
                    Facility.displayFacilityMenu();
                    break;
                case 4:
                    Booking.displayBookingMenu();
                    break;
                case 5:
                    Promotion.displayPromotionMenu();
                    break;
                case 6:
                    System.exit(1);
                    break;

            }


        }
    }


}
