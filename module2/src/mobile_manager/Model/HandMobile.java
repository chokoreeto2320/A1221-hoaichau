package mobile_manager.Model;

public class HandMobile extends Mobile {
    private String country;
    private String status;

    public HandMobile(){}

    public HandMobile(String country, String status) {
        this.country = country;
        this.status = status;
    }

    public HandMobile(int ID, String name, Double price, String manufacture, String country, String status) {
        super(ID, name, price, manufacture);
        this.country = country;
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HandMobile{" +
                "country='" + country + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
