-- 코드를 입력하세요
SELECT distinct cart_id
from cart_products
where cart_id in
(
    select cart_id
from cart_products
where name = 'milk'
    )
    and cart_id in
    (
    select cart_id
    from cart_products
    where name = 'yogurt'
    )
    order by cart_id