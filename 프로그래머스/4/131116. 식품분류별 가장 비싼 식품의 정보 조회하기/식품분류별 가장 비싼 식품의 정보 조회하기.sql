select f1.category, f1.price, f1.product_name
from food_product as f1
inner join (select category, max(price) as max_price from food_product group by category) as f2
on f1.category = f2.category
and f1.price = f2.max_price
where f1.category in ('과자', '국', '김치', '식용유')
order by max_price desc;