select c.car_id, c.car_type, ROUND(c.daily_fee * 30 * ((100 - p.discount_rate) / 100), 0) as fee
from car_rental_company_car as c
inner join CAR_RENTAL_COMPANY_DISCOUNT_PLAN as p
on c.car_type = p.car_type
where c.car_type in ('세단', 'SUV')
and p.duration_type = '30일 이상'
and c.car_id not in 
(
    select car_id 
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    where start_date <= '2022-11-30'
    and end_date >= '2022-11-01'
)
and c.daily_fee * 30 * ((100 - p.discount_rate) / 100) >= 500000 
and c.daily_fee * 30 * ((100 - p.discount_rate) / 100) < 2000000
order by fee desc, c.car_type asc, c.car_id desc;