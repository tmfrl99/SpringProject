CREATE TABLE member (
id VARCHAR(20) NOT NULL Primary Key,
passwd VARCHAR(20) NOT NULL,
name VARCHAR(20) NOT NULL, 
num VARCHAR(20) NOT NULL,
address VARCHAR(20) NOT NULL
);

insert into member values ('seoul43', 'passwd1334', '김서울', '01012345678', '서울 중구 한강대로 405');
insert into member values ('busan45', 'busan45', '이부산', '01045678912', '부산 동구 중앙대로 206');
insert into member values ('daegu32', 'qlalfqjsgh', '박대구', '01047638643', '대구 북구 태평로 161');
insert into member values ('incheon12', 'incheon987', '윤인천', '01099378278', '인천광역시 중구 제물량로 269');
insert into member values ('jeju78', 'ghswjdhqtjdP', '정제주', '01074682983', '제주특별자치도 제주시 공항로 2');

select * from member;

drop table member;

CREATE TABLE shoes (
id VARCHAR(20) NOT NULL Primary Key,
name VARCHAR(20) NOT NULL,
price VARCHAR(20) NOT NULL, 
brand VARCHAR(20) NOT NULL,
color VARCHAR(20) NOT NULL,
inven VARCHAR(20) NOT NULL
);

insert into shoes values ('VN1342', '어센틱', '69000', '반스', '레드', '23');
insert into shoes values ('VN1221', '어센틱 뮬', '54900', '반스', '트루 화이트', '15');
insert into shoes values ('VN1133', '올드스쿨', '79000', '반스', '블랙', '31');
insert into shoes values ('GY1121', '아스티어 W', '86900', '아디다스', '베이지', '19');
insert into shoes values ('GX3295', '오즈위고', '109900', '아디다스', '브라운', '8');
insert into shoes values('M9160', '척테일러 올스타', '55000', '컨버스', '블랙', '17');
insert into shoes values ('M8992', '척 70 클래식', '95000', '컨버스', '블랙', '9');

select * from shoes;

alter table shoes rename column name to pname;

drop table shoes;
