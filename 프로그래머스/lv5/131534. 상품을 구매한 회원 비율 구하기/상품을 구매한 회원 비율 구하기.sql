-- 코드를 입력하세요
SELECT 
    DATE_FORMAT(B.SALES_DATE, '%Y') AS YEAR,
    DATE_FORMAT(B.SALES_DATE, '%m') AS MONTH,
    COUNT(DISTINCT A.USER_ID) AS PURCHASED_USERS,    
    ROUND(COUNT(DISTINCT A.USER_ID) / 
        (SELECT COUNT(*) FROM USER_INFO WHERE JOINED LIKE '2021%'), 1)
    AS PUCHASED_RATIO
FROM USER_INFO A
JOIN ONLINE_SALE B
    ON A.USER_ID = B.USER_ID
WHERE A.JOINED LIKE '2021%'
GROUP BY YEAR, MONTH
ORDER BY YEAR, MONTH;