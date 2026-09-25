select a.name AS Employee from Employee a  JOIN Employee b 
on a.managerId=b.id Where b.salary < a.salary;