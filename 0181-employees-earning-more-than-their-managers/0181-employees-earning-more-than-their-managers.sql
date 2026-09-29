SELECT a.name AS Employee 
FROM Employee e
INNER JOIN Employee a
on e.id=a.managerId where e.salary <a.salary;