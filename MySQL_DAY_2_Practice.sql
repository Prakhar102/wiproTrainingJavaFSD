create database QuickBite;
use QuickBite;


create table Customers (customer_id int primary key, customer_name varchar(50) not null, city varchar(50));

create table Restaurants (restaurant_id int primary key, restaurant_name varchar(50), city varchar(50));

create table Orders (order_id int primary key, customer_id int, restaurant_id int, order_amount int, order_date date,
    foreign key (customer_id) references Customers(customer_id),
    foreign key (restaurant_id) references Restaurants(restaurant_id));
    
    
insert into Customers values (1, 'Rishabh', 'Delhi'), (2, 'Aman', 'Mumbai'), (3, 'Neha', 'Delhi'),
(4, 'Priya', 'Pune'), (5, 'Rahul', 'Mumbai');

select * from Customers;

insert into Restaurants values (101, 'KFC', 'Delhi'), (102, 'Dominos', 'Mumbai'),  (103, 'Burger King', 'Pune'),
(104, 'Subway', 'Delhi');

select * from Restaurants;

insert into Orders values (1001, 1, 101, 500, '2024-01-10'), (1002, 2, 102, 300, '2024-01-11'), (1003, 1, 104, 700, '2024-01-12'), 
(1004, 3, 101, 200, '2024-01-13'), (1005, 5, 102, 900, '2024-01-14');

select * from Orders;

 -- Q1. INNER JOIN
 -- Display customer name, restaurant name, and order amount

select c.customer_name, r.restaurant_name, o.order_amount
from Orders o
inner join Customers c on o.customer_id = c.customer_id
inner join Restaurants r on o.restaurant_id = r.restaurant_id;



 -- Q2. LEFT JOIN
 -- Display all customers and their orders (even if no orders)

select c.customer_name, o.order_amount
from Customers c left join Orders o 
on c.customer_id = o.customer_id;


-- Q3. RIGHT JOIN
-- Display all restaurants and orders (even if no orders placed)

select r.restaurant_name, o.order_amount
from Orders o right join restaurants r 
on o.restaurant_id = r.restaurant_id;



-- Q4. FULL OUTER JOIN (MySQL workaround)
-- Display all customers and orders (matched + unmatched)

select c.customer_name, o.order_amount
from Customers c left join Orders o 
on c.customer_id = o.customer_id
union
select c.customer_name, o.order_amount
from Customers c right join Orders o
on c.customer_id = o.customer_id;



-- Q5. SELF JOIN
-- Find customers from the same city

SELECT c1.customer_name AS customer1, c2.customer_name AS customer2, c1.city
FROM customers c1
JOIN customers c2
ON c1.city = c2.city AND c1.customer_id <> c2.customer_id;



--  ACTIVITY 2 – SUBQUERIES
 -- Q6. Find customers who placed orders above average order amount
 
 SELECT c.customer_name, o.order_amount
FROM orders o
JOIN customers c ON o.customer_id = c.customer_id
WHERE o.order_amount > (
    SELECT AVG(order_amount) FROM orders
);




-- Q7. Display restaurants that have received at least one order

SELECT restaurant_name
FROM restaurants
WHERE restaurant_id IN (
    SELECT DISTINCT restaurant_id FROM orders
);



-- Q8. Find the customer who made the highest order
SELECT c.customer_name, o.order_amount
FROM orders o
JOIN customers c ON o.customer_id = c.customer_id
WHERE o.order_amount = (
    SELECT MAX(order_amount) FROM orders
);




 -- ACTIVITY 3 – CORRELATED SUBQUERIES
-- Q9. Find customers whose order amount is greater than their own average order amount

SELECT c.customer_name, o.order_amount
FROM orders o
JOIN customers c ON o.customer_id = c.customer_id
WHERE o.order_amount > (
    SELECT AVG(o2.order_amount)
    FROM orders o2
    WHERE o2.customer_id = o.customer_id
);




 -- Q10. Find restaurants whose average order amount is greater than overall average
 
 SELECT r.restaurant_name
FROM restaurants r
JOIN orders o ON r.restaurant_id = o.restaurant_id
GROUP BY r.restaurant_id, r.restaurant_name
HAVING AVG(o.order_amount) > (
    SELECT AVG(order_amount) FROM orders
);