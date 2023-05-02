CREATE TABLE Restaurant
(
	restaurant_id number(20) NOT NULL,
	restaurant_name varchar2(20) NOT NULL,
	main_menu varchar2(40) NOT NULL,
	price number(20) NOT NULL,
	address varchar2(20) NOT NULL,
	PRIMARY KEY (restaurant_id)
);

CREATE TABLE Ch_Restaurant_Review
(
	ch_id number(20) NOT NULL,
	restaurant_id number(20) NOT NULL,
	review_rating number(20) DEFAULT null,
	PRIMARY KEY (ch_id)
);

CREATE TABLE Ja_Restaurant_Review
(
	ja_id number(20) NOT NULL,
	restaurant_id number(20) NOT NULL,
	review_rating number(20) DEFAULT null,
	PRIMARY KEY (ja_id)
);

CREATE TABLE Ko_Restaurant_Review
(
	ko_id number(20) NOT NULL,
	restaurant_id number(20) NOT NULL,
	review_rating number(20) DEFAULT null,
	PRIMARY KEY (ko_id)
);

CREATE TABLE We_Restaurant_Review
(
	we_id number(20) NOT NULL,
	restaurant_id number(20) NOT NULL,
	review_rating number(20) DEFAULT null,
	PRIMARY KEY (we_id)
);

ALTER TABLE Ch_Restaurant_Review
	ADD FOREIGN KEY (restaurant_id)
	REFERENCES Restaurant (restaurant_id)
;

ALTER TABLE Ja_Restaurant_Review
	ADD FOREIGN KEY (restaurant_id)
	REFERENCES Restaurant (restaurant_id)
;

ALTER TABLE Ko_Restaurant_Review
	ADD FOREIGN KEY (restaurant_id)
	REFERENCES Restaurant (restaurant_id)
;

ALTER TABLE We_Restaurant_Review
	ADD FOREIGN KEY (restaurant_id)
	REFERENCES Restaurant (restaurant_id)
;

CREATE SEQUENCE SEQ_Ch_Restaurant_Review_ch_id INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_Ja_Restaurant_Review_ja_id INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_Ko_Restaurant_Review_ko_id INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_Restaurant_restaurant_id INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_We_Restaurant_Review_we_id INCREMENT BY 1 START WITH 1;

INSERT INTO Restaurant
VALUES(SEQ_Restaurant_restaurant_id.NEXTVAL,'우렁이박사','우렁이덕장',10000,'충청도');

INSERT INTO Restaurant
VALUES(SEQ_Restaurant_restaurant_id.NEXTVAL,'야마다야','가께우동',8000,'경기도');

INSERT INTO Restaurant
VALUES(SEQ_Restaurant_restaurant_id.NEXTVAL,'고구려짬뽕집','고구려짬뽕',6000,'서울');

INSERT INTO Restaurant
VALUES(SEQ_Restaurant_restaurant_id.NEXTVAL,'스케줄합정','스케줄 김치볶음밥',18000,'서울');

INSERT INTO Restaurant
VALUES(SEQ_Restaurant_restaurant_id.NEXTVAL,'세마오리농원','생오리 한마리',79000,'경기도');

INSERT INTO ko_restaurant_review
VALUES(SEQ_Ko_Restaurant_Review_ko_id.NEXTVAL,1,3458);

INSERT INTO Ja_restaurant_review
VALUES(SEQ_Ja_Restaurant_Review_ja_id.NEXTVAL,2,1628);

INSERT INTO Ch_restaurant_review
VALUES(SEQ_Ja_Restaurant_Review_ja_id.NEXTVAL,3,2105);

INSERT INTO ko_restaurant_review
VALUES(SEQ_Ko_Restaurant_Review_ko_id.NEXTVAL,4,1486);

INSERT INTO ko_restaurant_review
VALUES(SEQ_Ko_Restaurant_Review_ko_id.NEXTVAL,5,316);

COMMIT;


