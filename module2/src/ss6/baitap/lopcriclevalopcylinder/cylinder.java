package ss6.baitap.lopcriclevalopcylinder;

public class cylinder {
    private double chieuCao;

    public cylinder(int banKinh, double v, String black) {

    }

    public cylinder() {
//        super(banKinh, mauSac);
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    @Override
    public String toString() {
        return
                "chieuCao=" + chieuCao+","
                        +super.toString()
                ;
    }
}
