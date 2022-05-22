CREATE DATABASE QuanLyBanHang;
use QuanLyBanHang;
create table Customer(
cID int primary key,
cName varchar(50),
cAge int
);

create table `Order`(
oID int primary key,
cID int,
oTotalPrice double,
foreign key (cID) references Customer(cID)

);

create table Product(
pID int primary key,
pName varchar(50),
cPrice double
);

create table OrderDetail(
oID int ,
pID int ,
constraint odID primary key(oID,pID),
foreign key (oID) references `Order`(oID),
foreign key (pID) references Product(pID)

);