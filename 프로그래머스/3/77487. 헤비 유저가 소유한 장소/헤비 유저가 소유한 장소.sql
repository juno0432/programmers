select id, name, host_id
from places
where host_id IN (
    select host_id
    from places
    group by host_id
    having count(*) >= 2
)
order by id;
