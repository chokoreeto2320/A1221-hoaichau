package ss8_cleancode.thuchanh.demo_mvc.service.impl;

import ss8_cleancode.thuchanh.demo_mvc.model.Student;
import ss8_cleancode.thuchanh.demo_mvc.repository.IStudentReponsitory;
import ss8_cleancode.thuchanh.demo_mvc.repository.impl.StudentReponsitory;
import ss8_cleancode.thuchanh.demo_mvc.service.IStudentService;

public class StudentService  implements IStudentService {
    private static StudentReponsitory studentReponsitory = new StudentReponsitory();

    @Override
    public void addStudent(Student student) {

        if (student.getPoint() < 0) {
            System.out.println("khong hop le !");
        } else {
            IStudentReponsitory.saveStudent(student);

        }


    }
}
