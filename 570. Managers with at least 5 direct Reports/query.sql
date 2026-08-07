
select e.name from Employee r left join employee e on e.id=r.managerId  group by e.id having count(e.id)>=5;