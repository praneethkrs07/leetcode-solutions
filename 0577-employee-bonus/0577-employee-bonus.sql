SELECT name,bonus from Employee e
left join Bonus b
 on e.empId = b.empId 
WHERE b.bonus < 1000 or b.bonus is null;