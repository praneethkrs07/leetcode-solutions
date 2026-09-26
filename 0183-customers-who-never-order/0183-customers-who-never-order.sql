SELECT c.name as Customers  from Customers c
LEFT JOIN Orders o
ON C.id = o.customerId 
WHERE o.customerId is NULL ;