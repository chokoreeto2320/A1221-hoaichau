package case_study.Furuma_resort.models;

public  class Customer extends Person{
    private String typeCustomer;

    public Customer() {
    }

    public Customer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public Customer(int iD, String name, int age, String sex, String address, String idCard, String email, String typeCustomer) {
        super(iD, name, age, sex, address, idCard, email);
        this.typeCustomer = typeCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "typeCustomer='" + typeCustomer + '\'' +
                '}';
    }

    @Override
    public int getId() {
        return 0;
    }


}
