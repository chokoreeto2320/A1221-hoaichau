package oop;

import java.util.Scanner;

public class ProductView {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("--- Product Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Edit");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            int choose = 0;
            do {
                System.out.print("Please input your choice: ");
                choose = Integer.parseInt(scanner.nextLine());

            } while (choose <= 0 && choose > 5);


            switch (choose) {
                case 1:
                    add();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    System.exit(0);
            }
        }


    }

    private static void add() {
        System.out.println("feature add");
    }

    private static void edit() {
        System.out.println("feature edit");
    }

    private static void delete() {
        System.out.println("feature delete");

    }

    private static void display() {
        System.out.println("feature display");

    }

}
