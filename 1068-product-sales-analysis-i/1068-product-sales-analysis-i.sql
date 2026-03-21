# Write your MySQL query statement below
SELECT product_name,year,price
FROM Sales
NATURAL JOIN Product 
WHERE product_id IN (Select product_id FROM Product);
