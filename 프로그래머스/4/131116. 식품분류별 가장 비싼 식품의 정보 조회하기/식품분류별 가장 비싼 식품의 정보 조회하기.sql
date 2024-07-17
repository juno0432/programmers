-- 코드를 입력하세요
select category, price, product_name
from
(
SELECT category, price, product_name, 
row_number() over (partition by category order by price desc) ranking
from food_product
where category in ('과자', '국', '김치', '식용유')
) a
where ranking = 1
order by price desc