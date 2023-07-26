-- 2022년 8월부터 2022년 10월까지 총 대여 횟수가 5회 이상인 자동차
-- 월을 기준으로 오름차순, 자동차 ID를 기준으로 내림차순 정렬
-- 월의 총 대여 횟수가 0인 경우에는 결과에서 제외
# SELECT
#     MONTH(START_DATE) AS MONTH,
#     CAR_ID,
#     COUNT(HISTORY_ID) AS RECORDS
# FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
# GROUP BY MONTH, CAR_ID
# HAVING RECORDS >= 5
# ORDER BY MONTH, CAR_ID DESC;



SELECT MONTH(START_DATE) AS MONTH, R.CAR_ID, COUNT(*) AS RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY R
WHERE R.CAR_ID IN (
    SELECT CAR_ID
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE START_DATE BETWEEN '2022-08-01' AND '2022-10-31'
    GROUP BY CAR_ID
    HAVING COUNT(*) >= 5
)
AND R.START_DATE BETWEEN '2022-08-01' AND '2022-10-31'
GROUP BY MONTH(START_DATE), R.CAR_ID
HAVING COUNT(*) > 0
ORDER BY MONTH(START_DATE), R.CAR_ID DESC;