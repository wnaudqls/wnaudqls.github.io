DROP TABLE RECIPE;
DROP TABLE RECIPE CASCADE CONSTRAINTS;
DROP SEQUENCE RECIPE_SEQ

CREATE SEQUENCE RECIPE_SEQ
INCREMENT BY 1
START WITH 1
MINVALUE 0 
MAXVALUE 9999 
NOCYCLE
NOCACHE

CREATE TABLE RECIPE(
RECIPE_NO NUMBER PRIMARY KEY,
RECIPE_MAIN_PHOTO VARCHAR2(4000) NOT NULL,
MEMBER_ID VARCHAR2(50) NOT NULL,
RECIPE_TITLE VARCHAR2(1000) NOT NULL,
RECIPE_DETAIL VARCHAR2(4000) NOT NULL,
RECIPE_REGDATE DATE DEFAULT(SYSDATE) NOT NULL,
RECIPE_READCOUNT NUMBER DEFAULT(0) NOT NULL,
RECIPE_MATERIAL_ONE VARCHAR2(40) NOT NULL,
CATE_THEME_NO NUMBER NOT NULL,
CATE_KIND_NO NUMBER NOT NULL,
RECIPE_MATERIAL VARCHAR2(4000) NOT NULL,
RECIPE_LIKECOUNT NUMBER DEFAULT(0) NOT NULL,
CONSTRAINT RECIPE_FK_MEMBER_ID FOREIGN KEY(MEMBER_ID) REFERENCES MEMBER(MEMBER_ID)
ON DELETE CASCADE,
CONSTRAINT RECIPE_FK_RECIPE_THEME FOREIGN KEY(CATE_THEME_NO) REFERENCES THEME(CATE_THEME_NO)
ON DELETE CASCADE,
CONSTRAINT RECIPE_FK_RECIPE_KIND FOREIGN KEY(CATE_KIND_NO) REFERENCES KIND(CATE_KIND_NO)
ON DELETE CASCADE
);

SELECT * FROM RECIPE
ORDER BY RECIPE_NO DESC
DELETE FROM RECIPE

SELECT RECIPE_SEQ.CURRVAL FROM DUAL;
SELECT * FROM USER_SEQUENCES;

CREATE FUNCTION GET_SEQ 
RETURN NUMBER 
IS
BEGIN
	RETURN RECIPE_SEQ.NEXTVAL;
END;
/


