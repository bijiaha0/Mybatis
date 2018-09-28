DROP DATABASE IF EXISTS mybatisdb ;
CREATE DATABASE mybatisdb CHARACTER SET UTF8 ;
USE mybatisdb ;
CREATE TABLE member (
	mid			VARCHAR(50) ,
	name		VARCHAR(50) ,
	age			INT ,
	school  	VARCHAR(50) ,
	score		DOUBLE ,
	company		VARCHAR(50) ,
	salary		DOUBLE ,
	flag		VARCHAR(50) ,
	CONSTRAINT pk_mid PRIMARY KEY(mid)
) ;