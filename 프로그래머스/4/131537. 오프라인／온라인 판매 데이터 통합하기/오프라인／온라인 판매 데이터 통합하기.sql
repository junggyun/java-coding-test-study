select *
from (
select DATE_FORMAT(sales_date, '%Y-%m-%d') as sales_date, product_id, user_id, sales_amount
from online_sale

union

select DATE_FORMAT(sales_date, '%Y-%m-%d') as sales_date, product_id, null as user_id, sales_amount
from offline_sale
) as sales
where sales_date like '2022-03%'
order by sales_date, product_id, user_id;
