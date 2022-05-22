package mobile_manager.Model;

public class Mobile {
    private int ID;
    private String name;
    private Double price;
    private String manufacture;

    public Mobile(){}

    public Mobile(int ID, String name, Double price, String manufacture) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.manufacture = manufacture;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacture='" + manufacture + '\'' +
                '}';
    }
}
