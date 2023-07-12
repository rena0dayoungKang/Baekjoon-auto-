-- 코드를 입력하세요
SELECT 
    B.USER_ID,
    B.NICKNAME,
    SUM(A.PRICE) AS TOTAL_SALES
FROM USED_GOODS_BOARD A
LEFT OUTER JOIN USED_GOODS_USER B
    ON A.WRITER_ID = B.USER_ID
WHERE A.STATUS LIKE 'DONE'
GROUP BY A.WRITER_ID
HAVING TOTAL_SALES >= 700000
ORDER BY TOTAL_SALES;