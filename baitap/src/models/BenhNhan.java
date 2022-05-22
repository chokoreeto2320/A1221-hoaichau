package models;


    public abstract class BenhNhan {
        private int soThuTu;
        private String maBenhAn;
        private String maBenhNhan;
        private String tenBenhNhan;
        private String ngayNhapVien;
        private String ngayRaVien;
        private String liDo;

        public BenhNhan() {
        }

        public BenhNhan(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String liDo) {
            this.soThuTu = soThuTu;
            this.maBenhAn = maBenhAn;
            this.maBenhNhan = maBenhNhan;
            this.tenBenhNhan = tenBenhNhan;
            this.ngayNhapVien = ngayNhapVien;
            this.ngayRaVien = ngayRaVien;
            this.liDo = liDo;
        }

        public int getSoThuTu() {
            return soThuTu;
        }

        public void setSoThuTu(int soThuTu) {
            this.soThuTu = soThuTu;
        }

        public String getMaBenhAn() {
            return maBenhAn;
        }

        public void setMaBenhAn(String maBenhAn) {
            this.maBenhAn = maBenhAn;
        }

        public String getMaBenhNhan() {
            return maBenhNhan;
        }

        public void setMaBenhNhan(String maBenhNhan) {
            this.maBenhNhan = maBenhNhan;
        }

        public String getTenBenhNhan() {
            return tenBenhNhan;
        }

        public void setTenBenhNhan(String tenBenhNhan) {
            this.tenBenhNhan = tenBenhNhan;
        }

        public String getNgayNhapVien() {
            return ngayNhapVien;
        }

        public void setNgayNhapVien(String ngayNhapVien) {
            this.ngayNhapVien = ngayNhapVien;
        }

        public String getNgayRaVien() {
            return ngayRaVien;
        }

        public void setNgayRaVien(String ngayRaVien) {
            this.ngayRaVien = ngayRaVien;
        }

        public String getLiDo() {
            return liDo;
        }

        public void setLiDo(String liDo) {
            this.liDo = liDo;
        }

        public String toStringDisplay() {
            return "soThuTu=" + soThuTu +
                    ", maBenhAn='" + maBenhAn + '\'' +
                    ", maBenhNhan='" + maBenhNhan + '\'' +
                    ", tenBenhNhan='" + tenBenhNhan + '\'' +
                    ", ngayNhapVien='" + ngayNhapVien + '\'' +
                    ", ngayRaVien='" + ngayRaVien + '\'' +
                    ", liDo='" + liDo;
        }

        @Override
        public String toString() {
            return soThuTu +
                    "," + maBenhAn +
                    "," + maBenhNhan +
                    "," + tenBenhNhan +
                    "," + ngayNhapVien +
                    "," + ngayRaVien +
                    "," + liDo;
        }
}
