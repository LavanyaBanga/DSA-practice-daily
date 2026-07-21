# Write your MySQL query statement below
SELECT b.bonus,e.name FROM Employee e
LEFT JOIN Bonus b
ON e.empId=b.empID
WHERE b.Bonus<1000
OR b.Bonus is NULL
