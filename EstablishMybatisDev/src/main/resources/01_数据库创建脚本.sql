DROP DATABASE IF EXISTS mybatisdb ;
CREATE DATABASE mybatisdb CHARACTER SET UTF8 ;
USE mybatisdb ;
CREATE TABLE member(
	mid			VARCHAR(50) ,
	name		VARCHAR(50) ,
	age			INT ,
	salary		DOUBLE ,
	birthday	DATETIME ,
	note		TEXT ,
	CONSTRAINT pk_mid PRIMARY KEY(mid)
) ;