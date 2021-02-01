/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : epidemic

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 01/02/2021 10:47:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for epidemics
-- ----------------------------
DROP TABLE IF EXISTS `epidemics`;
CREATE TABLE `epidemics`  (
  `serial_id` int(11) NOT NULL AUTO_INCREMENT,
  `province_id` int(11) NULL DEFAULT NULL,
  `data_year` smallint(6) NULL DEFAULT NULL,
  `data_month` smallint(6) NULL DEFAULT NULL,
  `data_day` smallint(6) NULL DEFAULT NULL,
  `affirmed` int(11) NULL DEFAULT NULL,
  `suspected` int(11) NULL DEFAULT NULL,
  `isolated` int(11) NULL DEFAULT NULL,
  `dead` int(11) NULL DEFAULT NULL,
  `cured` int(11) NULL DEFAULT NULL,
  `user_id` int(11) NULL DEFAULT NULL,
  `input_date` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`serial_id`) USING BTREE,
  INDEX `FK_Reference_1`(`province_id`) USING BTREE,
  INDEX `FK_Reference_2`(`user_id`) USING BTREE,
  CONSTRAINT `FK_Reference_1` FOREIGN KEY (`province_id`) REFERENCES `provinces` (`province_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_Reference_2` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 119 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of epidemics
-- ----------------------------
INSERT INTO `epidemics` VALUES (1, 11, 2020, 9, 12, 1111, 1111, 11111, 1, 11111, 1, '2020-09-11 08:26:45');
INSERT INTO `epidemics` VALUES (2, 12, 2020, 9, 12, 222, 222, 2222, 2, 2222, 1, '2020-09-11 08:26:45');
INSERT INTO `epidemics` VALUES (3, 13, 2020, 9, 12, 3333, 3333, 3333, 3, 333, 1, '2020-09-11 08:26:45');
INSERT INTO `epidemics` VALUES (4, 14, 2020, 9, 12, 4444, 4444, 44444, 4, 4444, 1, '2020-09-11 08:26:45');
INSERT INTO `epidemics` VALUES (5, 15, 2020, 9, 12, 555, 5555, 555, 5, 555, 1, '2020-09-11 08:26:45');
INSERT INTO `epidemics` VALUES (6, 21, 2020, 9, 12, 5555, 5555, 555, 6, 5555, 1, '2020-09-11 08:26:45');
INSERT INTO `epidemics` VALUES (7, 11, 2020, 9, 18, 1, 1, 1, 1, 1, 1, '2020-09-18 11:08:55');
INSERT INTO `epidemics` VALUES (8, 12, 2020, 9, 18, 2, 2, 2, 2, 2, 1, '2020-09-18 11:08:55');
INSERT INTO `epidemics` VALUES (9, 13, 2020, 9, 18, 3, 3, 3, 4, 3, 1, '2020-09-18 11:08:55');
INSERT INTO `epidemics` VALUES (10, 14, 2020, 9, 18, 6, 5, 2, 0, 4, 1, '2020-09-18 11:08:55');
INSERT INTO `epidemics` VALUES (11, 15, 2020, 9, 18, 7, 7, 7, 7, 7, 1, '2020-09-18 11:08:55');
INSERT INTO `epidemics` VALUES (12, 21, 2020, 9, 18, 1, 0, 0, 0, 0, 1, '2020-09-18 11:08:55');
INSERT INTO `epidemics` VALUES (13, 22, 2020, 9, 18, 1, 43, 435, 32, 5435, 1, '2020-09-18 11:11:43');
INSERT INTO `epidemics` VALUES (14, 23, 2020, 9, 18, 1, 323, 56, 34, 534, 1, '2020-09-18 11:11:43');
INSERT INTO `epidemics` VALUES (15, 31, 2020, 9, 18, 1, 423, 35, 23, 534, 1, '2020-09-18 11:11:43');
INSERT INTO `epidemics` VALUES (16, 32, 2020, 9, 18, 1, 455, 543, 54, 333, 1, '2020-09-18 11:11:43');
INSERT INTO `epidemics` VALUES (17, 33, 2020, 9, 18, 1, 423, 534, 23, 45, 1, '2020-09-18 11:11:43');
INSERT INTO `epidemics` VALUES (18, 34, 2020, 9, 18, 1, 346, 435, 32, 534, 1, '2020-09-18 11:11:43');
INSERT INTO `epidemics` VALUES (19, 11, 2020, 9, 17, 10, 0, 0, 0, 0, 1, NULL);
INSERT INTO `epidemics` VALUES (20, 12, 2020, 9, 17, 0, 0, 0, 0, 0, 1, NULL);
INSERT INTO `epidemics` VALUES (21, 13, 2020, 9, 17, 0, 0, 0, 0, 0, 1, NULL);
INSERT INTO `epidemics` VALUES (22, 14, 2020, 9, 17, 0, 0, 0, 0, 0, 1, NULL);
INSERT INTO `epidemics` VALUES (23, 15, 2020, 9, 17, 0, 0, 0, 0, 0, 1, NULL);
INSERT INTO `epidemics` VALUES (24, 21, 2020, 9, 17, 0, 0, 0, 0, 0, 1, NULL);
INSERT INTO `epidemics` VALUES (25, 35, 2020, 9, 18, 100, 4, 4, 1, 4, 2, '2020-09-18 09:31:45');
INSERT INTO `epidemics` VALUES (26, 36, 2020, 9, 18, 0, 0, 0, 0, 0, 2, '2020-09-18 09:31:45');
INSERT INTO `epidemics` VALUES (27, 37, 2020, 9, 18, 0, 0, 0, 0, 0, 2, '2020-09-18 09:31:45');
INSERT INTO `epidemics` VALUES (28, 41, 2020, 9, 18, 0, 0, 0, 0, 0, 2, '2020-09-18 09:31:45');
INSERT INTO `epidemics` VALUES (29, 42, 2020, 9, 18, 0, 0, 0, 0, 0, 2, '2020-09-18 09:31:45');
INSERT INTO `epidemics` VALUES (30, 43, 2020, 9, 18, 0, 0, 0, 0, 0, 2, '2020-09-18 09:31:45');
INSERT INTO `epidemics` VALUES (31, 22, 2020, 9, 17, 0, 0, 0, 0, 0, 2, '2020-09-18 09:32:59');
INSERT INTO `epidemics` VALUES (32, 23, 2020, 9, 17, 0, 0, 0, 0, 0, 2, '2020-09-18 09:32:59');
INSERT INTO `epidemics` VALUES (33, 31, 2020, 9, 17, 0, 0, 0, 0, 0, 2, '2020-09-18 09:32:59');
INSERT INTO `epidemics` VALUES (34, 32, 2020, 9, 17, 0, 0, 0, 0, 0, 2, '2020-09-18 09:32:59');
INSERT INTO `epidemics` VALUES (35, 33, 2020, 9, 17, 0, 0, 0, 0, 0, 2, '2020-09-18 09:32:59');
INSERT INTO `epidemics` VALUES (36, 34, 2020, 9, 17, 0, 0, 0, 0, 0, 2, '2020-09-18 09:32:59');
INSERT INTO `epidemics` VALUES (37, 35, 2020, 9, 17, 1, 1, 1, 1, 1, 2, '2020-09-18 09:33:18');
INSERT INTO `epidemics` VALUES (38, 36, 2020, 9, 17, 0, 0, 0, 0, 0, 2, '2020-09-18 09:33:18');
INSERT INTO `epidemics` VALUES (39, 37, 2020, 9, 17, 0, 0, 0, 0, 0, 2, '2020-09-18 09:33:18');
INSERT INTO `epidemics` VALUES (40, 41, 2020, 9, 17, 0, 0, 0, 0, 0, 2, '2020-09-18 09:33:18');
INSERT INTO `epidemics` VALUES (41, 42, 2020, 9, 17, 0, 0, 0, 0, 0, 2, '2020-09-18 09:33:18');
INSERT INTO `epidemics` VALUES (42, 43, 2020, 9, 17, 0, 0, 0, 0, 0, 2, '2020-09-18 09:33:18');
INSERT INTO `epidemics` VALUES (43, 11, 2020, 9, 13, 1, 1, 1, 1, 1, 1, '2020-09-13 12:00:54');
INSERT INTO `epidemics` VALUES (44, 12, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:00:54');
INSERT INTO `epidemics` VALUES (45, 13, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:00:54');
INSERT INTO `epidemics` VALUES (46, 14, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:00:54');
INSERT INTO `epidemics` VALUES (47, 15, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:00:54');
INSERT INTO `epidemics` VALUES (48, 21, 2020, 9, 13, 2, 2, 2, 2, 2, 1, '2020-09-13 12:00:54');
INSERT INTO `epidemics` VALUES (49, 22, 2020, 9, 13, 3, 3, 3, 3, 3, 1, '2020-09-13 12:02:57');
INSERT INTO `epidemics` VALUES (50, 23, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:02:57');
INSERT INTO `epidemics` VALUES (51, 31, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:02:57');
INSERT INTO `epidemics` VALUES (52, 32, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:02:57');
INSERT INTO `epidemics` VALUES (53, 33, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:02:57');
INSERT INTO `epidemics` VALUES (54, 34, 2020, 9, 13, 4, 4, 4, 4, 4, 1, '2020-09-13 12:02:58');
INSERT INTO `epidemics` VALUES (55, 35, 2020, 9, 13, 5, 5, 5, 5, 5, 1, '2020-09-13 12:03:12');
INSERT INTO `epidemics` VALUES (56, 36, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:03:12');
INSERT INTO `epidemics` VALUES (57, 37, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:03:12');
INSERT INTO `epidemics` VALUES (58, 41, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:03:12');
INSERT INTO `epidemics` VALUES (59, 42, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:03:12');
INSERT INTO `epidemics` VALUES (60, 43, 2020, 9, 13, 6, 6, 6, 6, 6, 1, '2020-09-13 12:03:12');
INSERT INTO `epidemics` VALUES (61, 44, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:03:16');
INSERT INTO `epidemics` VALUES (62, 45, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:03:16');
INSERT INTO `epidemics` VALUES (63, 46, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:03:16');
INSERT INTO `epidemics` VALUES (64, 50, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:03:16');
INSERT INTO `epidemics` VALUES (65, 51, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:03:16');
INSERT INTO `epidemics` VALUES (66, 52, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:03:16');
INSERT INTO `epidemics` VALUES (67, 53, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:03:17');
INSERT INTO `epidemics` VALUES (68, 54, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:03:17');
INSERT INTO `epidemics` VALUES (69, 61, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:03:17');
INSERT INTO `epidemics` VALUES (70, 62, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:03:17');
INSERT INTO `epidemics` VALUES (71, 63, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:03:17');
INSERT INTO `epidemics` VALUES (72, 64, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:03:17');
INSERT INTO `epidemics` VALUES (73, 65, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:03:25');
INSERT INTO `epidemics` VALUES (74, 71, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:03:25');
INSERT INTO `epidemics` VALUES (75, 81, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:03:25');
INSERT INTO `epidemics` VALUES (76, 82, 2020, 9, 13, 0, 0, 0, 0, 0, 1, '2020-09-13 12:03:26');
INSERT INTO `epidemics` VALUES (77, 44, 2020, 9, 18, 1, 1, 1, 1, 1, 2, '2020-09-18 11:48:02');
INSERT INTO `epidemics` VALUES (78, 45, 2020, 9, 18, 2, 2, 2, 2, 2, 2, '2020-09-18 11:48:02');
INSERT INTO `epidemics` VALUES (79, 46, 2020, 9, 18, 3, 3, 3, 3, 3, 2, '2020-09-18 11:48:02');
INSERT INTO `epidemics` VALUES (80, 50, 2020, 9, 18, 4, 4, 4, 4, 4, 2, '2020-09-18 11:48:02');
INSERT INTO `epidemics` VALUES (81, 51, 2020, 9, 18, 5, 5, 5, 5, 5, 2, '2020-09-18 11:48:02');
INSERT INTO `epidemics` VALUES (82, 52, 2020, 9, 18, 6, 6, 6, 6, 6, 2, '2020-09-18 11:48:02');
INSERT INTO `epidemics` VALUES (83, 11, 2020, 9, 16, 1, 1, 1, 1, 1, 2, '2020-09-18 11:51:29');
INSERT INTO `epidemics` VALUES (84, 12, 2020, 9, 16, 0, 0, 0, 0, 0, 2, '2020-09-18 11:51:29');
INSERT INTO `epidemics` VALUES (85, 13, 2020, 9, 16, 0, 0, 0, 0, 0, 2, '2020-09-18 11:51:29');
INSERT INTO `epidemics` VALUES (86, 14, 2020, 9, 16, 0, 0, 0, 0, 0, 2, '2020-09-18 11:51:29');
INSERT INTO `epidemics` VALUES (87, 15, 2020, 9, 16, 0, 0, 0, 0, 0, 2, '2020-09-18 11:51:29');
INSERT INTO `epidemics` VALUES (88, 21, 2020, 9, 16, 0, 0, 0, 0, 0, 2, '2020-09-18 11:51:29');
INSERT INTO `epidemics` VALUES (89, 11, 2020, 9, 14, 0, 0, 0, 0, 0, 1, '2020-09-18 09:42:46');
INSERT INTO `epidemics` VALUES (90, 12, 2020, 9, 14, 0, 0, 0, 0, 0, 1, '2020-09-18 09:42:46');
INSERT INTO `epidemics` VALUES (91, 13, 2020, 9, 14, 0, 0, 0, 0, 0, 1, '2020-09-18 09:42:46');
INSERT INTO `epidemics` VALUES (92, 14, 2020, 9, 14, 0, 0, 0, 0, 0, 1, '2020-09-18 09:42:46');
INSERT INTO `epidemics` VALUES (93, 15, 2020, 9, 14, 0, 0, 0, 0, 0, 1, '2020-09-18 09:42:46');
INSERT INTO `epidemics` VALUES (94, 21, 2020, 9, 14, 0, 0, 0, 0, 0, 1, '2020-09-18 09:42:46');
INSERT INTO `epidemics` VALUES (95, 22, 2020, 9, 12, 1, 1, 1, 1, 1, 1, '2020-09-18 10:29:20');
INSERT INTO `epidemics` VALUES (96, 23, 2020, 9, 12, 0, 0, 0, 0, 0, 1, '2020-09-18 10:29:20');
INSERT INTO `epidemics` VALUES (97, 31, 2020, 9, 12, 0, 0, 0, 0, 0, 1, '2020-09-18 10:29:20');
INSERT INTO `epidemics` VALUES (98, 32, 2020, 9, 12, 0, 0, 0, 0, 0, 1, '2020-09-18 10:29:20');
INSERT INTO `epidemics` VALUES (99, 33, 2020, 9, 12, 0, 0, 0, 0, 0, 1, '2020-09-18 10:29:20');
INSERT INTO `epidemics` VALUES (100, 34, 2020, 9, 12, 0, 0, 0, 0, 0, 1, '2020-09-18 10:29:20');
INSERT INTO `epidemics` VALUES (101, 35, 2020, 9, 12, 0, 0, 0, 0, 0, 1, '2020-09-18 10:29:26');
INSERT INTO `epidemics` VALUES (102, 36, 2020, 9, 12, 0, 0, 0, 0, 0, 1, '2020-09-18 10:29:26');
INSERT INTO `epidemics` VALUES (103, 37, 2020, 9, 12, 0, 0, 0, 0, 0, 1, '2020-09-18 10:29:26');
INSERT INTO `epidemics` VALUES (104, 41, 2020, 9, 12, 0, 0, 0, 0, 0, 1, '2020-09-18 10:29:26');
INSERT INTO `epidemics` VALUES (105, 42, 2020, 9, 12, 0, 0, 0, 0, 0, 1, '2020-09-18 10:29:26');
INSERT INTO `epidemics` VALUES (106, 43, 2020, 9, 12, 0, 0, 0, 0, 0, 1, '2020-09-18 10:29:26');
INSERT INTO `epidemics` VALUES (107, 11, 2021, 1, 31, 1, 1, 1, 1, 1, NULL, '2021-01-31 09:45:42');
INSERT INTO `epidemics` VALUES (108, 12, 2021, 1, 31, 2, 2, 0, 0, 0, NULL, '2021-01-31 09:45:42');
INSERT INTO `epidemics` VALUES (109, 13, 2021, 1, 31, 0, 0, 0, 0, 0, NULL, '2021-01-31 09:45:42');
INSERT INTO `epidemics` VALUES (110, 14, 2021, 1, 31, 0, 0, 0, 0, 0, NULL, '2021-01-31 09:45:42');
INSERT INTO `epidemics` VALUES (111, 15, 2021, 1, 31, 0, 0, 0, 0, 0, NULL, '2021-01-31 09:45:42');
INSERT INTO `epidemics` VALUES (112, 21, 2021, 1, 31, 0, 0, 0, 0, 0, NULL, '2021-01-31 09:45:42');
INSERT INTO `epidemics` VALUES (113, 22, 2021, 1, 31, 2, 2, 2, 2, 2, NULL, '2021-01-31 16:00:14');
INSERT INTO `epidemics` VALUES (114, 23, 2021, 1, 31, 0, 53, 0, 0, 3, NULL, '2021-01-31 16:00:14');
INSERT INTO `epidemics` VALUES (115, 31, 2021, 1, 31, 5354, 543, 53, 0, 53, NULL, '2021-01-31 16:00:14');
INSERT INTO `epidemics` VALUES (116, 32, 2021, 1, 31, 0, 0, 0, 0, 5, NULL, '2021-01-31 16:00:14');
INSERT INTO `epidemics` VALUES (117, 33, 2021, 1, 31, 0, 53, 5, 0, 0, NULL, '2021-01-31 16:00:14');
INSERT INTO `epidemics` VALUES (118, 34, 2021, 1, 31, 0, 0, 3, 53, 535, NULL, '2021-01-31 16:00:14');

-- ----------------------------
-- Table structure for provinces
-- ----------------------------
DROP TABLE IF EXISTS `provinces`;
CREATE TABLE `provinces`  (
  `province_id` int(11) NOT NULL AUTO_INCREMENT,
  `province_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `province_py` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `del_flag` smallint(6) NULL DEFAULT NULL,
  PRIMARY KEY (`province_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 83 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of provinces
-- ----------------------------
INSERT INTO `provinces` VALUES (11, '北京', 'beijing', NULL);
INSERT INTO `provinces` VALUES (12, '天津', 'tianjin', NULL);
INSERT INTO `provinces` VALUES (13, '河北', 'hebei', NULL);
INSERT INTO `provinces` VALUES (14, '山西', 'shanxi', NULL);
INSERT INTO `provinces` VALUES (15, '内蒙古', 'neimenggu', NULL);
INSERT INTO `provinces` VALUES (21, '辽宁', 'liaoning', NULL);
INSERT INTO `provinces` VALUES (22, '吉林', 'jilin', NULL);
INSERT INTO `provinces` VALUES (23, '黑龙江', 'heilongjiang', NULL);
INSERT INTO `provinces` VALUES (31, '上海', 'shanghai', NULL);
INSERT INTO `provinces` VALUES (32, '江苏', 'jiangsu', NULL);
INSERT INTO `provinces` VALUES (33, '浙江', 'zhejiang', NULL);
INSERT INTO `provinces` VALUES (34, '安徽', 'anhui', NULL);
INSERT INTO `provinces` VALUES (35, '福建', 'fujian', NULL);
INSERT INTO `provinces` VALUES (36, '江西', 'jiangxi', NULL);
INSERT INTO `provinces` VALUES (37, '山东', 'shandong', NULL);
INSERT INTO `provinces` VALUES (41, '河南', 'henan', NULL);
INSERT INTO `provinces` VALUES (42, '湖北', 'hubei', NULL);
INSERT INTO `provinces` VALUES (43, '湖南', 'hunan', NULL);
INSERT INTO `provinces` VALUES (44, '广东', 'guangdong', NULL);
INSERT INTO `provinces` VALUES (45, '广西', 'guangxi', NULL);
INSERT INTO `provinces` VALUES (46, '海南', 'hainan', NULL);
INSERT INTO `provinces` VALUES (50, '重庆', 'chongqing', NULL);
INSERT INTO `provinces` VALUES (51, '四川', 'sichuan', NULL);
INSERT INTO `provinces` VALUES (52, '贵州', 'guizhou', NULL);
INSERT INTO `provinces` VALUES (53, '云南', 'yunnan', NULL);
INSERT INTO `provinces` VALUES (54, '西藏', 'xizang', NULL);
INSERT INTO `provinces` VALUES (61, '陕西', 'shaanxi', NULL);
INSERT INTO `provinces` VALUES (62, '甘肃', 'gansu', NULL);
INSERT INTO `provinces` VALUES (63, '青海', 'qinghai', NULL);
INSERT INTO `provinces` VALUES (64, '宁夏', 'ningxia', NULL);
INSERT INTO `provinces` VALUES (65, '新疆', 'xinjiang', NULL);
INSERT INTO `provinces` VALUES (71, '台湾', 'taiwan', NULL);
INSERT INTO `provinces` VALUES (81, '香港', 'xianggang', NULL);
INSERT INTO `provinces` VALUES (82, '澳门', 'aomen', NULL);

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `del_flag` smallint(6) NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`, `account`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, '1', '1', 'admin', 0);
INSERT INTO `users` VALUES (2, 'zhangsan', '23', '张三', 0);
INSERT INTO `users` VALUES (3, 'zhangsan2', '232', '张三2', 0);
INSERT INTO `users` VALUES (13, '顿启鹏', '123', NULL, NULL);
INSERT INTO `users` VALUES (14, '2', '2', NULL, NULL);
INSERT INTO `users` VALUES (15, '2', '2', NULL, NULL);
INSERT INTO `users` VALUES (16, '3', '3', '3', NULL);
INSERT INTO `users` VALUES (17, '4', '4', '4', NULL);
INSERT INTO `users` VALUES (18, 'dqp', '87', 'dun', NULL);

SET FOREIGN_KEY_CHECKS = 1;
