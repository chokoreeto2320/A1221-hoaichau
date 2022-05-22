package Model;

public class SanPhamNhapKhau extends SanPham{
    private double giaNhapKhau;
    private String thanhPho;
    private double thue;

    public SanPhamNhapKhau(int thue){

    }

    public SanPhamNhapKhau(double giaNhapKhau, String thanhPho, double thue) {
        this.giaNhapKhau = giaNhapKhau;
        this.thanhPho = thanhPho;
        this.thue = thue;
    }

    public SanPhamNhapKhau(int id, String ten, double gia, String nhaSanXuat, int data, int soLuong, double giaNhapKhau, String thanhPho, double thue) {
        super(id, ten, gia, nhaSanXuat, data, soLuong);
        this.giaNhapKhau = giaNhapKhau;
        this.thanhPho = thanhPho;
        this.thue = thue;
    }

    public double getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(double giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    @Override
    public String toString() {
        return "NhapKhau{" +
                "giaNhapKhau=" + giaNhapKhau +
                ", thanhPho='" + thanhPho + '\'' +
                ", thue=" + thue +
                '}';
    }
}
