-- 코드를 입력하세요
SELECT distinct(car.car_id)
from car_rental_company_car car inner join car_rental_company_rental_history hist on car.car_id = hist.car_id
where MONTH(START_DATE)='10' and CAR_TYPE="세단"
ORDER BY CAR_ID DESC