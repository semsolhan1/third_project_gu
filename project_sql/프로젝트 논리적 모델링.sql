
/* Drop Triggers */

DROP TRIGGER TRI_Menu_Category_id;
DROP TRIGGER TRI_Menu_Category_Menu_Category_id;
DROP TRIGGER TRI_Menu_id;
DROP TRIGGER TRI_Menu_Menu_id;
DROP TRIGGER TRI_Restaurant_id;
DROP TRIGGER TRI_Restaurant_restaurant_id;
DROP TRIGGER TRI_Restaurant_Review_id;



/* Drop Tables */

DROP TABLE Menu CASCADE CONSTRAINTS;
DROP TABLE Restaurant_Review CASCADE CONSTRAINTS;
DROP TABLE Restaurant CASCADE CONSTRAINTS;
DROP TABLE Menu_Category CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE SEQ_Menu_Category_id;
DROP SEQUENCE SEQ_Menu_Category_Menu_Category_id;
DROP SEQUENCE SEQ_Menu_id;
DROP SEQUENCE SEQ_Menu_Menu_id;
DROP SEQUENCE SEQ_Restaurant_id;
DROP SEQUENCE SEQ_Restaurant_restaurant_id;
DROP SEQUENCE SEQ_Restaurant_Review_id;




/* Create Sequences */

CREATE SEQUENCE SEQ_Menu_Category_id INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_Menu_Category_Menu_Category_id INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_Menu_id INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_Menu_Menu_id INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_Restaurant_id INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_Restaurant_restaurant_id INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_Restaurant_Review_id INCREMENT BY 1 START WITH 1;



/* Create Tables */

CREATE TABLE Menu
(
	Menu_id number(50) NOT NULL,
	name varchar2(20) NOT NULL,
	price number(10,0) NOT NULL,
	Menu_Category_id number(50),
	restaurant_id number(50) NOT NULL,
	PRIMARY KEY (Menu_id)
);


CREATE TABLE Menu_Category
(
	Menu_Category_id number(50) NOT NULL,
	name varchar2(10) NOT NULL,
	PRIMARY KEY (Menu_Category_id)
);


CREATE TABLE Restaurant
(
	restaurant_id number(50) NOT NULL,
	name varchar2(10) NOT NULL,
	address varchar2(20) DEFAULT '',
	phone_number number(10,0) DEFAULT null,
	Menu_Category_id number(50),
	PRIMARY KEY (restaurant_id)
);


CREATE TABLE Restaurant_Review
(
	id number(20) NOT NULL,
	restaurant_id number(50) NOT NULL,
	-- 0과 1 (boolean)
	rating number(10,0) DEFAULT null NOT NULL,
	review varchar2(50) DEFAULT 'null',
	-- 별점을 숫자 1~5
	taste_rating number(10,0) NOT NULL,
	-- 별점을 숫자 1~5
	price_rating number(10,0) NOT NULL,
	-- 별점을 숫자 1~5
	distance_rating number(10,0) NOT NULL,
	-- 별점을 숫자 1~5
	overall_rating number(10,0) NOT NULL,
	PRIMARY KEY (id)
);



/* Create Foreign Keys */

ALTER TABLE Menu
	ADD FOREIGN KEY (Menu_Category_id)
	REFERENCES Menu_Category (Menu_Category_id)
;


ALTER TABLE Restaurant
	ADD FOREIGN KEY (Menu_Category_id)
	REFERENCES Menu_Category (Menu_Category_id)
;


ALTER TABLE Menu
	ADD FOREIGN KEY (restaurant_id)
	REFERENCES Restaurant (restaurant_id)
;


ALTER TABLE Restaurant_Review
	ADD FOREIGN KEY (restaurant_id)
	REFERENCES Restaurant (restaurant_id)
;



/* Create Triggers */

CREATE OR REPLACE TRIGGER TRI_Menu_Category_id BEFORE INSERT ON Menu_Category
FOR EACH ROW
BEGIN
	SELECT SEQ_Menu_Category_id.nextval
	INTO :new.id
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_Menu_Category_Menu_Category_id BEFORE INSERT ON Menu_Category
FOR EACH ROW
BEGIN
	SELECT SEQ_Menu_Category_Menu_Category_id.nextval
	INTO :new.Menu_Category_id
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_Menu_id BEFORE INSERT ON Menu
FOR EACH ROW
BEGIN
	SELECT SEQ_Menu_id.nextval
	INTO :new.id
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_Menu_Menu_id BEFORE INSERT ON Menu
FOR EACH ROW
BEGIN
	SELECT SEQ_Menu_Menu_id.nextval
	INTO :new.Menu_id
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_Restaurant_id BEFORE INSERT ON Restaurant
FOR EACH ROW
BEGIN
	SELECT SEQ_Restaurant_id.nextval
	INTO :new.id
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_Restaurant_restaurant_id BEFORE INSERT ON Restaurant
FOR EACH ROW
BEGIN
	SELECT SEQ_Restaurant_restaurant_id.nextval
	INTO :new.restaurant_id
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_Restaurant_Review_id BEFORE INSERT ON Restaurant_Review
FOR EACH ROW
BEGIN
	SELECT SEQ_Restaurant_Review_id.nextval
	INTO :new.id
	FROM dual;
END;

/




/* Comments */

COMMENT ON COLUMN Restaurant_Review.rating IS '0과 1 (boolean)';
COMMENT ON COLUMN Restaurant_Review.taste_rating IS '별점을 숫자 1~5';
COMMENT ON COLUMN Restaurant_Review.price_rating IS '별점을 숫자 1~5';
COMMENT ON COLUMN Restaurant_Review.distance_rating IS '별점을 숫자 1~5';
COMMENT ON COLUMN Restaurant_Review.overall_rating IS '별점을 숫자 1~5';



