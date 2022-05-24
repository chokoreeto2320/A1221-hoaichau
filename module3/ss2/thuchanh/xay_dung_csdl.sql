create database quanlybanhang;

create table PHIEUXUAT(
	SoPX int primary key,
	NgayXuat datetime
);

create table phieuxuat_vattu(
	DGXuat int,
    SLxuat int,
    SoPX int,
    MaVTU int,
    primary key(SoPX, MaVTU),
    foreign key (SoPX) references PHIEUXUAT(SoPX),
    foreign key (MaVTU) references VATTU(MaVTU)
);

create table VATTU(
	MaVTU int primary key,
    TenVTU varchar(50) 
);

create table vattu_phieunhap(
	MaVTU int,
    SoPN int,
    DGNhap int,
    SLNhap int,
    primary key(MaVTU, SoPN),
    foreign key (MaVTU) references VATTU(MaVTU),
    foreign key (SoPN) references PHIEUNHAP(SoPN)
);

create table PHIEUNHAP(
	SoPN int primary key,
    NgayNhap datetime
);
create table vattu_dondh(
    MaVTU int,
    SoDH int,
    primary key(MaVTU, SoDH),
    foreign key (MaVTU) references VATTU(MaVTU),
    foreign key (SoDH) references DONDH(SoDH)
);
create table DONDH(
	SoDH int primary key,
	NgayDH datetime
);

create table NHACC(
	MaNCC int primary key,
	TenNCC varchar(50),
	DiaChi varchar(50),
    SDT int,
    SoDH int,
    foreign key (SoDH) references DONDH(SoDH)
);