/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : zcgj

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2019-04-17 19:42:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for zzzl
-- ----------------------------
DROP TABLE IF EXISTS `zzzl`;
CREATE TABLE `zzzl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ear_number` int(11) NOT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `is_present` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `varieties` varchar(255) DEFAULT NULL,
  `house_number` varchar(255) DEFAULT NULL,
  `approach_time` varchar(255) DEFAULT NULL,
  `approach_type` varchar(255) DEFAULT NULL,
  `departure_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of zzzl
-- ----------------------------
INSERT INTO `zzzl` VALUES ('8', '7', '公', '12', '12', '12', '7', '12', '2019-04-17', '12', '12');
INSERT INTO `zzzl` VALUES ('9', '8', '母', '12', '12', '12', '12', '12', '2019-04-15', '12', '12');
INSERT INTO `zzzl` VALUES ('10', '10', '公', '10', '0', '0', '10', '0', '2019-04-15', '10', '10');
INSERT INTO `zzzl` VALUES ('14', '14', '母', '14', '14', '14', '14', '14', '2019-04-16', '14', '14');
INSERT INTO `zzzl` VALUES ('23', '12', '母', '12', '12', '12', '12', '12', '12', '12', '12');
INSERT INTO `zzzl` VALUES ('24', '1', '公', '1', '1', '1', '1', '1', '1', '1', '1');
INSERT INTO `zzzl` VALUES ('25', '2', '母', '2', '2', '2', '2', '2', '2', '22', '2');
INSERT INTO `zzzl` VALUES ('26', '3', '公', '3', '3', '3', '3', '3', '3', '3', '3');
INSERT INTO `zzzl` VALUES ('27', '4', '公', '4', '4', '4', '4', '4', '4', '4', '4');
INSERT INTO `zzzl` VALUES ('29', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6');
INSERT INTO `zzzl` VALUES ('31', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5');
INSERT INTO `zzzl` VALUES ('35', '11', '11', '11', '11', '9', '11', '9', '2019-04-02', '1', '11');
