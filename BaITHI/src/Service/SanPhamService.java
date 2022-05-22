package Service;

import Model.SanPham;
import Model.SanPhamNhapKhau;
import Model.SanPhamXuatKhau;
import utils.ConstantUtlis;
import utils.FileHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SanPhamService {

    private static List<SanPham> sanPhams = new ArrayList<>();
    private FileHelper fileHelper = new FileHelper();


    public SanPhamService() {
        sanPhams = mapTosanPhams();
    }


    public void create(SanPham sanPham) {

        //region get lastId
        int lastId = 0;
        if (sanPhams.size() > 0) {
            lastId = sanPhams.get(sanPhams.size() - 1).getId();
        }
        //endregion

        sanPham.setId(lastId + 1);
        sanPhams.add(sanPham);
        fileHelper.write(ConstantUtlis.path, Collections.singletonList(sanPham), true);
    }

    public static List findAll() {
        return sanPhams;
    }

    public static void delete(int id) {
        for (int i = 0; i < sanPhams.size(); i++) {
            if (sanPhams.get(i).getId() == id) {
                sanPhams.remove(i);
                FileHelper.write(ConstantUtlis.path, sanPhams, false);
                return;
            }
        }
    }

    public static List searchByName(String name) {
        List result = new ArrayList();

        for (int i = 0; i < sanPhams.size(); i++) {
            if (sanPhams.get(i).getTen().contains(name)) {
                result.add(sanPhams.get(i));
            }
        }

        return result;
    }

    private List mapTosanPhams() {
        List result = new ArrayList();

        List<String> lines = fileHelper.read(ConstantUtlis.path);
        for (String line : lines) {
            String[] tmp = line.split(",");
            int id = Integer.parseInt(tmp[0]);
            String name = tmp[1];
            Double price = Double.parseDouble(tmp[2]);
            String manufacturer = tmp[3];

            if (tmp.length == 5) {
                int thue = Integer.parseInt(tmp[4]);
                result.add(new SanPhamNhapKhau( thue));
            } else {
                String giaXuatKhau = tmp[4];
                String quocGia = tmp[5];
                result.add(new SanPhamXuatKhau(giaXuatKhau, quocGia));
            }
        }

        return result;
    }


}
