USE `ssafy_corporation`;

# Q1. 카타시안 곱 
SELECT empno, ename, job
FROM emp
;

SELECT deptno, dname
FROM dept
;

SELECT empno, ename, job, emp.deptno, dname
FROM emp, dept
WHERE emp.deptno = dept.deptno
;

# Q2. 사번 7788인 사원의 이름, 업무, 부서번호, 부서이름 조회
SELECT ename, job, deptno
FROM emp
WHERE empno = 7788
;

SELECT dname
FROM DEPT
WHERE deptno = 20
;

SELECT empno, ename, job, emp.deptno, dname
FROM emp, dept
WHERE emp.deptno = dept.deptno
	  AND empno = 7788
;      

-- INNER JOIN 키워드 사용해보자.
SELECT empno, ename, job, e.deptno, dname, loc
FROM emp e
INNER JOIN dept d
ON e.deptno = d.deptno
WHERE empno = 7788
;

-- USING
SELECT ename, job, deptno, dname
FROM emp
INNER JOIN dept
USING (deptno)
WHERE empno = 7788
;


-- OUTER JOIN
INSERT INTO emp
VALUES(7777, "JS", "MANAGER", 1234, "2025-01-01", 60000, NULL, 99)
;

-- INNER JOIN
SELECT ename, emp.deptno, dept.dname
FROM emp, dept
WHERE emp.deptno = dept.deptno
;

-- 한쪽 테이블을 기준을 두고 쓰겠다.
-- emp 테이블을 기준으로 dept을 연결한다.
SELECT ename, emp.deptno, dept.dname
FROM emp
LEFT OUTER JOIN dept
ON emp.deptno = dept.deptno
;

-- dept 기준으로 emp 테이블을 연결한다.
SELECT ename, emp.deptno, dept.dname
FROM emp
RIGHT OUTER JOIN dept
ON emp.deptno = dept.deptno
;

-- 셀프 조인
-- 모든 사원의 이름, 매니저번호, 매니저 이름
SELECT e1.empno, e1.ename, e2.empno, e2.ename
FROM emp e1, emp e2
WHERE e1.mgr = e2.empno
;

SELECT e1.empno, e1.ename, e2.empno, e2.ename
FROM emp e1
LEFT OUTER JOIN emp e2
ON e1.mgr = e2.empno
;

-- 비 동등 조인(Non-Equi JOIN)
-- 모든 사원의 사번, 이름, 급여, 급여 등급
SELECT e.empno, e.ename, e.sal, sg.grade
FROM emp e, salgrade sg
WHERE e.sal BETWEEN sg.LOSAL AND sg.HISAL
ORDER BY sg.grade DESC, e.sal DESC
;



