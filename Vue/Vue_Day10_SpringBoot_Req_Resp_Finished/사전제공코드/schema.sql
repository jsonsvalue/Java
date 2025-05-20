DROP DATABASE IF EXISTS ssafy_board;
CREATE DATABASE ssafy_board DEFAULT CHARACTER SET utf8mb4;

USE ssafy_board;

CREATE TABLE board (
	id INT AUTO_INCREMENT,
    writer VARCHAR(20) NOT NULL,
    title VARCHAR(50) NOT NULL,
    content TEXT,
    view_cnt INT DEFAULT 0,
    reg_date TIMESTAMP DEFAULT now(),
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS `users` (
  `id` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL,
  `name` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO board(title, writer, content) 
VALUES ("아직은 괜찮아1","양띵균","기초 Java1"),
	   ("아직은 괜찮아2","양띵균","기초 Java2"),
       ("아직은 괜찮아3","양띵균","기초 Java3"),
       ("아직은 괜찮아4","양띵균","기초 BackEnd1"),
       ("아직은 괜찮아5","양띵균","기초 BackEnd2"),
       ("아직은 괜찮아6","양띵균","기초 BackEnd3"),
       ("아직은 괜찮아7","양띵균","Spring"),
       ("아직은 괜찮아8","양띵균","SpringBoot"),
       ("이제는 알아야해1", "양띵균", "Java 마슷허"),
       ("이제는 알아야해2", "양띵균", "Back 마슷허"),
       ("이제는 알아야해3", "양띵균", "Spring 마슷허");

INSERT INTO board (writer, title, content) VALUES
('홍길동', '백엔드 개발의 기초', '백엔드 개발에 필요한 기초 지식과 도구들을 소개합니다.'),
('김영희', 'RESTful API란?', 'RESTful API의 개념과 구현 방법에 대해 설명합니다.'),
('이철수', '데이터베이스 관리', '효율적인 데이터베이스 관리 방법과 쿼리 최적화 팁을 공유합니다.'),
('박민아', 'Node.js 시작하기', 'Node.js의 설치와 기본적인 사용법에 대해 알아봅시다.'),
('최지훈', 'Express.js 프레임워크', 'Express.js를 이용한 웹 서버 구축 방법에 대해 설명합니다.'),
('장영수', 'JWT 인증', 'JSON Web Token을 이용한 인증 방식에 대해 알아봅시다.'),
('김나리', '서버 배포 방법', '서버를 실제로 배포하는 방법과 주의사항을 공유합니다.'),
('이수빈', '소프트웨어 개발 방법론', '애자일과 워터폴 방법론의 차이점에 대해 설명합니다.'),
('정우성', 'API 문서화', '효율적인 API 문서화 방법과 도구에 대해 알아봅니다.'),
('윤정희', '클라우드 서비스 개요', 'AWS와 Azure 등 주요 클라우드 서비스의 특징을 비교합니다.'),
('한지민', 'Python을 활용한 웹 개발', 'Python을 이용한 웹 개발의 장점과 활용 사례를 소개합니다.'),
('오정훈', 'SQL vs NoSQL', '관계형 데이터베이스와 비관계형 데이터베이스의 차이점에 대해 설명합니다.'),
('서지영', '프론트엔드와의 협업', '백엔드 개발자와 프론트엔드 개발자의 협업 방법에 대해 알아봅시다.'),
('배수진', '로그 관리의 중요성', '어플리케이션 로그 관리의 필요성과 방법을 설명합니다.'),
('이현우', '오픈소스 소프트웨어 활용', '오픈소스를 활용하여 개발하는 방법에 대해 알아봅니다.'),
('조수빈', 'CI/CD 이해하기', '지속적 통합과 지속적 배포의 개념과 도구를 소개합니다.'),
('전태수', 'Docker 기본 개념', 'Docker를 이용한 컨테이너화의 기본 개념에 대해 알아봅시다.'),
('안소희', '모바일 백엔드 개발', '모바일 애플리케이션을 위한 백엔드 개발의 특성과 요구사항을 설명합니다.'),
('권민지', '웹 보안 기초', '웹 애플리케이션 보안의 기초와 주요 공격 방법에 대해 알아봅니다.'),
('임상철', '테스트 주도 개발(TDD)', 'TDD의 개념과 실제 적용 방법에 대해 설명합니다.');
INSERT INTO users
VALUES ("ssafy", "1234", "김싸피"),
       ("admin", "admin", "admin");
