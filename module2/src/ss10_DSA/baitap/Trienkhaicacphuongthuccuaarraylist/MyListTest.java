package ss10_DSA.baitap.Trienkhaicacphuongthuccuaarraylist;

public class MyListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Hau");
        Student student2 = new Student(2, "Nam");
        Student student3 = new Student(3, "Cong");
        Student student4 = new Student(4, "Nha");
        Student student5 = new Student(5, "Quang");
        Student student6 = new Student(5, "Quang2");

        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> NewstudentMyList = new MyList<>();
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);
        studentMyList.add(student5);
        studentMyList.add(student6, 3);
        studentMyList.size();
        NewstudentMyList = studentMyList.clone();
        Student student = NewstudentMyList.remove(3);
        System.out.println(student.getName());

    }
}
