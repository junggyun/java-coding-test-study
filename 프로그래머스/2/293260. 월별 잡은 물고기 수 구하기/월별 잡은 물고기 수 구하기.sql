select count(ID) as FISH_COUNT, MONTH(time) as MONTH
from fish_info
where time is not null
group by MONTH
order by MONTH asc;