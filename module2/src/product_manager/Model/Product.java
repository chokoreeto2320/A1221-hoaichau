package product_manager.Model;

public abstract class Product {
    private int iD;
    private String name;
    private double price;
    private String manufacturer;

    public Product(){}

    public Product(int iD, String name, double price, String manufacturer) {
        this.iD = iD;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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
        return "Product{" +
                "iD=" + iD +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }


}
