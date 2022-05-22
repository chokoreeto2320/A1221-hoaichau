package MoblieManager.Models;


public class HandCarriedMobile extends Mobile {
    private String nation;
    private String status;

    public HandCarriedMobile(String type, int id, String name, Double price, String manufacturer, String nation, String status) {
        super(type, id, name, price, manufacturer);
        this.nation = nation;
        this.status = status;
    }

    public HandCarriedMobile(String nation, String status) {
        this.nation = nation;
        this.status = status;
    }

    public HandCarriedMobile() {
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() + nation + "," + status;
    }
}
