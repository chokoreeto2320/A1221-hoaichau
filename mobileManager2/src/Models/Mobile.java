package MoblieManager.Models;

public class Mobile {
    private String type;
    private int id;
    private String name;
    private Double price;
    private String manufacturer;

    public Mobile(String type, int id, String name, Double price, String manufacturer) {
        this.type = type;
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public Mobile() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,", type, id , name, price, manufacturer);
    }
}
