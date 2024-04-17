/*
 Navicat Premium Data Transfer

 Source Server         : ppp
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : 121.4.82.48:3306
 Source Schema         : feedtrack

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 18/07/2021 17:00:38
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for game
-- ----------------------------
DROP TABLE IF EXISTS `game`;
CREATE TABLE `game` (
  `id` int NOT NULL AUTO_INCREMENT,
  `angle` int DEFAULT NULL,
  `vv` int DEFAULT NULL,
  `top` int DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1424 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for login
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `id` int NOT NULL AUTO_INCREMENT,
  `log_number` int DEFAULT NULL,
  `log_name` varchar(255) DEFAULT NULL,
  `success` int DEFAULT NULL,
  `chance` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=408 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for ordinary
-- ----------------------------
DROP TABLE IF EXISTS `ordinary`;
CREATE TABLE `ordinary` (
  `id` int NOT NULL AUTO_INCREMENT,
  `xx` int DEFAULT NULL,
  `v` int DEFAULT NULL,
  `h` double(255,2) DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1725 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for result
-- ----------------------------
DROP TABLE IF EXISTS `result`;
CREATE TABLE `result` (
  `text_id` int NOT NULL AUTO_INCREMENT,
  `text_value1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `text_value2` varchar(255) DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`text_id`)
) ENGINE=InnoDB AUTO_INCREMENT=340 DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
