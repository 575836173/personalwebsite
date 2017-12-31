/*
Navicat MySQL Data Transfer

Source Server         : lengzq
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : personalwebsite

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-12-29 20:18:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键，自增',
  `username` varchar(40) NOT NULL COMMENT '用户名 唯一',
  `password` varchar(255) NOT NULL COMMENT '密码 （加密）',
  `phone` varchar(11) DEFAULT NULL COMMENT '手机号，绑定后可以验证码登录',
  `nickname` varchar(40) DEFAULT NULL COMMENT '昵称',
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_unique` (`username`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------

-- ----------------------------
-- Table structure for sms
-- ----------------------------
DROP TABLE IF EXISTS `sms`;
CREATE TABLE `sms` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '短信主键id',
  `phone` varchar(11) NOT NULL COMMENT '手机号',
  `smsType` int(4) NOT NULL COMMENT '短信类型（0-验证码 1-通知）',
  `sms` varchar(255) NOT NULL COMMENT '短信内容',
  `release_time` varchar(20) NOT NULL COMMENT '短信发送时间',
  `expire_time` varchar(20) NOT NULL COMMENT '短信失效时间',
  `state` int(4) NOT NULL COMMENT '短信状态（0-正常 1-失效）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sms
-- ----------------------------
