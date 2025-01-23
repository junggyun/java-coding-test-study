select u.user_id, u.nickname, sum(b.price) as total_sales
from used_goods_user as u
inner join used_goods_board as b
on u.user_id = b.writer_id
where b.status = 'done'
group by user_id
having sum(b.price) >= 700000
order by sum(b.price)