package product_manager.Model;

public class HandcarrieProduct extends Product{
    private String country;
    private String state;

    public HandcarrieProduct(){}

    public HandcarrieProduct(String country, String state) {
        this.country = country;
        this.state = state;
    }

    public HandcarrieProduct(int iD, String name, int price, String manufacturer, String country, String state) {
        super(iD, name, price, manufacturer);
        this.country = country;
        this.state = state;
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
        return "HandcarrieProduct{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
