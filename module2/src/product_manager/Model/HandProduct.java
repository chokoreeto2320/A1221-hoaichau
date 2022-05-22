package product_manager.Model;

public class HandProduct extends Product{
    private String country;
    private String state;

    public HandProduct(){}

    public HandProduct(String country, String state) {
        this.country = country;
        this.state = state;
    }

    public HandProduct(int iD, String name, int price, String manufacturer, String country, String state) {
        super(iD, name, price, manufacturer);
        this.country = country;
        this.state = state;
    }

    public HandProduct(int iD, String name, Double price, String manufacturer, String country, String state) {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "HandProduct{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
