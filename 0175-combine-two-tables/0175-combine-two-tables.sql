select firstName,lastName,city,state
from person
LEFT JOIN Address ON person.personID = Address.personID;