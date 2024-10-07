select count(i.id) as FISH_COUNT, ni.FISH_NAME
from fish_name_info as ni
left join fish_info as i
on ni.fish_type = i.fish_type
group by ni.FISH_NAME
order by FISH_COUNT desc;