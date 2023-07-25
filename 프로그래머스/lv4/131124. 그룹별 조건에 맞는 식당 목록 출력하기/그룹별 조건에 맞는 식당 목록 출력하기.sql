-- 리뷰를 가장 많이 작성한 회원의 리뷰들을 조회
-- 회원 이름, 리뷰 텍스트, 리뷰 작성일이 출력
-- 리뷰 작성일을 기준으로 오름차순, 리뷰 텍스트를 기준으로 오름차순
SELECT
    A.MEMBER_NAME,
    B.REVIEW_TEXT,
    DATE_FORMAT(B.REVIEW_DATE, '%Y-%m-%d')
FROM MEMBER_PROFILE A
INNER JOIN REST_REVIEW B
    ON A.MEMBER_ID = B.MEMBER_ID
WHERE A.MEMBER_ID = (SELECT MEMBER_ID
                     FROM REST_REVIEW
                     GROUP BY MEMBER_ID
                     ORDER BY COUNT(MEMBER_ID) DESC
                     LIMIT 1)
ORDER BY B.REVIEW_DATE, B.REVIEW_TEXT;