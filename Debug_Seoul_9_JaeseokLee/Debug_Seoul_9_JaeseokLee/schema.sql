# 데이터베이스 생성 코드
# DB가 존재한다면 없애고, 새로운 DB를 생성한다.
DROP DATABASE IF EXISTS debug_test;
CREATE DATABASE debug_test;
USE debug_test;

DROP TABLE IF EXISTS fruits;
# 과일 테이블(fruits) 생성 코드
# Table을 형성할 때 ` 을 넣어서 Schema를 형성한다.
CREATE TABLE `fruits` (
    # 자동 증가가 되도록 AutoIncrement를 설정한다.
    # 과일의 맛을 varchar로 바꿔준다.
    # 재고 수량을 int로 바꿔준다.
    `fruit_id` INT AUTO_INCREMENT PRIMARY KEY,  		-- 고유번호(기본키), 자동 증가 설정 
    `fruit_name` VARCHAR(50),   	      			-- 과일 이름
    `taste` VARCHAR(50) NOT NULL,              		-- 과일의 맛(예: 달콤함, 새콤함 등)
    `price` INT NOT NULL,                      	-- 과일 가격(원 단위)
    `quantity` INT NOT NULL                   -- 재고 수량
);


INSERT INTO fruits (fruit_id, fruit_name, taste, price, quantity)
VALUES(1, "사과", "달콤함", 3000, 20),
(2, "귤", "새콤함", 2000, 30),
(3, "수박", "달콤함", 7000, 40),
(4, "딸기", "달콤함", 5000, 10),
(5, "두리안", "냄새남", 8000, 0);


SELECT * FROM fruits;