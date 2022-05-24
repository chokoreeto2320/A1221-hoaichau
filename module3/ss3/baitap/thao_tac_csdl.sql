use my_database;
insert into Customer
values
(1,'Minh Quan',10),
(2,'Ngoc Oanh',20),
(3,'Hong Ha',50);

insert into `Order`
values
(1,1,'2006/3/21 00:00:00' ,null),
(2,2,'2006/3/23 00:00:00' ,null),
(3,1,'2006/3/16 00:00:00',null);

insert into Product
values
(1,'May Giat',3),
(2,'Tu Lanh',5),
(3,'Dieu Hoa',7),
(4,'Quat',1),
(5,'Bep Dien',2);

insert into OrderDetail
values
(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);

select  oID, oTotalPrice
from `Order`;

select Customer.cName,product.pName 
from orderdetail
inner join `Order` on `Order`.oID=orderdetail.oID
join customer on customer.cID=orderdetail.oID
inner join product on product.pID=orderdetail.oID;


select customer.cName 
from customer
left join `Order`
on `Order`.cID=customer.cID
where oID is null;


