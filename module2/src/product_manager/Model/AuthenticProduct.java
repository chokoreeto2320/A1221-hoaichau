package product_manager.Model;

public class AuthenticProduct extends Product {
    private int granteeByYear;

    public AuthenticProduct(){}

    public AuthenticProduct(int granteeByYear) {
        this.granteeByYear = granteeByYear;
    }

    public AuthenticProduct(int iD, String name, int price, String manufacturer, int granteeByYear) {
        super(iD, name, price, manufacturer);
        this.granteeByYear = granteeByYear;
    }

    public AuthenticProduct(int iD, String name, Double price, String manufacturer, int granteeByYear) {
    }

    public int getGranteeByYear() {
        return granteeByYear;
    }

    public void setGranteeByYear(int granteeByYear) {
        this.granteeByYear = granteeByYear;
    }

    @Override
    public String toString() {
        return "AuthenticProduct{" +
                "granteeByYear=" + granteeByYear +
                '}';
    }
}
