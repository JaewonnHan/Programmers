-- 코드를 입력하세요
SELECT count(user_id) as USERS
from user_info 
where Year(joined) = '2021' and age between 20 and 29