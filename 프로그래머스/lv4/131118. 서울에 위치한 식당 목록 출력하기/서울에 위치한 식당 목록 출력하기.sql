-- 코드를 입력하세요
-- 서울에 위치한 식당들의 식당 ID, 식당 이름, 음식 종류, 즐겨찾기수, 주소, 리뷰 평균 점수를 조회
-- 평균점수는 소수점 세 번째 자리에서 반올림
-- 평균점수를 기준으로 내림차순 정렬, 즐겨찾기수를 기준으로 내림차순 정렬
SELECT
    A.REST_ID,
    A.REST_NAME,
    A.FOOD_TYPE,
    A.FAVORITES,
    A.ADDRESS,
    ROUND(AVG(B.REVIEW_SCORE), 2) AS SCORE
FROM REST_INFO A
INNER JOIN REST_REVIEW B
    ON A.REST_ID = B.REST_ID
WHERE A.ADDRESS LIKE '서울%'
GROUP BY A.REST_ID
ORDER BY SCORE DESC, A.FAVORITES DESC;