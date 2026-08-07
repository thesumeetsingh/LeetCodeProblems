# Write your MySQL query statement below


-- select name from salesperson where sales_id in (SELECT sales_id from orders where com_id in (SELECT com_id from company where name!='RED'))

select name from salesperson where sales_id not in (select o.sales_id from orders o inner join company c on o.com_id=c.com_id where c.name='RED')