DROP TABLE BROADCAST;
DROP TABLE BROADCAST CASCADE CONSTRAINTS;
DROP SEQUENCE BROADCAST_SEQ;
CREATE SEQUENCE BROADCAST_SEQ
INCREMENT BY 1
START WITH 1
MINVALUE 0
MAXVALUE 9999 
NOCYCLE
NOCACHE;



CREATE TABLE BROADCAST(
	BROADCAST_NO NUMBER PRIMARY KEY,
	MEMBER_ID VARCHAR2(50) NOT NULL,
	BROADCAST_TITLE VARCHAR2(100) NOT NULL,
	BROADCAST_CONTENT VARCHAR2(2000) NOT NULL,
	BROADCAST_REGDATE DATE DEFAULT(SYSDATE) NOT NULL,
	BROADCAST_VIEWCOUNT NUMBER NOT NULL,
	BROADCAST_MDATE VARCHAR2(16) NOT NULL,
	CONSTRAINT BROADCAST_FK_MEMBER_ID FOREIGN KEY(MEMBER_ID) REFERENCES MEMBER(MEMBER_ID) 
	ON DELETE CASCADE
);
INSERT INTO BROADCAST VALUES(BROADCAST_SEQ.NEXTVAL, '아이디','아아아','BANG', SYSDATE, 0, '20200708');
INSERT INTO BROADCAST VALUES(BROADCAST_SEQ.NEXTVAL, '아이디','BANG','ㅇㄹㄴㄹ', SYSDATE, 0, '2020070601');
INSERT INTO BROADCAST VALUES(BROADCAST_SEQ.NEXTVAL, 'ID','ㅁㄴㅇㄻㄴㅇㄻㄴㅇㄹ','붐', SYSDATE, 0, '2020070601');
SELECT * FROM BROADCAST
WHERE SUBSTR(BROADCAST_MDATE, 1,10) = '2020070601';

