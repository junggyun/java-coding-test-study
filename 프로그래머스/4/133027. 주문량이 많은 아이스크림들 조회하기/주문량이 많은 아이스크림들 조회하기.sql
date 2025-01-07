select
    j.flavor
from
    first_half as f
join
    july as j
on
    j.flavor = f.flavor
group by j.flavor
order by 
    sum(j.total_order) + f.total_order desc
limit 3;