-- '트럭', 대여 기록 별로 대여 금액(컬럼명: FEE)
-- 금액을 기준으로 내림차순 정렬, 대여 기록 ID를 기준으로 내림차순 정렬

SELECT 
    C.HISTORY_ID,
    ROUND((DATEDIFF(END_DATE, START_DATE) + 1) * (C.DAILY_FEE * (100 - COALESCE(DISCOUNT_RATE,0))) / 100, 0) AS FEE
FROM (
        SELECT
            A.HISTORY_ID,
            B.CAR_TYPE,
            B.DAILY_FEE,
            A.START_DATE,
            A.END_DATE,
            CASE 
                WHEN DATEDIFF(END_DATE, START_DATE) + 1 >= 90 THEN '90일 이상'
                WHEN DATEDIFF(END_DATE, START_DATE) + 1 >= 30 THEN '30일 이상'
                WHEN DATEDIFF(END_DATE, START_DATE) + 1 >= 7 THEN '7일 이상'
            END AS DURATION
        FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY AS A
        INNER JOIN CAR_RENTAL_COMPANY_CAR AS B 
            ON A.CAR_ID = B.CAR_ID
        WHERE B.CAR_TYPE = '트럭'
    ) AS C
LEFT JOIN (
    SELECT 
        DURATION_TYPE, 
        DISCOUNT_RATE
    FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN 
    WHERE CAR_TYPE = '트럭'
) AS D
ON C.DURATION = D.DURATION_TYPE
ORDER BY FEE DESC, HISTORY_ID DESC;

