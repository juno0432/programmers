-- 코드를 입력하세요
SELECT fh.flavor
from first_half fh inner join july j on fh.flavor = j.flavor
group by fh.flavor
order by sum(j.total_order+fh.total_order) desc
limit 3