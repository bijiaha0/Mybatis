DROP DATABASE IF EXISTS mybatisdb ;
CREATE DATABASE mybatisdb CHARACTER SET UTF8 ;
USE mybatisdb ;
-- 创建数据表
CREATE TABLE type (
	tid			INT AUTO_INCREMENT ,
	title		VARCHAR(50) ,
	CONSTRAINT pk_tid PRIMARY KEY(tid)
) ;
CREATE TABLE subtype (
	stid		INT AUTO_INCREMENT ,
	title		VARCHAR(50) ,
	tid			INT ,
	CONSTRAINT pk_stid PRIMARY KEY(stid) ,
	CONSTRAINT fk_tid FOREIGN KEY(tid) REFERENCES type(tid) ON DELETE CASCADE			
) ;
INSERT INTO type(title) VALUES ('电脑办公') ;
INSERT INTO subtype(title,tid) VALUES ('笔记本电脑',1) ;
INSERT INTO subtype(title,tid) VALUES ('内存',1) ;
INSERT INTO subtype(title,tid) VALUES ('硬盘',1) ;