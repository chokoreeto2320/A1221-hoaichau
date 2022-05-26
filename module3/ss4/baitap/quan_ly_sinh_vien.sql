use quan_ly_sinh_vien;

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select *
from subject
where credit = (select max(credit) from subject);

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select s.subId,s.subName,m.mark
from subject s
join mark m on s.subId=m.subId
where mark = (select max(mark) from mark);

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select s.studentId,s.studentName,s.address,s.phone,avg(mark) as "medium_score"
from student s
left join mark m on s.studentId=m.studentId
group by s.studentId,s.studentName
order by avg(mark) desc;