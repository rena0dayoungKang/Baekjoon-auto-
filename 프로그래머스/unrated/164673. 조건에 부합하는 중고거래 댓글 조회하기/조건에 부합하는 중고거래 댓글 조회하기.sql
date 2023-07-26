-- 2022년 10월
-- 작성일을 기준으로 오름차순 정렬 제목을 기준으로 오름차순 정렬
SELECT
    A.TITLE,
    A.BOARD_ID,
    B.REPLY_ID,
    B.WRITER_ID,
    B.CONTENTS,
    DATE_FORMAT(B.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
FROM USED_GOODS_BOARD A
INNER JOIN USED_GOODS_REPLY B
    ON A.BOARD_ID = B.BOARD_ID
WHERE A.CREATED_DATE LIKE '2022-10-%'
ORDER BY B.CREATED_DATE, A.TITLE;