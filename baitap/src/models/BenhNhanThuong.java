package models;

public class BenhNhanThuong extends BenhNhan{
    private double chiPhi;

    public BenhNhanThuong() {
    }

    public BenhNhanThuong(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String liDo, double chiPhi) {
        super(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, liDo);
        this.chiPhi = chiPhi;
    }

    public double getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(double chiPhi) {
        this.chiPhi = chiPhi;
    }

    @Override
    public String toStringDisplay() {
        return "BenhNhanThuong{" + super.toStringDisplay() + "," +
                "chiPhi=" + chiPhi +
                '}';
    }

    @Override
    public String toString() {
        return super.toString() + "," + chiPhi;
    }
}
