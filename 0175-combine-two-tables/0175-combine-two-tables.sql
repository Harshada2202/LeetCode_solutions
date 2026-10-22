# Write your MySQL query statement below
SELECT p.firstName,p.lastName,a.city,a.state FROM 
Person AS p Left JOIN Address as a ON p.personId =a.personId;