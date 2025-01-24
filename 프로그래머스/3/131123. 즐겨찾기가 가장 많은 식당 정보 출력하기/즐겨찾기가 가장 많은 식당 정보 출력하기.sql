select r1.food_type, r1.rest_id, r1.rest_name, r1.favorites
from rest_info as r1
inner join (select food_type, max(favorites) as max_favorites from rest_info group by food_type) as r2
on r1.food_type = r2.food_type and r1.favorites = r2.max_favorites
order by food_type desc;