-- 코드를 입력하세요
SELECT history_id, car_id, substr(start_date,1,10), substr(end_date,1,10),
case when datediff(end_date,start_date)>=29 then "장기 대여"
else "단기 대여" end "RENT_TYPE"
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where substr(start_date,1,7)="2022-09"
order by history_id desc