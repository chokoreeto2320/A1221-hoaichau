package ss6.baitap.lopcriclevalopcylinder;

public class circle {
    private double banKinh;
    private String mauSac;

    public circle() {

    }

    public circle(double banKinh) {
        this.banKinh = banKinh;
    }

    public circle(double banKinh, String mauSac) {
        this.banKinh = banKinh;
        this.mauSac = mauSac;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    @Override
    public String toString() {
        return
                "banKinh=" + banKinh +
                        ", mauSac='" + mauSac +"' "
                ;
    }
}
