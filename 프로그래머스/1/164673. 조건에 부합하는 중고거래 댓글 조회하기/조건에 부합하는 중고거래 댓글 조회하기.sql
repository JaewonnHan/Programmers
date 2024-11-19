-- 코드를 입력하세요
SELECT a.TITLE, a.BOARD_ID,b.REPLY_ID, b.WRITER_ID, b.CONTENTS, DATE_FORMAT(b.CREATED_DATE,"%Y-%m-%d")
FROM USED_GOODS_BOARD A inner join USED_GOODS_REPLY B
on a.BOARD_ID = b.BOARD_ID
where a.CREATED_DATE like '2022-10%'
order by b.CREATED_DATE asc, a.TITLE asc