-- 코드를 입력하세요
SELECT a.author_id, a.author_name, b.category, sum(bs.sales * b.price)
from book b 
inner join author a on b.author_id = a.author_id
inner join book_sales bs on b.book_id = bs.book_id
where bs.sales_date like "2022-01%"
group by a.author_id, a.author_name, b.category
order by a.author_id, b.category desc