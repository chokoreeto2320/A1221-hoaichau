package ss12_java_collection_framework.baitap;

public class Product {
    private int id;
    private String name;
    private String Price;

    public Product() {
    }

    public Product(int id, String name, String price) {
        this.id = id;
        this.name = name;
        Price = price;
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

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", name='" + name + '\'' +
                        ", Price='" + Price + '\'' ;
    }
}
