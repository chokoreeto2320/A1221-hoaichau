package Model;

public class SanPhamXuatKhau extends SanPham {
    private double giaXuatKhau;
    private String quocGia;

    public SanPhamXuatKhau(int i, String name, Double price, String manufacturer, String country, String status){}

    public SanPhamXuatKhau(double giaXuatKhau, String quocGia) {
        this.giaXuatKhau = giaXuatKhau;
        this.quocGia = quocGia;
    }

    public SanPhamXuatKhau(int id, String ten, double gia, String nhaSanXuat, int data, int soLuong, double giaXuatKhau, String quocGia) {
        super(id, ten, gia, nhaSanXuat, data, soLuong);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGia = quocGia;
    }

    public SanPhamXuatKhau(String giaXuatKhau, String quocGia) {
    }


    public double getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(double giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    @Override
    public String toString() {
        return "XuatKhau{" +
                "giaXuatKhau=" + giaXuatKhau +
                ", quocGia='" + quocGia + '\'' +
                '}';
    }
}
