-- to list out all the databases we have 
show databases;

-- It is a collection of multiple tables of its similar type of database
create database LMS;
-- to get inside the database or change the database 
use lms;

-- database -> collection of tables  , Tables  --  collection of rows and columns

-- create a database
create database EMS;
use ems;

-- create a table
create table employees(emp_id int , emp_name varchar(30) ,password varchar(40) not null , 
emp_dept varchar(40) not null  ,salary int);

-- To see table structure
describe employees;

-- to retrieve/ view / see  the records or data or rows of a table 
select * from employees;

-- insert the values in a table 
insert into employees values(101, "Niti Dwivedi" , "pass@123" , "Training" , 50000),
							(102, "Nitin Mehta" , "password@123" , "Admin" , 60000),
                            (103, "Jaya Kishori" , "jaya@123" , "Finance" , 80000);

-- or

insert into employees values(101, "Niti Dwivedi" , "pass@123" , "Training" , 50000);
insert into employees values(102, "Nitin Mehta" , "password@123" , "Admin" , 60000);
insert into employees values(103, "Jaya Kishori" , "jaya@123" , "Finance" , 80000);
insert into employees values(104, "Prakhar Parth" , "prakhar@123" , "IT" , 90000);
insert into employees values(105, "Ankit Kumar" , "ankit@123" , "Database" , 70000);
insert into employees values(106, "Swati Kumari" , "swati@123" , "Finance" , 100000);
insert into employees values(107, "Riya Kumari" , "riya@123" , "Accounts" , 60000);
insert into employees values(108, "Rahul Kumar" , "rahul@123" , "Finance" , 60000);

-- to insert partial data 

insert into employees (emp_id , emp_name , password) values(104, "Meenu Kumari" , "meenu@123" );

select * from employees;

-- drop a table
drop table employees;


-- UPDATE
set sql_safe_updates = 0;
update employees set password = "kishori@765" where emp_id = 103;

-- DELETE
delete from employees where emp_id = 102;

select * from employees;


-- Selecting specific columns 
select emp_id, emp_name, salary from employees;

-- Selecting a Specific ROW
select emp_name, salary from employees where emp_id = 103;

-- Selecting all columns of a particular ROW
select * from employees where emp_id = 101;


-- parameterized query  ---  JDBC 
update employees set password = ?  where emp_id=?;

-- parameterized query  ---  JDBC
delete from employees where emp_id =?;



-- SORT THE DATA using ORDER BY  default ASCENDING --
select emp_id , emp_name , salary from employees order by emp_id desc ;


-- display the top 2 highest salaried employee name

select * from employees order by salary desc limit 2;



-- to show only the 2nd or 3rd one from top then what will be query 
-- use offset where you have to define the skip  , 2 (2nd and 3rd highest salary wale ) chaiye upper se 1
--  chhod ke(offset).

select * from employees order by salary desc limit 2 offset 1; 




-- what is difference between truncate , drop and delete
create table users(emp_id int ,username varchar(30) , role varchar(30));

insert into users values(101, "A" , "superadmin"),(102 , "B" , "admin");

select * from users;

drop table users; -- dropping the table completely with its records 
truncate users; -- without dropping the table it will delete all the records without having any condition 
					-- so table will be empty
delete from users where emp_id=102; -- delete is used to delete one or multiple records from a table based on condition

-- TRUNCATE is faster then the delete


-- DDL  alter commands
-- to add a new column
alter table employees add joiningdate datetime;

select * from employees;
update employees set joiningdate = now() where salary = 80000;

update employees set joiningdate = "2026-04-10 15:31:58" where salary = 60000;

update employees set joiningdate = "2026-04-15 15:31:58" where salary = 50000;


-- to rename a table name 
rename table employees to emp_data;
select * from emp_data;



-- set emp_id as a primary key which is unique , means it should not take a duplicate value
-- modify column is used to modify the width or datatype or adding a constraint 

alter table emp_data modify column emp_id int auto_increment primary key;
describe emp_data;

insert into emp_data ( emp_name , password , emp_dept , salary , joiningdate) 
	values( "Bhargavi" , "bhargav@123" , "Training" , 67000 , "2026-05-01 15:31:58" );
    
    



-- to rename the column name
alter table emp_data rename column joiningdate to joining_date;


-- to drop any column from a table
alter table emp_data drop column joining_date;


rename table emp_data to employees;
select * from employees;



