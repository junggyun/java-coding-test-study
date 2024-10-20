select d.DEPT_ID, d.DEPT_NAME_EN, ROUND(avg(e.sal)) as AVG_SAL
from hr_department as d
join hr_employees as e
on d.dept_id = e.dept_id
group by d.dept_id
order by AVG_SAL desc;