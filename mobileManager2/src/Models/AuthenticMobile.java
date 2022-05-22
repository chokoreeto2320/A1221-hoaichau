package MoblieManager.Models;

public class AuthenticMobile extends Mobile {
    private int warrantyPeriod;
    private int warrantyCode;

    public AuthenticMobile(int warrantyPeriod, int warrantyCode) {
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyCode = warrantyCode;
    }

    public AuthenticMobile() {
    }

    public AuthenticMobile(String type, int id, String name, Double price, String manufacturer, int warrantyPeriod, int warrantyCode) {
        super(type, id, name, price, manufacturer);
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyCode = warrantyCode;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyCode() {
        return warrantyCode;
    }

    public void setWarrantyCode(int warrantyCode) {
        this.warrantyCode = warrantyCode;
    }

    @Override
    public String toString() {
        return super.toString() + warrantyPeriod + "," + warrantyCode ;
    }
}
