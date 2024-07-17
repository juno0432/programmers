-- 코드를 입력하세요
SELECT fp.product_id, fp.product_name, fp.price*sum(fo.amount)
from food_product fp inner join food_order fo on fp.product_id = fo.product_id
where substr(PRODUCE_DATE,1,7) = '2022-05'
group by product_id
order by fp.price*sum(fo.amount) desc, product_id asc