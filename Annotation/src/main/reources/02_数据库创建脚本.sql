DROP DATABASE IF EXISTS mybatisdb ;
CREATE DATABASE mybatisdb CHARACTER SET UTF8 ;
USE mybatisdb ;
CREATE TABLE news(
	nid			INT		AUTO_INCREMENT ,
	title		VARCHAR(50) ,
	pub_date	DATETIME ,
	CONSTRAINT pk_nid PRIMARY KEY(nid)
) ;