SELECT p.firstName,p.lastName,city,state
from Person p
LEFT join Address a
on p.personId = a.personId;