DROP DATABASE IF EXISTS mybatisdb ;
CREATE DATABASE mybatisdb CHARACTER SET UTF8 ;
USE mybatisdb ;
-- 创建数据表
CREATE TABLE role (
	rid			INT AUTO_INCREMENT ,
	title		VARCHAR(50) ,
	CONSTRAINT pk_rid PRIMARY KEY(rid)
) ;
CREATE TABLE groups (
	gid		INT AUTO_INCREMENT ,
	title		VARCHAR(50) ,
	CONSTRAINT pk_gid PRIMARY KEY(gid)		
) ;
CREATE TABLE role_groups(
	rid			INT ,
	gid			INT ,
	CONSTRAINT fk_rid FOREIGN KEY(rid) REFERENCES role(rid) ON DELETE CASCADE ,
	CONSTRAINT fk_gid FOREIGN KEY(gid) REFERENCES groups(gid) ON DELETE CASCADE 
) ;
INSERT INTO role(title) VALUES ('超级管理员') ;
INSERT INTO groups(title) VALUES ('人事管理') ;
INSERT INTO groups(title) VALUES ('任务管理') ;
INSERT INTO groups(title) VALUES ('商品采购') ;
INSERT INTO groups(title) VALUES ('商品检修') ;
INSERT INTO groups(title) VALUES ('后勤保障') ;
INSERT INTO groups(title) VALUES ('财务管理') ;
INSERT INTO role_groups(rid,gid) VALUES (1,1) ;
INSERT INTO role_groups(rid,gid) VALUES (1,2) ;