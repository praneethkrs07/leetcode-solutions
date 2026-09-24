SELECT firstName,lastName,city,state
FROM person
LEFT JOIN Address ON person.personID = Address.personID;