create database Food_Delivery;
use Food_Delivery;

-- CUSTOMER TABLE
create table Customers(customer_id int, name varchar(20), email varchar(30), city varchar(20));

-- RESTURANT TABLE

create table Resturants(resturant_id int, name varchar(20), cuisine_type varchar(30), city varchar(20));

-- ORDER TABLE

create table Orders(order_id int, customer_id int, resturant_id int, order_amount int, order_date date); 


insert into Customers values(1, "Prakhar Parth", "prakhar@gmail.com", "Banaras"),
                            (2, "Swati Kumari", "swati@gmail.com", "Hyderabad"),
							(3, "Ankit Kumar", "ankit@gmail.com", "Banglore"),
                            (4, "Riya Kumari", "riya@gmail.com", "Kolkata");
 select * from Customers;                           
                            
insert into Resturants values(101, "Saffron", "India", "Hyderabad"),
                             (102, "Burger Singh", "Fast Food", "Banaras"),
                             (103, "Wow momo", "Chinese", "Banglore"),
                             (104, "Daawat-E-khaas", "Afghani", "Kolkata");
                             
select * from Resturants;

                             
                             
insert into Orders values(1001, 1, 102, 300, "2026-04-26"),
                         (1002, 2, 101, 500, "2026-04-25"),
                         (1003, 3, 103, 600, "2026-04-27"),
                         (1004, 4, 104, 400, "2026-04-24");
select * from Orders;




-- “Show all registered customers” --
select * from Customers;

select * from Customers where city = 'Kolkata';


-- ORDER PLACED On 2026-04-24
select * from Orders where order_date = '2026-04-24';


-- SORT by AMOUNT in DESC --
select * from Orders order by order_amount desc;


-- Set Customer city to pune --
update Customers set city = "Pune" where customer_id = 1;
select * from Customers;


-- update cuisin type to Fast Food

update Resturants set cuisine_type = "Fast Food" where name = "Saffron";
select * from Resturants;


-- Order amount coorection
update Orders set order_amount = 900 where order_id = 1001;
select * from Orders;


-- Delete customer account with id = 3;
select * from Customers where customer_id = 3;

delete from Customers where customer_id = 3;



-- Cancel order
delete from Orders where order_id = 1002;



-- Delete Resturant from Banglore
delete from Resturants where city = "Banglore";
select * from Resturants;
