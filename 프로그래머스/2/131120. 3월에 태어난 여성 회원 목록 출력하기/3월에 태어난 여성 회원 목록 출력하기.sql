-- 코드를 입력하세요
SELECT member_id, member_name, gender, date_format(date_of_birth,"%Y-%m-%d") DATE_OF_BIRTH
from member_profile
where substr(date_of_birth,6,2)='03' and gender='w'and tlno is not null
order by member_id