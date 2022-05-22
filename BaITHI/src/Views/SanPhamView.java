package Views;

import Model.SanPhamNhapKhau;
import Model.SanPham;
import Model.SanPhamXuatKhau;
import Service.SanPhamService;

import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.delete;


public class SanPhamView {
    private static Scanner scanner = new Scanner(System.in);
    private static SanPhamService sanPhamService = new SanPhamService();
    private static double giaXuatKhau;


    public static void main(String[] args) {
        SanPhamView sanPhamView = new SanPhamView();
        while (true) {
            System.out.println("Chon chuc nang theo so de tiep tuc");
            System.out.println("1. Them moi");
            System.out.println("2. Xoa");
            System.out.println("3. Xem danh sach cac san pham");
            System.out.println("4. Tim Kiem");
            System.out.println("5. Exit");

            System.out.print("Enter your choice:");

            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    sanPhamView.create();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    delete();

                    break;
                case 4:
                    searchByName();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void delete() {
        delete();
        System.out.print("Enter id to delete:");
        int id = Integer.parseInt(scanner.nextLine());
        SanPhamService.delete(id);
        System.out.println("Deleted successfully");
    }

    private static void searchByName() {
        System.out.print("Enter name to search:");
        String name = scanner.nextLine();
        List<SanPham> sanPhams = SanPhamService.searchByName(name);

        for (SanPham s : sanPhams) {
            System.out.println(s);
        }
    }


    private static void display() {
        List<SanPham> sanPhams = SanPhamService.findAll();
        if (sanPhams.size() > 0) {
            for (SanPham s : sanPhams) {
                if (s instanceof SanPhamNhapKhau) {
                    System.out.printf("Nhap khau: ten = %s, gia=%s, thue =%s\n"
                            , s.getTen(), s.getGiaBan(), ((SanPhamNhapKhau) s).getThue());
                } else {
                    System.out.printf("XuatKhau: price = %s, country=%s\n"
                            , s.getGiaBan());
                }
            }
        } else {
            System.out.println("Danh sach san pham rong");
        }
    }


    private void create() {
        System.out.println("Chon loai san pham:");
        System.out.println("1. Nhap Khau");
        System.out.println("2. Xuat Khau");
        int choice = Integer.parseInt(scanner.nextLine());

        System.out.println("Id");
        int iD = Integer.parseInt(scanner.nextLine());
        System.out.println("Ten");
        String name = scanner.nextLine();
        System.out.println("Gia ban");
        Double giaBan = Double.parseDouble(scanner.nextLine());
        System.out.println("Nha san xuat ");
        String nhaSanXuat = scanner.nextLine();
        System.out.println("data");
        int data = Integer.parseInt(scanner.nextLine());
        System.out.println("So luong");
        int soLuong = Integer.parseInt(scanner.nextLine());
        if (choice == 1){
            // nhap thuoc tinh
            SanPhamNhapKhau sanPhamNhapKhau = new SanPhamNhapKhau(1,name,);
            System.out.print("Thanh pho nhap khau");
            String thanhPho = scanner.nextLine();
            System.out.print("Gia nhap khau");
            Double price = Double.parseDouble(scanner.nextLine());
            System.out.print("Thue nhap khau");
            String manufacturer = scanner.nextLine();
        } else {

        }
    }


}















