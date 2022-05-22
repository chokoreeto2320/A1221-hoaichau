package mobile_manager.Model;

public class AuthenticMobile extends Mobile{
    private String warrantyPeriod;
    private String warrantycode;

    public AuthenticMobile(){}

    public AuthenticMobile(String warrantyPeriod, String warrantycode) {
        this.warrantyPeriod = warrantyPeriod;
        this.warrantycode = warrantycode;
    }

    public AuthenticMobile(String type, int id, String name, Double price, String manufacturer, int warrantyPeriod, int warrantyCode) {
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantycode() {
        return warrantycode;
    }

    public void setWarrantycode(String warrantycode) {
        this.warrantycode = warrantycode;
    }

    @Override
    public String toString() {
        return "AuthenticMobile{" +
                "warrantyPeriod='" + warrantyPeriod + '\'' +
                ", warrantycode='" + warrantycode + '\'' +
                '}';
    }

}
