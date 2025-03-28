# Q1. ssafydb 데이터 베이스 생성 및 사용
CREATE DATABASE IF NOT EXISTS ssafydb;

USE ssafydb;

# Q2. ssafy_user 테이블 생성
CREATE TABLE ssafy_user(
user_num INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
user_id VARCHAR(20) NOT NULL,
user_name VARCHAR(20) NOT NULL,
user_password VARCHAR(20) NOT NULL,
user_email VARCHAR(30) ,
signup_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
)
;
-- 테이블 정보 확인 가능
DESC ssafy_user;

# Q3. INSERT 쿼리를 사용해보자.
INSERT INTO ssafy_user
VALUES(10,"jsonsvalue", "이재석", "1234","hellojaeseok@gmail.com",now());

-- 원하는 칼럼만 작성도 가능하다.
INSERT INTO ssafy_user(user_id, user_name, user_password)
VALUES("kimssafy", "김싸피", "1234");

-- 여러 개의 데이터를 넣을 수 있다.
INSERT INTO ssafy_user(user_id, user_name, user_password)
VALUES ("leessafy", "리싸피", "1234"),
		("leessafy", "리싸피", "1234"),
		("leessafy", "리싸피", "1234");

# Q4. 데이터를 수정해보자
-- 데이터 수정 조건x(safe mode 해제) Edit -> preferences -> SQLEditor
UPDATE ssafy_user
SET user_name = 'anonymous'
WHERE user_num = 3;

# Q5. 데이터를 삭제해보자
DELETE FROM ssafy_user
WHERE user_num = 4;

SELECT * FROM ssafy_user;