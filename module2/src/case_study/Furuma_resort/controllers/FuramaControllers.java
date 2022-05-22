package case_study.Furuma_resort.controllers;

import case_study.Furuma_resort.services.impl.CustomerServiceImpl;
import case_study.Furuma_resort.services.impl.EmployeeServiceImpl;
import case_study.Furuma_resort.services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaControllers {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        display();
    }

    public static void display() {
        while (true) {
            System.out.println("1.\tEmployee Management");
            System.out.println("2.\tCustomer Management");
            System.out.println("3.\tFacility Management ");
            System.out.println("4.\tBooking Managerment");
            System.out.println("5.\tPromotion Management");
            System.out.println("6.\tExit");
            System.out.println("chon so chuc nang can dung");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagerment();
                    break;
                case 5:
                    promotionManagement();
                    break;
                case 6:
                    System.exit(0);
            }
        }

    }

    public static void employeeManagement() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        while (true) {
            System.out.println("1\tDisplay list employees");
            System.out.println("2\tAdd new employee");
            System.out.println("3\tEdit employee");
            System.out.println("4\tReturn main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    display();
            }
        }
    }

    public static void customerManagement() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        while (true) {
            System.out.println("1.\tDisplay list customers");
            System.out.println("2.\tAdd new customer");
            System.out.println("3.\tEdit customer");
            System.out.println("4.\tReturn main menu");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.addNew();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    display();
            }
        }
    }

    public static void facilityManagement() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        while (true) {
            System.out.println("1\tDisplay list facility");
            System.out.println("2\tAdd new facility");
            System.out.println("3\tDisplay list facility maintenance");
            System.out.println("4.\tReturn main menu");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    addNewfacilityMenu();
                    break;
                case 3:
                    System.out.println("3\tDisplay list facility maintenance");
                    break;
                case 4:
                    display();
            }
        }
    }

    public static void addNewfacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        while (true) {
            System.out.println("1\tAdd new villa");
            System.out.println("2\tAdd new house");
            System.out.println("3\tAdd new room");

            System.out.println("4.\tReturn main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    facilityService.addNewVilla();
                    facilityManagement();
                    break;
                case 2:
                    facilityService.addNewHouse();
                    facilityManagement();
                    break;
                case 3:
                    facilityService.addNewRoom();
                    break;
                case 4:
                    display();
            }
        }
    }

    public static void bookingManagerment() {
        System.out.println("1.\tAdd new booking");
        System.out.println("2.\tDisplay list booking");
        System.out.println("3.\tCreate new constracts");
        System.out.println("4.\tDisplay list contracts");
        System.out.println("5.\tEdit contracts");
        System.out.println("6.\tReturn main menu");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("1.\tAdd new booking");
                break;
            case 2:
                System.out.println("2.\tDisplay list booking");
                break;
            case 3:
                System.out.println("3.\tCreate new constracts");
                break;
            case 4:
                System.out.println("4.\tDisplay list contracts");
                break;
            case 5:
                System.out.println("5.\tEdit contracts");
                break;
            case 6:
                display();
        }
    }

    public static void promotionManagement() {
        System.out.println("1.\tDisplay list customers use service");
        System.out.println("2.\tDisplay list customers get voucher");
        System.out.println("3.\tReturn main menu");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("1.\tDisplay list customers use service");
                break;
            case 2:
                System.out.println("2.\tDisplay list customers get voucher");
                break;
            case 3:
                display();
        }
    }
}
