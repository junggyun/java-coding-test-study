-- 코드를 입력하세요
SELECT m.member_name, r.review_text, DATE_FORMAT(r.review_date, '%Y-%m-%d') as REVIEW_DATE
from rest_review as r
join member_profile as m
on r.member_id = m.member_id
where m.member_id = (
    select m.member_id
    from rest_review as r
    join member_profile as m
    on r.member_id = m.member_id
    group by r.member_id
    order by count(*) desc
    limit 1
)
order by r.review_date asc, r.review_text asc;