package models;

public class BenhNhanVip extends BenhNhan {
    private String loaiVip;

    public BenhNhanVip() {
    }

    public BenhNhanVip(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String liDo, String loaiVip) {
        super(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, liDo);
        this.loaiVip = loaiVip;
    }

    public String getLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }

    @Override
    public String toStringDisplay() {
        return "BenhNhanVip{" + super.toStringDisplay() + "," +
                "loaiVip='" + loaiVip + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return super.toString() + "," + loaiVip;
    }
}
