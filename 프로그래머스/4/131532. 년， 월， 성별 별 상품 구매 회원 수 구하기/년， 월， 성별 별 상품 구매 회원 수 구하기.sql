-- 코드를 입력하세요
SELECT substr(os.sales_date,1,4), substr(os.sales_date,6,2), gender, count(distinct os.user_id)
from user_info ui right join online_sale os on ui.user_id  = os.user_id
group by substr(os.sales_date,1,4), substr(os.sales_date,6,2), gender
having gender is not null
order by substr(os.sales_date,1,4), substr(os.sales_date,6,2), gender