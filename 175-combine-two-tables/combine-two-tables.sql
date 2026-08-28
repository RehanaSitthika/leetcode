# Write your MySQL query statement below
select  p.firstName,p.lastname,a.city,a.state from person p LEFT JOIN Address a on p.personid=a.personId;