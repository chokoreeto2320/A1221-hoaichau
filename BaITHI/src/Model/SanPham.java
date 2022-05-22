package Model;

public abstract class SanPham {
    private int id;
    private String ten;
    private double giaBan;
    private String nhaSanXuat;
    private int data;
    private int soLuong;

    public SanPham(){}

    public SanPham(int id, String ten, double gia, String nhaSanXuat, int data, int soLuong) {
        this.id = id;
        this.ten = ten;
        this.giaBan = gia;
        this.nhaSanXuat = nhaSanXuat;
        this.data = data;
        this.soLuong = soLuong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", gia=" + giaBan +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                ", data=" + data +
                ", soLuong=" + soLuong +
                '}';
    }
}
