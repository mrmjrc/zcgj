/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50527
 Source Host           : localhost:3306
 Source Schema         : zcgj

 Target Server Type    : MySQL
 Target Server Version : 50527
 File Encoding         : 65001

 Date: 22/04/2019 00:41:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bio_safety
-- ----------------------------
DROP TABLE IF EXISTS `bio_safety`;
CREATE TABLE `bio_safety`  (
  `id` int(60) NOT NULL AUTO_INCREMENT,
  `ear_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `physical_examination` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `immune_status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `vaccination_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `disinfection_situation` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `disease_condition` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 26 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of bio_safety
-- ----------------------------
INSERT INTO `bio_safety` VALUES (1, 'Y01', '良好', '免疫', '疫苗1', '已消毒', '无');
INSERT INTO `bio_safety` VALUES (2, 'Y03', '良好', '免疫', '疫苗2', '已消毒', '无');
INSERT INTO `bio_safety` VALUES (3, 'Y04', '良好', '免疫', '疫苗3', '未消毒', '无');
INSERT INTO `bio_safety` VALUES (4, 'Y05', '一般', '未免疫', '未接种', '未消毒', '无');
INSERT INTO `bio_safety` VALUES (5, 'Y02', '生病', '未免疫', '未接种', '已消毒', '发现疾病');
INSERT INTO `bio_safety` VALUES (6, 'Y06', '良好', '免疫', '疫苗1', '已消毒', '无');
INSERT INTO `bio_safety` VALUES (7, 'Y07', '良好', '免疫', '疫苗2', '已消毒', '无');
INSERT INTO `bio_safety` VALUES (8, 'Y08', '良好', '免疫', '疫苗3', '未消毒', '无');
INSERT INTO `bio_safety` VALUES (9, 'Y09', '一般', '未免疫', '未接种', '未消毒', '无');
INSERT INTO `bio_safety` VALUES (10, 'Y10', '生病', '未免疫', '未接种', '已消毒', '发现疾病');
INSERT INTO `bio_safety` VALUES (11, 'Y11', '良好', '免疫', '疫苗1', '已消毒', '无');
INSERT INTO `bio_safety` VALUES (12, 'Y12', '良好', '免疫', '疫苗2', '已消毒', '无');
INSERT INTO `bio_safety` VALUES (13, 'Y13', '良好', '免疫', '疫苗3', '未消毒', '无');
INSERT INTO `bio_safety` VALUES (14, 'Y14', '一般', '未免疫', '未接种', '未消毒', '无');
INSERT INTO `bio_safety` VALUES (15, 'Y15', '生病', '未免疫', '未接种', '已消毒', '发现疾病');
INSERT INTO `bio_safety` VALUES (16, 'Y16', '良好', '免疫', '疫苗1', '已消毒', '无');
INSERT INTO `bio_safety` VALUES (17, 'Y17', '良好', '免疫', '疫苗2', '已消毒', '无');
INSERT INTO `bio_safety` VALUES (18, 'Y18', '良好', '免疫', '疫苗3', '未消毒', '无');
INSERT INTO `bio_safety` VALUES (19, 'Y19', '一般', '未免疫', '未接种', '未消毒', '无');
INSERT INTO `bio_safety` VALUES (20, 'Y20', '生病', '未免疫', '未接种', '已消毒', '发现疾病');
INSERT INTO `bio_safety` VALUES (21, 'Y21', '良好', '免疫', '疫苗1', '已消毒', '无');
INSERT INTO `bio_safety` VALUES (22, 'Y22', '良好', '免疫', '疫苗2', '已消毒', '无');
INSERT INTO `bio_safety` VALUES (23, 'Y23', '良好', '免疫', '疫苗3', '未消毒', '无');
INSERT INTO `bio_safety` VALUES (24, 'Y24', '一般', '未免疫', '未接种', '未消毒', '无');
INSERT INTO `bio_safety` VALUES (25, 'Y25', '生病', '未免疫', '未接种', '已消毒', '发现疾病');

-- ----------------------------
-- Table structure for breeding_pig
-- ----------------------------
DROP TABLE IF EXISTS `breeding_pig`;
CREATE TABLE `breeding_pig`  (
  `id` int(60) NOT NULL AUTO_INCREMENT,
  `ear_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `gender` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `is_present` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(60) NULL DEFAULT NULL,
  `varieties` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `production_situation` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `is_transfer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `current_house_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `before_house_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `approach_weight` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `approach_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `approach_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `leaving_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `departure_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 49 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of breeding_pig
-- ----------------------------
INSERT INTO `breeding_pig` VALUES (37, 'Y01', '母', '是', 191, '二元', '妊娠', '是', '保育舍1', '配种舍1', '134', '2019-04-15', '出生', '', '暂无');
INSERT INTO `breeding_pig` VALUES (38, 'Y03', '公', '是', 123, '长白', '', '否', '公猪舍1', '', '190', '2019-04-16', '出生', '', '暂无');
INSERT INTO `breeding_pig` VALUES (39, 'Y02', '公', '是', 120, '二元', '', '是', '公猪舍2', '', '132', '2019-04-02', '购入', '', '暂无');
INSERT INTO `breeding_pig` VALUES (40, 'Y04', '母', '是', 130, '纯黑', '妊娠', '是', '保育舍2', '配种舍1', '140', '2019-04-03', '出生', NULL, '暂无');
INSERT INTO `breeding_pig` VALUES (41, 'Y05', '母', '否', 140, '黑白', '待配种', '是', '外舍', '配种舍1', '120', '2019-04-09', '购入', '2019-04-19', '转出配种');
INSERT INTO `breeding_pig` VALUES (42, 'Y06', '母', '是', 132, '长白', '分娩', '是', '产房1', '保育舍2', '153', '2019-04-03', '购入', NULL, '暂无');
INSERT INTO `breeding_pig` VALUES (43, 'Y07', '母', '是', 191, '二元', '妊娠', '是', '保育舍1', '配种舍1', '134', '2019-04-15', '出生', '', '暂无');
INSERT INTO `breeding_pig` VALUES (44, 'Y08', '公', '是', 123, '长白', NULL, '否', '公猪舍1', NULL, '190', '2019-04-17', '出生', '', '暂无');
INSERT INTO `breeding_pig` VALUES (45, 'Y09', '公', '是', 120, '二元', '', '是', '公猪舍2', '', '132', '2019-04-02', '购入', '', '暂无');
INSERT INTO `breeding_pig` VALUES (46, 'Y010', '母', '是', 130, '纯黑', '妊娠', '是', '保育舍2', '配种舍1', '140', '2019-04-03', '出生', NULL, '暂无');
INSERT INTO `breeding_pig` VALUES (47, 'Y011', '母', '否', 140, '黑白', '待配种', '是', '外舍', '配种舍1', '120', '2019-04-03', '购入', '2019-04-17', '转出配种');
INSERT INTO `breeding_pig` VALUES (48, 'Y012', '母', '是', 132, '长白', '分娩', '是', '产房1', '保育舍2', '153', '2019-04-03', '购入', NULL, '暂无');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `id` int(60) NOT NULL AUTO_INCREMENT,
  `recording_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `unit` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `supplier` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `unit_price` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `actual_expenditure` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 38 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES (2, '2019-04-16', '饲料', '饲料', 'kg', '供应商1', '100', '80', '8000', '公猪饲料');
INSERT INTO `goods` VALUES (3, '2019-04-16', '疫苗', '疾病预防', '支', '供应商2', '10', '800', '8000', '疫苗');
INSERT INTO `goods` VALUES (4, '2019-04-14', '饲料', '玉米', 'kg', '供应商3', '100', '10', '1000', '混合饲料');
INSERT INTO `goods` VALUES (5, '2019-04-12', '杂物', '日常用品', '件', '供应商4', '50', '20', '1000', '日常用品');
INSERT INTO `goods` VALUES (6, '2019-04-11', '饲料', '母猪饲料', 'kg', '供应商5', '200', '12', '2400', '母猪饲料');
INSERT INTO `goods` VALUES (7, '2019-04-13', '饲料', '幼猪饲料', 'kg', '供应商5', '100', '14', '1400', '幼猪饲料');
INSERT INTO `goods` VALUES (8, '2019-04-16', '饲料', '饲料', 'kg', '供应商1', '100', '80', '8000', '公猪饲料');
INSERT INTO `goods` VALUES (9, '2019-04-16', '疫苗', '疾病预防', '支', '供应商2', '10', '800', '8000', '疫苗');
INSERT INTO `goods` VALUES (10, '2019-04-14', '饲料', '玉米', 'kg', '供应商3', '100', '10', '1000', '混合饲料');
INSERT INTO `goods` VALUES (11, '2019-04-12', '杂物', '日常用品', '件', '供应商4', '50', '20', '1000', '日常用品');
INSERT INTO `goods` VALUES (12, '2019-04-11', '饲料', '母猪饲料', 'kg', '供应商5', '200', '12', '2400', '母猪饲料');
INSERT INTO `goods` VALUES (13, '2019-04-13', '饲料', '幼猪饲料', 'kg', '供应商5', '100', '14', '1400', '幼猪饲料');
INSERT INTO `goods` VALUES (14, '2019-04-16', '饲料', '饲料', 'kg', '供应商1', '100', '80', '8000', '公猪饲料');
INSERT INTO `goods` VALUES (15, '2019-04-16', '疫苗', '疾病预防', '支', '供应商2', '10', '800', '8000', '疫苗');
INSERT INTO `goods` VALUES (16, '2019-04-14', '饲料', '玉米', 'kg', '供应商3', '100', '10', '1000', '混合饲料');
INSERT INTO `goods` VALUES (17, '2019-04-12', '杂物', '日常用品', '件', '供应商4', '50', '20', '1000', '日常用品');
INSERT INTO `goods` VALUES (18, '2019-04-11', '饲料', '母猪饲料', 'kg', '供应商5', '200', '12', '2400', '母猪饲料');
INSERT INTO `goods` VALUES (19, '2019-04-13', '饲料', '幼猪饲料', 'kg', '供应商5', '100', '14', '1400', '幼猪饲料');
INSERT INTO `goods` VALUES (20, '2019-04-16', '饲料', '饲料', 'kg', '供应商1', '100', '80', '8000', '公猪饲料');
INSERT INTO `goods` VALUES (21, '2019-04-16', '疫苗', '疾病预防', '支', '供应商2', '10', '800', '8000', '疫苗');
INSERT INTO `goods` VALUES (22, '2019-04-14', '饲料', '玉米', 'kg', '供应商3', '100', '10', '1000', '混合饲料');
INSERT INTO `goods` VALUES (23, '2019-04-12', '杂物', '日常用品', '件', '供应商4', '50', '20', '1000', '日常用品');
INSERT INTO `goods` VALUES (24, '2019-04-11', '饲料', '母猪饲料', 'kg', '供应商5', '200', '12', '2400', '母猪饲料');
INSERT INTO `goods` VALUES (25, '2019-04-13', '饲料', '幼猪饲料', 'kg', '供应商5', '100', '14', '1400', '幼猪饲料');
INSERT INTO `goods` VALUES (26, '2019-04-16', '饲料', '饲料', 'kg', '供应商1', '100', '80', '8000', '公猪饲料');
INSERT INTO `goods` VALUES (27, '2019-04-16', '疫苗', '疾病预防', '支', '供应商2', '10', '800', '8000', '疫苗');
INSERT INTO `goods` VALUES (28, '2019-04-14', '饲料', '玉米', 'kg', '供应商3', '100', '10', '1000', '混合饲料');
INSERT INTO `goods` VALUES (29, '2019-04-12', '杂物', '日常用品', '件', '供应商4', '50', '20', '1000', '日常用品');
INSERT INTO `goods` VALUES (30, '2019-04-11', '饲料', '母猪饲料', 'kg', '供应商5', '200', '12', '2400', '母猪饲料');
INSERT INTO `goods` VALUES (31, '2019-04-13', '饲料', '幼猪饲料', 'kg', '供应商5', '100', '14', '1400', '幼猪饲料');
INSERT INTO `goods` VALUES (32, '2019-04-16', '饲料', '饲料', 'kg', '供应商1', '100', '80', '8000', '公猪饲料');
INSERT INTO `goods` VALUES (33, '2019-04-16', '疫苗', '疾病预防', '支', '供应商2', '10', '800', '8000', '疫苗');
INSERT INTO `goods` VALUES (34, '2019-04-14', '饲料', '玉米', 'kg', '供应商3', '100', '10', '1000', '混合饲料');
INSERT INTO `goods` VALUES (35, '2019-04-12', '杂物', '日常用品', '件', '供应商4', '50', '20', '1000', '日常用品');
INSERT INTO `goods` VALUES (36, '2019-04-11', '饲料', '母猪饲料', 'kg', '供应商5', '200', '12', '2400', '母猪饲料');
INSERT INTO `goods` VALUES (37, '2019-04-13', '饲料', '幼猪饲料', 'kg', '供应商5', '100', '14', '1400', '幼猪饲料');

-- ----------------------------
-- Table structure for porker_pig
-- ----------------------------
DROP TABLE IF EXISTS `porker_pig`;
CREATE TABLE `porker_pig`  (
  `id` int(60) NOT NULL AUTO_INCREMENT,
  `ear_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `age` int(60) NULL DEFAULT NULL,
  `varieties` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `is_transfer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `current_house_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `before_house_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `approach_weight` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `approach_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `approach_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `leaving_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `departure_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of porker_pig
-- ----------------------------
INSERT INTO `porker_pig` VALUES (2, 'R01', 140, '黑白', '是', '大猪舍1', '幼猪舍1', '160', '2018-04-15', '出生', '2019-04-17', '售出');
INSERT INTO `porker_pig` VALUES (3, 'R02', 170, '纯黑', '是', '大猪舍2', '幼猪舍2', '180', '2018-04-16', '出生', '2019-04-19', '售出');
INSERT INTO `porker_pig` VALUES (4, 'R03', 130, '长白', '是', '大猪舍3', '幼猪舍3', '172', '2018-04-17', '出生', '2019-04-16', '售出');
INSERT INTO `porker_pig` VALUES (5, 'R04', 134, '黑白', '是', '大猪舍4', '幼猪舍4', '169', '2018-04-18', '出生', '2019-04-18', '售出');
INSERT INTO `porker_pig` VALUES (6, 'R05', 140, '黑白', '是', '大猪舍1', '幼猪舍1', '160', '2018-04-15', '出生', '2019-04-17', '售出');
INSERT INTO `porker_pig` VALUES (7, 'R06', 170, '纯黑', '是', '大猪舍2', '幼猪舍2', '180', '2018-04-16', '出生', '2019-04-15', '售出');
INSERT INTO `porker_pig` VALUES (8, 'R07', 130, '长白', '是', '大猪舍3', '幼猪舍3', '172', '2018-04-17', '出生', '2019-04-16', '售出');
INSERT INTO `porker_pig` VALUES (9, 'R08', 134, '黑白', '是', '大猪舍4', '幼猪舍4', '169', '2018-04-18', '出生', '2019-04-18', '售出');
INSERT INTO `porker_pig` VALUES (10, 'R09', 140, '黑白', '是', '大猪舍1', '幼猪舍1', '160', '2018-04-15', '出生', '2019-04-17', '售出');
INSERT INTO `porker_pig` VALUES (11, 'R10', 170, '纯黑', '是', '大猪舍2', '幼猪舍2', '180', '2018-04-16', '出生', '2019-04-15', '售出');
INSERT INTO `porker_pig` VALUES (12, 'R11', 130, '长白', '是', '大猪舍3', '幼猪舍3', '172', '2018-04-17', '出生', '2019-04-16', '售出');
INSERT INTO `porker_pig` VALUES (13, 'R12', 134, '黑白', '是', '大猪舍4', '幼猪舍4', '169', '2018-04-18', '出生', '2019-04-18', '售出');
INSERT INTO `porker_pig` VALUES (14, 'R13', 140, '黑白', '是', '大猪舍1', '幼猪舍1', '160', '2018-04-15', '出生', '2019-04-17', '售出');
INSERT INTO `porker_pig` VALUES (15, 'R14', 170, '纯黑', '是', '大猪舍2', '幼猪舍2', '180', '2018-04-16', '出生', '2019-04-15', '售出');
INSERT INTO `porker_pig` VALUES (16, 'R15', 130, '长白', '是', '大猪舍3', '幼猪舍3', '172', '2018-04-17', '出生', '2019-04-16', '售出');
INSERT INTO `porker_pig` VALUES (17, 'R16', 134, '黑白', '是', '大猪舍4', '幼猪舍4', '169', '2018-04-18', '出生', '2019-04-18', '售出');
INSERT INTO `porker_pig` VALUES (18, 'R19', 163, '黑白', '是', '育肥舍1', '小猪舍1', '120', '2019-04-15', '出生', '2019-04-17', '售出');

-- ----------------------------
-- Table structure for production
-- ----------------------------
DROP TABLE IF EXISTS `production`;
CREATE TABLE `production`  (
  `id` int(60) NOT NULL AUTO_INCREMENT,
  `ear_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `age` int(60) NULL DEFAULT NULL,
  `current_house_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `parity` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `litter_size` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `mating_times` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `abortion_number` int(60) NULL DEFAULT NULL,
  `survival_number` int(60) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of production
-- ----------------------------
INSERT INTO `production` VALUES (2, 'Y01', 123, '产房1', '2', '12', '2', 4, 8);
INSERT INTO `production` VALUES (3, 'Y02', 164, '产房2', '3', '16', '4', 6, 10);
INSERT INTO `production` VALUES (4, 'Y03', 190, '产房3', '1', '9', '2', 3, 6);
INSERT INTO `production` VALUES (5, 'Y04', 159, '产房4', '4', '15', '7', 6, 9);
INSERT INTO `production` VALUES (6, 'Y05', 146, '产房1', '6', '17', '8', 5, 12);
INSERT INTO `production` VALUES (7, 'Y06', 123, '产房1', '2', '12', '2', 4, 8);
INSERT INTO `production` VALUES (8, 'Y07', 164, '产房2', '3', '16', '4', 6, 10);
INSERT INTO `production` VALUES (9, 'Y08', 190, '产房3', '1', '9', '2', 3, 6);
INSERT INTO `production` VALUES (10, 'Y09', 159, '产房4', '4', '15', '7', 6, 9);
INSERT INTO `production` VALUES (11, 'Y10', 146, '产房1', '6', '17', '8', 5, 12);
INSERT INTO `production` VALUES (12, 'Y11', 123, '产房1', '2', '12', '2', 4, 8);
INSERT INTO `production` VALUES (13, 'Y12', 164, '产房2', '3', '16', '4', 6, 10);
INSERT INTO `production` VALUES (14, 'Y13', 190, '产房3', '1', '9', '2', 3, 6);
INSERT INTO `production` VALUES (15, 'Y14', 159, '产房4', '4', '15', '7', 6, 9);
INSERT INTO `production` VALUES (16, 'Y15', 146, '产房1', '6', '17', '8', 5, 12);
INSERT INTO `production` VALUES (17, 'Y16', 123, '产房1', '2', '12', '2', 4, 8);
INSERT INTO `production` VALUES (18, 'Y17', 164, '产房2', '3', '16', '4', 6, 10);
INSERT INTO `production` VALUES (19, 'Y18', 190, '产房3', '1', '9', '2', 3, 6);
INSERT INTO `production` VALUES (20, 'Y19', 159, '产房4', '4', '15', '7', 6, 9);
INSERT INTO `production` VALUES (21, 'Y20', 146, '产房1', '6', '17', '8', 5, 12);
INSERT INTO `production` VALUES (22, 'Y21', 123, '产房1', '2', '12', '2', 4, 8);
INSERT INTO `production` VALUES (23, 'Y22', 164, '产房2', '3', '16', '4', 6, 10);
INSERT INTO `production` VALUES (24, 'Y23', 190, '产房3', '1', '9', '2', 3, 6);
INSERT INTO `production` VALUES (25, 'Y24', 159, '产房4', '4', '15', '7', 6, 9);
INSERT INTO `production` VALUES (26, 'Y25', 146, '产房1', '6', '17', '8', 5, 12);

-- ----------------------------
-- Table structure for user_register
-- ----------------------------
DROP TABLE IF EXISTS `user_register`;
CREATE TABLE `user_register`  (
  `id` int(60) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `gender` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `location` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `modify_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user_register
-- ----------------------------
INSERT INTO `user_register` VALUES (5, '1', 'e10adc3949ba59abbe56e057f20f883e', NULL, '15993877981', NULL, NULL, '2019-04-20 08:35:24', '2019-04-20 08:35:24');
INSERT INTO `user_register` VALUES (6, '2', 'e10adc3949ba59abbe56e057f20f883e', NULL, '15993877981', NULL, NULL, '2019-04-20 09:17:41', '2019-04-20 09:17:41');
INSERT INTO `user_register` VALUES (7, '3', 'e10adc3949ba59abbe56e057f20f883e', NULL, '15993877981', NULL, NULL, '2019-04-20 09:21:05', '2019-04-20 09:21:05');
INSERT INTO `user_register` VALUES (8, '6', 'e10adc3949ba59abbe56e057f20f883e', NULL, '15993877981', NULL, NULL, '2019-04-20 10:21:04', '2019-04-20 10:21:04');
INSERT INTO `user_register` VALUES (9, '4', 'e10adc3949ba59abbe56e057f20f883e', NULL, '15993877981', NULL, NULL, '2019-04-20 10:23:45', '2019-04-20 10:23:45');
INSERT INTO `user_register` VALUES (10, '5', 'e10adc3949ba59abbe56e057f20f883e', NULL, '15993877981', NULL, NULL, '2019-04-20 11:14:57', '2019-04-20 11:14:57');
INSERT INTO `user_register` VALUES (11, '7', 'e10adc3949ba59abbe56e057f20f883e', NULL, '18737634191', NULL, NULL, '2019-04-20 11:16:02', '2019-04-20 11:16:02');
INSERT INTO `user_register` VALUES (12, '8', 'e10adc3949ba59abbe56e057f20f883e', NULL, '15993877981', NULL, NULL, '2019-04-20 11:17:30', '2019-04-20 11:17:30');
INSERT INTO `user_register` VALUES (13, '9', 'e10adc3949ba59abbe56e057f20f883e', NULL, '15993877981', NULL, NULL, '2019-04-20 11:17:34', '2019-04-20 11:17:34');
INSERT INTO `user_register` VALUES (14, '10', 'e10adc3949ba59abbe56e057f20f883e', NULL, '15993877981', NULL, NULL, '2019-04-21 11:03:48', '2019-04-21 11:03:48');
INSERT INTO `user_register` VALUES (15, 'qa', '$2a$10$BvbEGxOtdo3HLsB.RtOQDOcgmGI/3cEXufBwYypvDAjLTW.dDyF66', NULL, '15993877981', NULL, NULL, '2019-04-21 13:10:11', '2019-04-21 13:10:11');

-- ----------------------------
-- Table structure for young_pig
-- ----------------------------
DROP TABLE IF EXISTS `young_pig`;
CREATE TABLE `young_pig`  (
  `id` int(60) NOT NULL AUTO_INCREMENT,
  `ear_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `mear_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `gender` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(60) NULL DEFAULT NULL,
  `varieties` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `is_transfer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `current_house_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `before_house_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `approach_weight` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `approach_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `approach_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `leaving_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `departure_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of young_pig
-- ----------------------------
INSERT INTO `young_pig` VALUES (1, 'X01', 'Y05', '母', 16, '黑白', '是', '幼猪舍1', '产房1', '10', '2019-04-15', '出生', '', '暂无');
INSERT INTO `young_pig` VALUES (2, 'X02', 'Y01', '母', 14, '长白', '是', '幼猪舍2', '产房2', '12', '2019-04-16', '出生', NULL, '暂无');
INSERT INTO `young_pig` VALUES (3, 'X03', 'Y02', '公', 9, '纯黑', '否', '产房3', NULL, '10', '2019-04-09', '出生', NULL, '暂无');
INSERT INTO `young_pig` VALUES (4, 'X04', 'Y03', '公', 13, '短白', '是', '幼猪舍3', '产房3', '14', '2019-04-11', '出生', NULL, '暂无');
INSERT INTO `young_pig` VALUES (5, 'X05', 'Y04', '母', 15, '长白', '是', '幼猪舍2', '产房3', '13', '2019-04-12', '出生', NULL, '暂无');
INSERT INTO `young_pig` VALUES (6, 'X06', 'Y05', '母', 16, '黑白', '是', '幼猪舍1', '产房1', '10', '2019-04-15', '出生', '', '暂无');
INSERT INTO `young_pig` VALUES (7, 'X07', 'Y01', '母', 14, '长白', '是', '幼猪舍2', '产房2', '12', '2019-04-16', '出生', NULL, '暂无');
INSERT INTO `young_pig` VALUES (8, 'X08', 'Y02', '公', 9, '纯黑', '否', '产房3', '', '8', '2019-04-09', '出生', '', '暂无');
INSERT INTO `young_pig` VALUES (9, 'X09', 'Y03', '公', 16, '短白', '是', '幼猪舍3', '产房3', '14', '2019-04-11', '出生', '', '暂无');
INSERT INTO `young_pig` VALUES (10, 'X10', 'Y04', '母', 15, '长白', '是', '幼猪舍2', '产房3', '13', '2019-04-12', '出生', NULL, '暂无');
INSERT INTO `young_pig` VALUES (11, 'X11', 'Y05', '母', 16, '黑白', '是', '幼猪舍1', '产房1', '10', '2019-04-15', '出生', '', '暂无');
INSERT INTO `young_pig` VALUES (12, 'X12', 'Y01', '母', 14, '长白', '是', '幼猪舍2', '产房2', '12', '2019-04-16', '出生', NULL, '暂无');
INSERT INTO `young_pig` VALUES (16, 'X13', 'Y02', '公', 9, '纯黑', '否', '产房3', NULL, '10', '2019-04-09', '出生', NULL, '暂无');
INSERT INTO `young_pig` VALUES (17, 'X14', 'Y03', '公', 13, '短白', '是', '幼猪舍3', '产房3', '14', '2019-04-11', '出生', NULL, '暂无');
INSERT INTO `young_pig` VALUES (18, 'X15', 'Y04', '母', 15, '长白', '是', '幼猪舍2', '产房3', '13', '2019-04-12', '出生', NULL, '暂无');
INSERT INTO `young_pig` VALUES (19, 'X16', 'Y05', '母', 16, '黑白', '是', '幼猪舍1', '产房1', '10', '2019-04-15', '出生', '', '暂无');
INSERT INTO `young_pig` VALUES (20, 'X17', 'Y01', '母', 14, '长白', '是', '幼猪舍2', '产房2', '12', '2019-04-15', '出生', '', '暂无');
INSERT INTO `young_pig` VALUES (21, 'X18', 'Y01', '公', 13, '黑白', '是', '幼猪舍2', '产房3', '18', '2019-03-16', '出生', '2019-04-16', '死亡');
INSERT INTO `young_pig` VALUES (22, 'X19', 'Y02', '母', 14, '长白', '是', '幼猪舍1', '产房2', '16', '2019-02-16', '出生', '2018-03-17', '死亡');
INSERT INTO `young_pig` VALUES (23, 'X20', 'Y03', '公', 13, '黑白', '是', '幼猪舍2', '产房3', '18', '2019-03-16', '出生', '2019-04-16', '死亡');
INSERT INTO `young_pig` VALUES (24, 'X21', 'Y02', '母', 14, '长白', '是', '幼猪舍1', '产房2', '16', '2019-02-16', '出生', '2018-03-17', '死亡');
INSERT INTO `young_pig` VALUES (25, 'X22', 'Y01', '公', 13, '黑白', '是', '幼猪舍2', '产房3', '18', '2019-03-16', '出生', '2019-04-16', '死亡');
INSERT INTO `young_pig` VALUES (26, 'X23', 'Y02', '母', 14, '长白', '是', '幼猪舍1', '产房2', '16', '2019-02-16', '出生', '2018-03-17', '死亡');

SET FOREIGN_KEY_CHECKS = 1;
