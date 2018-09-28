DROP DATABASE IF EXISTS mybatisdb ;
CREATE DATABASE mybatisdb CHARACTER SET UTF8 ;
USE mybatisdb ;
-- 创建数据表
CREATE TABLE member_login (
	mid			VARCHAR(50) ,
	password		VARCHAR(50) ,
	CONSTRAINT pk_mid PRIMARY KEY(mid)
) ;
CREATE TABLE member_details (
	mid			VARCHAR(50) ,
	name		VARCHAR(50) ,
	age			INT ,
	CONSTRAINT pk_mid2 PRIMARY KEY(mid) ,
	CONSTRAINT fk_mid FOREIGN KEY(mid) REFERENCES member_login(mid) ON DELETE CASCADE			
) ;