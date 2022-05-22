package case_study.Furuma_resort.models;

public abstract class Person {
    private int iD;
    private String name;
    private int age;
    private String sex ;
    private String address;
    private String idCard;
    private String email;

    public Person(){
    }

    public Person(int iD, String name, int age, String sex, String address, String idCard, String email) {
        this.iD = iD;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.idCard = idCard;
        this.email = email;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "iD=" + iD +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", idCard='" + idCard + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public abstract int getId();
}
