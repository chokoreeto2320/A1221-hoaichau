package ss8_cleancode.thuchanh.demo_mvc.view;

import ss8_cleancode.thuchanh.demo_mvc.controller.StudentController;
import ss8_cleancode.thuchanh.demo_mvc.model.Student;

import java.util.Scanner;

public class StudentView {
 private static StudentController studentController = new StudentController();
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("chuong trinh quan li sinh vien");
        while (true){
            System.out.println("1.Xem danh sach hoc sinh");
            System.out.println("2.Them moi hoc sinh");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    StudentController.display();

                    break;
                case 2:
                    Student student = getInformationOffStudent();
                    StudentController.addStudent(student);
                    break;
            }
        }
    }

    private static Student getInformationOffStudent() {
        System.out.println("ten hoc sinh:");
        String name = scanner.nextLine();
        System.out.println("diem cua hoc sinh");
        Double point = scanner.nextDouble();
        System.out.println("tuoi cua hoc sinh");
        int age = scanner.nextInt();
        Student student = new Student(name, point, age);
        return student;

    }


}
