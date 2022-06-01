create database caseStudy_Database;
use caseStudy_Database;
create table vi_tri (
id_vi_tri int auto_increment primary key,
ten_vi_tri varchar(45)
);
create table trinh_do (
id_trinh_do int auto_increment primary key,
trinh_do varchar(45)
);
create table bo_phan (
id_bo_phan int auto_increment primary key,
ten_bo_phan varchar(45)
);
create table nhan_vien (
id_nhan_vien int auto_increment primary key,
ho_ten varchar(45),
id_vi_tri int,foreign key(id_vi_tri) references vi_tri(id_vi_tri),
id_trinh_do int,foreign key(id_trinh_do) references trinh_do(id_trinh_do),
id_bo_phan int,foreign key(id_bo_phan) references bo_phan(id_bo_phan),
ngay_sinh date,
so_CMTND varchar(45),
luong int,
SDT varchar(45),
email varchar(45),
dia_chi varchar(45)
);
create table loai_khach (
id_loai_khach int auto_increment primary key,
ten_loai_khach varchar(45)
);
create table khach_hang (
id_khach_hang int auto_increment primary key,
id_loai_khach int,foreign key(id_loai_khach) references loai_khach(id_loai_khach),
ho_ten varchar(45),
ngay_sinh date,
so_CMTND varchar(45),
SDT varchar(45),
email varchar(45),
dia_chi varchar(45)
);
create table kieu_thue (
id_kieu_thue int auto_increment primary key,
ten_kieu_thue varchar(45),
gia int
);
create table loai_dich_vu (
id_loai_dich_vu int auto_increment primary key,
ten_loai_dich_vu varchar(45)
);
create table dich_vu (
id_dich_vu int auto_increment primary key,
ten_dich_vu varchar(45),
dien_tich int,
so_tang int,
so_nguoi_toi_da int,
chi_phi_thue int,
id_kieu_thue int,foreign key(id_kieu_thue) references kieu_thue(id_kieu_thue),
id_loai_dich_vu int,foreign key(id_loai_dich_vu) references loai_dich_vu(id_loai_dich_vu),
trang_thai varchar(45)
);
create table hop_dong (
id_hop_dong int auto_increment primary key,
id_nhan_vien int,foreign key(id_nhan_vien) references nhan_vien(id_nhan_vien),
id_khach_hang int,foreign key(id_khach_hang) references khach_hang(id_khach_hang),
id_dich_vu int,foreign key(id_dich_vu) references dich_vu(id_dich_vu),
ngay_lam_hop_dong date,
ngay_ket_thuc date,
tien_dat_coc int,
tong_tien int
);
create table dich_vu_di_kem (
id_dich_vu_di_kem int auto_increment primary key,
ten_dich_vu_di_kem varchar(45),
gia int,
don_vi int,
trang_thai_kha_dung varchar(45)
);
create table hop_dong_chi_tiet (
id_hop_dong_chi_tiet int auto_increment primary key,
id_hop_dong int,foreign key(id_hop_dong) references hop_dong(id_hop_dong),
id_dich_vu_di_kem int,foreign key(id_dich_vu_di_kem) references dich_vu_di_kem(id_dich_vu_di_kem),
so_luong int
);
-- Task 1:
/*1.	Thêm mới thông tin cho tất cả các bảng có trong CSDL.*/
insert into vi_tri 
values
(1,'Le Tan'),
(2,'Phuc Vu'),
(3,'Chuyen Vien'),
(4,'Giam Sat'),
(5,'Quan Li'),
(6,'Giam Doc');
insert into trinh_do
values
(1,'Cao Dang'),
(2,'Dai Hoc'),
(3,'Trung Cap'),
(4,'Sau Dai Hoc');
insert into bo_phan
values
(1,'Sale – Marketing'),
(2,'Hanh Chinh'),
(3,'Phuc Vu'),
(4,'Quan Li');
insert into nhan_vien
values
(1,'Huynh Thi Nga',1,3,1,'1994/08/10','097354920',7000000,'0392065098','ngahuynh@gmail.com','Quang Tri'),
(2,'Truong Van Quang',5,4,4,'1991/11/15','034586038',12000000,'0394908776','truongquang@gmail.com','Hue'),
(3,'Nguyen Thi Thanh',2,1,3,'1997/10/25','239876509',8500000,'0987987098','thanhnguyen@gmail.com','Da Nang'),

(4,'Vo Thanh Dat',3,2,2,'1993/04/12','097354042',9000000,'0392853968','thanhdat@gmail.com','Hai Chau');
insert into loai_khach
values
(1,'Diamond'),
(2,'Platinium'),
(3,'Gold'),
(4,'Silver'),
(5,'Member');
insert into khach_hang
values
(1,2,'Nguyen Van An','1989/02/19','176086789','0971098789','nguyenan@gmail.com','Da Nang'),
(2,5,'Tran Nhu ngoc','1975/12/07','297479674','0989098765','tranngoc@gmail.com','Nha Trang'),
(3,1,'Nguyen Van Nhat','1995/10/04','098057336','0396098779','nhatnguyen@gmail.com','Vinh'),

(4,3,'Nguyen Thi My','1992/09/03','098028402','0396483027','mynguyen@gmail.com','Quang Tri');
insert into kieu_thue
values
(1,'Ngay',300000),
(2,'Tuan',1000000),
(3,'Thang',2500000);
insert into loai_dich_vu
values
(1,'Thuong'),
(2,'Vip');
insert into dich_vu
values
(1,'Villa1',40,3,12,10000000,1,1,'Trong'),
(2,'House1',35,2,8,7000000,3,1,'Trong'),
(3,'Room',25,1,4,3000000,2,2,'Trong'),
(4,'Villa2',35,2,10,9000000,1,2,'Trong');


insert into hop_dong
values
(1,1,2,2,'2018/04/12','2018/05/12',5000000,0),
(2,3,1,1,'2019/02/22','2019/02/23',3000000,0),
(3,2,3,3,'2019/11/05','2019/11/11',4000000,0),
(4,4,4,4,'2019/12/12','2019/12/13',6000000,0);

insert into dich_vu_di_kem
values
(1,'Massage',500000,1,'Mo'),
(2,'Karaoke',700000,2,'Mo'),
(3,'Thuc An',500000,1,'Mo'),
(4,'Nuoc Uong',200000,2,'Mo'),
(5,'Thue Xe',400000,1,'Mo');
insert into hop_dong_chi_tiet
values
(1,2,3,2),
(2,3,1,1),
(3,1,2,5);


