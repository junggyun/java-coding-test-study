select count(*) as fish_count, max(f2.fish_name) as fish_name
from fish_info as f1
inner join fish_name_info as f2
on f1.fish_type = f2.fish_type
group by f1.fish_type
order by fish_count desc;
