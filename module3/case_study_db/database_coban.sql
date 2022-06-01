use caseStudy_Database;
-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu
--  là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
select *
from nhan_vien
where (ho_ten like '%h' or ho_ten like '%k' or ho_ten like '%t') and length (ho_ten <15);

-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và 
-- có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select *
from khach_hang
where(year(curdate()) - year(ngay_sinh) between 18 and 50) and (dia_chi ="Da Nang" or dia_chi ="Quang Tri");

-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. 
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.

select khach_hang.id_khach_hang,khach_hang.ho_ten,count(hop_dong.id_hop_dong) as so_luong
from khach_hang
join hop_dong on khach_hang.id_khach_hang=hop_dong.id_khach_hang
where khach_hang.id_loai_khach=1
group by khach_hang.ho_ten
order by so_luong;

-- Task 5:
-- 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien 
-- (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) 
-- cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).

select khach_hang.id_khach_hang, khach_hang.ho_ten,loai_khach.ten_loai_khach,hop_dong.id_hop_dong
,dich_vu.ten_dich_vu,hop_dong.ngay_lam_hop_dong,hop_dong.ngay_ket_thuc, 
sum(dich_vu.chi_phi_thue + hop_dong_chi_tiet.so_luong*dich_vu_di_kem.gia) as 'tong_tien'
from khach_hang
left join loai_khach on khach_hang.id_loai_khach=loai_khach.id_loai_khach
left join hop_dong on khach_hang.id_khach_hang=hop_dong.id_khach_hang
left join dich_vu on hop_dong.id_dich_vu=dich_vu.id_dich_vu
left join hop_dong_chi_tiet on hop_dong.id_hop_dong=hop_dong_chi_tiet.id_hop_dong
left join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem=dich_vu_di_kem.id_dich_vu_di_kem
group by khach_hang.id_khach_hang;

-- Task6
select dich_vu.id_dich_vu,dich_vu.ten_dich_vu,dich_vu.dien_tich,dich_vu.chi_phi_thue,loai_dich_vu.ten_loai_dich_vu
from dich_vu
join loai_dich_vu on dich_vu.id_loai_dich_vu=loai_dich_vu.id_loai_dich_vu
join hop_dong on dich_vu.id_dich_vu=hop_dong.id_dich_vu
where dich_vu.id_dich_vu not in (select hop_dong.id_dich_vu 
from hop_dong 
where (year(ngay_lam_hop_dong)=2019) and (month(ngay_lam_hop_dong) in (01,02,03)));
    
    -- Task7
select dich_vu.id_dich_vu,dich_vu.ten_dich_vu,dich_vu.dien_tich,dich_vu.so_nguoi_toi_da,dich_vu.chi_phi_thue,loai_dich_vu.ten_loai_dich_vu
from dich_vu
join loai_dich_vu on dich_vu.id_loai_dich_vu=loai_dich_vu.id_loai_dich_vu
join hop_dong on dich_vu.id_dich_vu=hop_dong.id_dich_vu
where year(ngay_lam_hop_dong)=2018 and year(ngay_lam_hop_dong) not in (select year(ngay_lam_hop_dong)
from hop_dong 
where (year(ngay_lam_hop_dong)=2019)); 
    
    -- Task8
select khach_hang.ho_ten
from khach_hang
group by khach_hang.ho_ten;