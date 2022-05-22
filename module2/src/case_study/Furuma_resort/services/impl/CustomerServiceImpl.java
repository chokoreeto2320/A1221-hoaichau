package case_study.Furuma_resort.services.impl;

import case_study.Furuma_resort.models.Customer;
import case_study.Furuma_resort.services.CustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("nhap id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap ten");
        String name = scanner.nextLine();
        System.out.println("nhap tuoi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap dia chi");
        String address = scanner.nextLine();
        System.out.println("nhap gioi tinh");
        String sex = scanner.nextLine();
        System.out.println("nhap id card");
        String idCard = (scanner.nextLine());
        System.out.println("nhap email");
        String email = scanner.nextLine();
        System.out.println("nhap loai khach");
        String typeCustomer = scanner.nextLine();
        Customer customer = new Customer(id, name, age, address, sex, idCard, email, typeCustomer);
        customerList.add(customer);
    }

    public Customer isCustomer(int customerCode) {
        for (Customer customers : customerList) {
            if (customers.getId() == customerCode) {
                return customers;
            }
        }
        return null;
    }

    @Override
    public void edit() {
        System.out.println("Nhap khach hang can sua: ");
        int customerCode = 0;
        try {
            customerCode = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Sai ma, nhap lai: ");
        }
        Customer customer = isCustomer(customerCode);
        if (customer != null) {
            System.out.println("Chon:  ");
            System.out.println("1. Name:  ");
            System.out.println("2. Email: ");
            System.out.println("3. Loai khach: ");
            System.out.println("4.Tro lai");
            int choice = 1;
            String email;
            while (choice != 0) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Nhap sai chuc nang, nhap lai: ");
                }
                switch (choice) {
                    case 1:
                        System.out.println("Enter new Name:");
                        String name = scanner.nextLine();
                        customer.setName(name);
                        display();
                        break;
                    case 2:
                        System.out.println("Email moi:");
                        email = scanner.nextLine();
                        customer.setEmail(email);
                        display();
                        break;
                    case 3:
                        String typeCustomer;
                        System.out.println("Loai khach moi: ");
                        try {
                            typeCustomer = scanner.nextLine();
                            customer.setTypeCustomer(typeCustomer);
                        } catch (NumberFormatException e) {
                            System.out.println("Import bad format, please enter back");
                        }
                        display();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Invalid choice! Exit!");
                }
            }
        } else {
            System.out.println("id not found");
            edit();
        }
    }

    @Override
    public void delete() {

    }
}
