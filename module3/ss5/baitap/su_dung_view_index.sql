create database demo;

use demo;

create table products (
product_id int not null auto_increment primary key,
product_code varchar(45),
product_name varchar(45),
product_price int,
product_amount int,
product_description varchar(45),
product_status varchar(45)
);

insert into products
values
(1,"A01","IPhone",12000000,1,"màu trắng","Mới 100%"),
(2,"B06","Sam sung",7000000,2,"màu xanh","Mới 99%"),
(3,"C04","Oppo",11000000,1,"màu xám","Mới 100%"),
(4,"A09","Xiaomi",9000000,3,"màu đen","Mới 80%"),
(5,"B01","Vivo",5000000,1,"màu trắng","Cũ"),
(6,"A05","Realme",10000000,1,"màu đỏ","Mới 70%"),
(7,"A07","Vsmart",10000000,1,"màu hồng","Mới"),
(8,"C01","Nokia",7000000,1,"màu vàng","Cũ"),
(9,"D01","Masstel",8000000,1,"màu bạc","Cũ");

create unique index index_product_code on products (product_code);
create unique index index_name_price on products (product_name,product_price);
explain select * from products where product_code = 'A09'; 
explain select * from products where product_name = 'Vsmart' and product_price = 10000000; 

create view product_views as
select product_code,product_name,product_price,product_status
from products;
select * from product_views;

update product_views
set product_status = "Cũ"
where product_code = "B06";

drop view product_views;

delimiter //
create procedure  find_all_products()
begin
  select * from products;
end //
delimiter ;
call find_all_products();

