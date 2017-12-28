CREATE DATABASE IF NOT EXISTS homework;

USE homework;

CREATE TABLE IF NOT EXISTS `user`(

  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` VARCHAR(25) NOT NULL COMMENT '用户名',
  `password` VARCHAR(25) NOT NULL COMMENT '密码',

  PRIMARY KEY (`id`)

)ENGINE = InnoDB AUTO_INCREMENT = 10 DEFAULT CHARSET = utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO homework.user VALUES (1, 'admin', 'admin');