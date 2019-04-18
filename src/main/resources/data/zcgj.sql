/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : zcgj

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2019-04-18 20:18:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for production
-- ----------------------------
DROP TABLE IF EXISTS `production`;
CREATE TABLE `production` (
  `id` int(60) NOT NULL AUTO_INCREMENT,
  `ear_number` varchar(255) NOT NULL,
  `age` int(60) DEFAULT NULL,
  `current_house_number` varchar(255) DEFAULT NULL,
  `parity` varchar(255) DEFAULT NULL,
  `litter_size` varchar(255) DEFAULT NULL,
  `mating_times` varchar(255) DEFAULT NULL,
  `abortion_number` int(60) DEFAULT NULL,
  `survival_number` int(60) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of production
-- ----------------------------
INSERT INTO `production` VALUES ('1', 'Y03', '123', '产房1', '2', '10', '2', '3', '7');

-- ----------------------------
-- Table structure for rzgl
-- ----------------------------
DROP TABLE IF EXISTS `rzgl`;
CREATE TABLE `rzgl` (
  `id` int(60) NOT NULL AUTO_INCREMENT,
  `ear_number` varchar(255) NOT NULL,
  `age` int(60) DEFAULT NULL,
  `varieties` varchar(255) DEFAULT NULL,
  `is_transfer` varchar(255) DEFAULT NULL,
  `current_house_number` varchar(255) DEFAULT NULL,
  `before_house_number` varchar(255) DEFAULT NULL,
  `approach_weight` varchar(255) DEFAULT NULL,
  `approach_time` varchar(255) DEFAULT NULL,
  `approach_type` varchar(255) DEFAULT NULL,
  `leaving_time` varchar(255) DEFAULT NULL,
  `departure_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rzgl
-- ----------------------------
INSERT INTO `rzgl` VALUES ('2', 'R01', '140', '黑白', '是', '大猪舍1', '幼猪舍1', '160', '2018-04-15', '出生', '2019-04-17', '售出');
INSERT INTO `rzgl` VALUES ('3', 'R02', '170', '纯黑', '是', '大猪舍2', '幼猪舍2', '180', '2018-04-16', '出生', '2019-04-15', '售出');
INSERT INTO `rzgl` VALUES ('4', 'R03', '130', '长白', '是', '大猪舍3', '幼猪舍3', '172', '2018-04-17', '出生', '2019-04-16', '售出');
INSERT INTO `rzgl` VALUES ('5', 'R04', '134', '黑白', '是', '大猪舍4', '幼猪舍4', '169', '2018-04-18', '出生', '2019-04-18', '售出');
INSERT INTO `rzgl` VALUES ('6', 'R05', '140', '黑白', '是', '大猪舍1', '幼猪舍1', '160', '2018-04-15', '出生', '2019-04-17', '售出');
INSERT INTO `rzgl` VALUES ('7', 'R06', '170', '纯黑', '是', '大猪舍2', '幼猪舍2', '180', '2018-04-16', '出生', '2019-04-15', '售出');
INSERT INTO `rzgl` VALUES ('8', 'R07', '130', '长白', '是', '大猪舍3', '幼猪舍3', '172', '2018-04-17', '出生', '2019-04-16', '售出');
INSERT INTO `rzgl` VALUES ('9', 'R08', '134', '黑白', '是', '大猪舍4', '幼猪舍4', '169', '2018-04-18', '出生', '2019-04-18', '售出');
INSERT INTO `rzgl` VALUES ('10', 'R09', '140', '黑白', '是', '大猪舍1', '幼猪舍1', '160', '2018-04-15', '出生', '2019-04-17', '售出');
INSERT INTO `rzgl` VALUES ('11', 'R10', '170', '纯黑', '是', '大猪舍2', '幼猪舍2', '180', '2018-04-16', '出生', '2019-04-15', '售出');
INSERT INTO `rzgl` VALUES ('12', 'R11', '130', '长白', '是', '大猪舍3', '幼猪舍3', '172', '2018-04-17', '出生', '2019-04-16', '售出');
INSERT INTO `rzgl` VALUES ('13', 'R12', '134', '黑白', '是', '大猪舍4', '幼猪舍4', '169', '2018-04-18', '出生', '2019-04-18', '售出');
INSERT INTO `rzgl` VALUES ('14', 'R13', '140', '黑白', '是', '大猪舍1', '幼猪舍1', '160', '2018-04-15', '出生', '2019-04-17', '售出');
INSERT INTO `rzgl` VALUES ('15', 'R14', '170', '纯黑', '是', '大猪舍2', '幼猪舍2', '180', '2018-04-16', '出生', '2019-04-15', '售出');
INSERT INTO `rzgl` VALUES ('16', 'R15', '130', '长白', '是', '大猪舍3', '幼猪舍3', '172', '2018-04-17', '出生', '2019-04-16', '售出');
INSERT INTO `rzgl` VALUES ('17', 'R16', '134', '黑白', '是', '大猪舍4', '幼猪舍4', '169', '2018-04-18', '出生', '2019-04-18', '售出');

-- ----------------------------
-- Table structure for swaq
-- ----------------------------
DROP TABLE IF EXISTS `swaq`;
CREATE TABLE `swaq` (
  `id` int(60) NOT NULL AUTO_INCREMENT,
  `ear_number` varchar(255) NOT NULL,
  `physical_examination` varchar(255) DEFAULT NULL,
  `immune_status` varchar(255) DEFAULT NULL,
  `vaccination_type` varchar(255) DEFAULT NULL,
  `disinfection_situation` varchar(255) DEFAULT NULL,
  `disease_condition` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of swaq
-- ----------------------------

-- ----------------------------
-- Table structure for wpgl
-- ----------------------------
DROP TABLE IF EXISTS `wpgl`;
CREATE TABLE `wpgl` (
  `id` int(60) NOT NULL AUTO_INCREMENT,
  `recording_time` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `unit` varchar(255) DEFAULT NULL,
  `supplier` varchar(255) DEFAULT NULL,
  `number` varchar(255) DEFAULT NULL,
  `unit_price` varchar(255) DEFAULT NULL,
  `actual_expenditure` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wpgl
-- ----------------------------

-- ----------------------------
-- Table structure for yzgl
-- ----------------------------
DROP TABLE IF EXISTS `yzgl`;
CREATE TABLE `yzgl` (
  `id` int(60) NOT NULL AUTO_INCREMENT,
  `ear_number` varchar(255) NOT NULL,
  `mear_number` varchar(255) NOT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `age` int(60) DEFAULT NULL,
  `varieties` varchar(255) DEFAULT NULL,
  `is_transfer` varchar(255) DEFAULT NULL,
  `current_house_number` varchar(255) DEFAULT NULL,
  `before_house_number` varchar(255) DEFAULT NULL,
  `approach_weight` varchar(255) DEFAULT NULL,
  `approach_time` varchar(255) DEFAULT NULL,
  `approach_type` varchar(255) DEFAULT NULL,
  `leaving_time` varchar(255) DEFAULT NULL,
  `departure_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of yzgl
-- ----------------------------
INSERT INTO `yzgl` VALUES ('1', 'X01', 'Y05', '母', '16', '黑白', '是', '幼猪舍1', '产房1', '10', '2019-04-15', '出生', '', '暂无');
INSERT INTO `yzgl` VALUES ('2', 'X02', 'Y01', '母', '14', '长白', '是', '幼猪舍2', '产房2', '12', '2019-04-16', '出生', null, '暂无');
INSERT INTO `yzgl` VALUES ('3', 'X03', 'Y02', '公', '9', '纯黑', '否', '产房3', null, '10', '2019-04-09', '出生', null, '暂无');
INSERT INTO `yzgl` VALUES ('4', 'X04', 'Y03', '公', '13', '短白', '是', '幼猪舍3', '产房3', '14', '2019-04-11', '出生', null, '暂无');
INSERT INTO `yzgl` VALUES ('5', 'X05', 'Y04', '母', '15', '长白', '是', '幼猪舍2', '产房3', '13', '2019-04-12', '出生', null, '暂无');
INSERT INTO `yzgl` VALUES ('6', 'X06', 'Y05', '母', '16', '黑白', '是', '幼猪舍1', '产房1', '10', '2019-04-15', '出生', '', '暂无');
INSERT INTO `yzgl` VALUES ('7', 'X07', 'Y01', '母', '14', '长白', '是', '幼猪舍2', '产房2', '12', '2019-04-16', '出生', null, '暂无');
INSERT INTO `yzgl` VALUES ('8', 'X08', 'Y02', '公', '9', '纯黑', '否', '产房3', '', '8', '2019-04-09', '出生', '', '暂无');
INSERT INTO `yzgl` VALUES ('9', 'X09', 'Y03', '公', '16', '短白', '是', '幼猪舍3', '产房3', '14', '2019-04-11', '出生', '', '暂无');
INSERT INTO `yzgl` VALUES ('10', 'X10', 'Y04', '母', '15', '长白', '是', '幼猪舍2', '产房3', '13', '2019-04-12', '出生', null, '暂无');
INSERT INTO `yzgl` VALUES ('11', 'X11', 'Y05', '母', '16', '黑白', '是', '幼猪舍1', '产房1', '10', '2019-04-15', '出生', '', '暂无');
INSERT INTO `yzgl` VALUES ('12', 'X12', 'Y01', '母', '14', '长白', '是', '幼猪舍2', '产房2', '12', '2019-04-16', '出生', null, '暂无');
INSERT INTO `yzgl` VALUES ('16', 'X13', 'Y02', '公', '9', '纯黑', '否', '产房3', null, '10', '2019-04-09', '出生', null, '暂无');
INSERT INTO `yzgl` VALUES ('17', 'X14', 'Y03', '公', '13', '短白', '是', '幼猪舍3', '产房3', '14', '2019-04-11', '出生', null, '暂无');
INSERT INTO `yzgl` VALUES ('18', 'X15', 'Y04', '母', '15', '长白', '是', '幼猪舍2', '产房3', '13', '2019-04-12', '出生', null, '暂无');
INSERT INTO `yzgl` VALUES ('19', 'X16', 'Y05', '母', '16', '黑白', '是', '幼猪舍1', '产房1', '10', '2019-04-15', '出生', '', '暂无');
INSERT INTO `yzgl` VALUES ('20', 'X17', 'Y01', '母', '14', '长白', '是', '幼猪舍2', '产房2', '12', '2019-04-16', '出生', null, '暂无');
INSERT INTO `yzgl` VALUES ('21', 'X18', 'Y01', '公', '13', '黑白', '是', '幼猪舍2', '产房3', '18', '2019-03-16', '出生', '2019-04-16', '死亡');
INSERT INTO `yzgl` VALUES ('22', 'X19', 'Y02', '母', '14', '长白', '是', '幼猪舍1', '产房2', '16', '2019-02-16', '出生', '2018-03-17', '死亡');
INSERT INTO `yzgl` VALUES ('23', 'X20', 'Y03', '公', '13', '黑白', '是', '幼猪舍2', '产房3', '18', '2019-03-16', '出生', '2019-04-16', '死亡');
INSERT INTO `yzgl` VALUES ('24', 'X21', 'Y02', '母', '14', '长白', '是', '幼猪舍1', '产房2', '16', '2019-02-16', '出生', '2018-03-17', '死亡');
INSERT INTO `yzgl` VALUES ('25', 'X22', 'Y01', '公', '13', '黑白', '是', '幼猪舍2', '产房3', '18', '2019-03-16', '出生', '2019-04-16', '死亡');
INSERT INTO `yzgl` VALUES ('26', 'X23', 'Y02', '母', '14', '长白', '是', '幼猪舍1', '产房2', '16', '2019-02-16', '出生', '2018-03-17', '死亡');

-- ----------------------------
-- Table structure for zzgl
-- ----------------------------
DROP TABLE IF EXISTS `zzgl`;
CREATE TABLE `zzgl` (
  `id` int(60) NOT NULL AUTO_INCREMENT,
  `ear_number` varchar(255) NOT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `is_present` varchar(255) DEFAULT NULL,
  `age` int(60) DEFAULT NULL,
  `varieties` varchar(255) DEFAULT NULL,
  `production_situation` varchar(255) DEFAULT NULL,
  `is_transfer` varchar(255) DEFAULT NULL,
  `current_house_number` varchar(255) DEFAULT NULL,
  `before_house_number` varchar(255) DEFAULT NULL,
  `approach_weight` varchar(255) DEFAULT NULL,
  `approach_time` varchar(255) DEFAULT NULL,
  `approach_type` varchar(255) DEFAULT NULL,
  `leaving_time` varchar(255) DEFAULT NULL,
  `departure_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of zzgl
-- ----------------------------
INSERT INTO `zzgl` VALUES ('37', 'Y01', '母', '是', '191', '二元', '妊娠', '是', '保育舍1', '配种舍1', '134', '2019-04-15', '出生', '', '暂无');
INSERT INTO `zzgl` VALUES ('38', 'Y03', '公', '是', '123', '长白', null, '否', '公猪舍1', null, '190', '2019-04-17', '出生', '', '暂无');
INSERT INTO `zzgl` VALUES ('39', 'Y02', '公', '是', '120', '二元', '', '是', '公猪舍2', '', '132', '2019-04-02', '购入', '', '暂无');
INSERT INTO `zzgl` VALUES ('40', 'Y04', '母', '是', '130', '纯黑', '妊娠', '是', '保育舍2', '配种舍1', '140', '2019-04-03', '出生', null, '暂无');
INSERT INTO `zzgl` VALUES ('41', 'Y05', '母', '否', '140', '黑白', '待配种', '是', '外舍', '配种舍1', '120', '2019-04-04', '购入', '2019-04-17', '转出配种');
INSERT INTO `zzgl` VALUES ('42', 'Y06', '母', '是', '132', '长白', '分娩', '是', '产房1', '保育舍2', '153', '2019-04-03', '购入', null, '暂无');
INSERT INTO `zzgl` VALUES ('43', 'Y07', '母', '是', '191', '二元', '妊娠', '是', '保育舍1', '配种舍1', '134', '2019-04-15', '出生', '', '暂无');
INSERT INTO `zzgl` VALUES ('44', 'Y08', '公', '是', '123', '长白', null, '否', '公猪舍1', null, '190', '2019-04-17', '出生', '', '暂无');
INSERT INTO `zzgl` VALUES ('45', 'Y09', '公', '是', '120', '二元', '', '是', '公猪舍2', '', '132', '2019-04-02', '购入', '', '暂无');
INSERT INTO `zzgl` VALUES ('46', 'Y010', '母', '是', '130', '纯黑', '妊娠', '是', '保育舍2', '配种舍1', '140', '2019-04-03', '出生', null, '暂无');
INSERT INTO `zzgl` VALUES ('47', 'Y011', '母', '否', '140', '黑白', '待配种', '是', '外舍', '配种舍1', '120', '2019-04-03', '购入', '2019-04-17', '转出配种');
INSERT INTO `zzgl` VALUES ('48', 'Y012', '母', '是', '132', '长白', '分娩', '是', '产房1', '保育舍2', '153', '2019-04-03', '购入', null, '暂无');
