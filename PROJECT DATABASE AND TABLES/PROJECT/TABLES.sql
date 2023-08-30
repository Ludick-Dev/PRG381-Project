CREATE TABLE student(
	Student_ID int primary key,
	student_name varchar(50) not null,
	student_address varchar(60) ,
	student_email varchar(50) not null unique,
	student_password varchar(10) unique not null
)

CREATE TABLE Register
(
Register_ID int primary key,
student_name varchar(50),
student_address varchar(50),
student_email varchar(30),
student_Password varchar(20) unique,
Course_name varchar(5)
)


CREATE TABLE administrator
(
Admin_ID int Primary key,
Admin_name varchar(20),
Admin_password varchar(20) unique,
Contact varchar(10) 
)