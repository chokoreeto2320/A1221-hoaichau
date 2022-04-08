package ss8_cleancode.thuchanh.demo_mvc.model;

public class Student {
    private String name;
    private int age;
    private double point;

    public Student() {
    }


    public Student(String name, int age, double point) {
        this.name = name;
        this.age = age;
        this.point = point;
    }

    public Student(String name, Double point, int age) {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPoint() {
        return point;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPoint(double point) {
        this.point = point;
    }
}
