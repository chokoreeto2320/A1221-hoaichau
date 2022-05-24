use quan_ly_sinh_vien;

select *
from student
where  studentName like 'h%';

select * from class 
where month(StartDate)=12 ;

select * from `subject`
where credit between 3 and 5;

update student 
set ClassId=2
where StudentName='Hung' and StudentId = 1 ;

select StudentName, SubName, Mark
from student ,`subject`,mark
order by  mark desc,StudentName asc ;
