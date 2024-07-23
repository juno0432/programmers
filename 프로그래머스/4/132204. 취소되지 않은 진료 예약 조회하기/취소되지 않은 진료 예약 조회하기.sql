-- 코드를 입력하세요

SELECT apnt_no, pt_name, a.pt_no, a.mcdp_cd, dr_name, apnt_ymd
from appointment a 
join doctor d on a.mddr_id = d.dr_id
join patient p on a.pt_no = p.pt_no
where apnt_cncl_yn = "n" and APNT_YMD like "%2022-04-13%"
order by apnt_ymd
