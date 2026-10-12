SELECT class FROM Courses 
GROUP BY class
having count(student) >=5;