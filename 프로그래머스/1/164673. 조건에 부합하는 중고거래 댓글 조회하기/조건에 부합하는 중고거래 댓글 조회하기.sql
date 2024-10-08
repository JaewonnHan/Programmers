-- 코드를 입력하세요
SELECT A.TITLE, A.BOARD_ID, b.REPLY_ID, b.WRITER_ID, b.CONTENTS,DATE_FORMAT(b.created_date,"%Y-%m-%d") as CREATED_DATE
FROM USED_GOODS_BOARD as A
INNER JOIN USED_GOODS_REPLY as B
ON A.BOARD_ID = B.BOARD_ID
WHERE A.created_date like '2022-10%'
ORDER BY b.created_date, A.title