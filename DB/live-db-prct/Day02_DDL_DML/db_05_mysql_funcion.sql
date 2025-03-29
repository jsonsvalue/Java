# Q1. 숫자관련 함수 사용
-- 2의 3제곱
SELECT pow(2,3) AS "2^3"
FROM dual
;

-- 8 나누기 3의 나머지
SELECT mod(8,3) as "mod3"
;

-- 최대값, 최솟값
SELECT greatest(8, 17, 30, 44, 89) AS "Greatest", least(2148, 20, 52, 73, 1) AS "Least";

-- 반올림
SELECT round(3.1415925258), round(3.1415925258, 1) AS "1st Roundup", round(3.1415925258, 2) AS "2nd Roundup", round(3.1415925258, 3) AS "3rd Roundup"
;
# Q2. 문자 관련 함수
-- 아스키 코드값 얻기
SELECT ascii('0'), ascii('A'), ascii('a')
;

-- concat 메서드를 써보자.
SELECT concat(ename, '님 반갑습니다.') AS 인사말
FROM emp;

-- 이름의 길이가 5인 직원의 이름을 조회
SELECT ename AS "NAME"
FROM emp
WHERE length(ename) = 4;

-- 바이트 및 글자 단위로 센다.
SELECT length('김싸피'), char_length('김싸피');

-- 문자열 변경
SELECT replace('Hello there motherfucker', 'motherfucker', 'good boy') AS 'replace';

-- 문자열 인덱스(1부터 시작)
SELECT instr('HELLO SSAFY', 'SSAFY')
;

-- 모든 직원의 이름 3자리조회
SELECT substr(ename, 1, 4)
FROM emp;

-- LPAD RPAD
SELECT lpad('SSAFY', 10, '*'), rpad('SSAFY', 12, '*');


-- REVERSE
SELECT reverse("Hey there siri") AS 'reverse'
;

# Q3. 날짜 관련함수
-- 2초 더하기
SELECT addtime('2025-03-18 10:48:30', '15')
;

-- 날짜차이
SELECT datediff('2025-03-18', '2025-01-07') AS 'datediff'; 

-- 오늘은?
SELECT now(), day(now()), month(now()), year(now());

# Q4. 트랜잭션 사용해보기
SET autocommit = 0;

USE ssafydb;

CREATE TABLE test_table(val VARCHAR(20));

START TRANSACTION;
INSERT INTO test_table VALUES('A');
INSERT INTO test_table VALUES('B`');
INSERT INTO test_table VALUES('C');
INSERT INTO test_table VALUES('D');
INSERT INTO test_table VALUES('E');
INSERT INTO test_table VALUES('F');

SELECT * FROM test_table;


