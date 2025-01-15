select count(*) as fish_count
from fish_info as f1
inner join fish_name_info as f2
on f1.fish_type = f2.fish_type
and f2.fish_name in ('BASS', 'SNAPPER');