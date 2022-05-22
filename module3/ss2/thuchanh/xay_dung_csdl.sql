
CREATE DATABASE if not exists quan_ly_sinh_vien;

CREATE TABLE class(
ClassID INT primary key,
ClassName VARCHAR(60),
StartDate DATETIME,
Status BIT
);


CREATE TABLE Student (
StudentId INT primary key,
StudentName VARCHAR(30),
Address VARCHAR(50),
Phone VARCHAR(20),
`Status` BIT,
ClassId INT,
FOREIGN KEY (ClassId) REFERENCES Class (ClassID)
);


CREATE TABLE Subject(
SubId int  primary key,
SubName varchar(30),
Credit tinyint ,
`Status` bit
);

CREATE TABLE Mark(
MarkId int primary key ,
SubId int,
StudentId int,
Mark float,
ExamTimes tinyint,
UNIQUE (SubId,StudentId ),
FOREIGN KEY (SubId) REFERENCES Subject(SubId),
FOREIGN KEY (StudentId) REFERENCES Student(StudentId)

);
