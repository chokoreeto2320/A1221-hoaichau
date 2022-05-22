package case_study.Furuma_resort.services.impl;

import case_study.Furuma_resort.models.Employee;
import case_study.Furuma_resort.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
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
        System.out.println("nhap level");
        String level = scanner.nextLine();
        System.out.println("nhap vi tri");
        String position = scanner.nextLine();
        System.out.println("nhap luong");
        int salary = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(id, name, age, address, sex, idCard, email, level, position, salary);
        employeeList.add(employee);
    }
    public Employee isEmployee(int employeeCode) {
        for (Employee employees : employeeList) {
            if (employees.getId() == employeeCode) {
                return employees;
            }
        }
        return null;
    }
    @Override
    public void edit() {

        System.out.println("Nhap ma vien can sua: ");
        int employeeCode = 0;
        try {
            employeeCode = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Sai ma, nhap lai: ");
        }
        Employee employee = isEmployee(employeeCode);
        if (employee != null) {
            System.out.println("Chon:  ");
            System.out.println("1. Name:  ");
            System.out.println("2. Email: ");
            System.out.println("3. Chuc vu: ");
            System.out.println("4. Luong: ");
            System.out.println("5.Tro lai");
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
                        employee.setName(name);
                        display();
                        break;
                    case 2:
                        System.out.println("Email moi:");
                        email = scanner.nextLine();
                        employee.setEmail(email);
                        display();
                        break;
                    case 3:
                        String position;
                        System.out.println("Chuc vu moi: ");
                        try {
                            position = scanner.nextLine();
                            employee.setPosition(position);
                        } catch (NumberFormatException e) {
                            System.out.println("Import bad format, please enter back");
                        }
                        display();
                        break;
                    case 4:
                        int salary = 0;
                        System.out.println("Luong moi: ");
                        try {
                            salary = Integer.parseInt(scanner.nextLine());
                            employee.setSalary(salary);
                        } catch (NumberFormatException e) {
                            System.out.println("Import bad format, please enter back");
                        }
                        display();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Invalid choice! Exit!");
                }
            }
        } else {
            System.out.println("id not found");
            edit();
        }
        //ReadAndWrite.write(employeeList, "D:\\A0421I1_Tran_Quoc_Nha\\module1\\module2\\src\\cassestudy\\data\\employee.csv");
    }

    @Override
    public void delete() {

    }
}
