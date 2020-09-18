/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50731
Source Host           : localhost:3306
Source Database       : school

Target Server Type    : MYSQL
Target Server Version : 50731
File Encoding         : 65001

Date: 2020-09-18 08:49:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(45) NOT NULL COMMENT '课程名称',
  `student_id` int(11) NOT NULL COMMENT '学生id',
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1', 'Java', '1');
INSERT INTO `course` VALUES ('2', 'Python', '1');
INSERT INTO `course` VALUES ('3', '数学', '2');
INSERT INTO `course` VALUES ('4', '英语', '2');
INSERT INTO `course` VALUES ('5', '语文', '3');
INSERT INTO `course` VALUES ('6', '生物', '3');
INSERT INTO `course` VALUES ('7', 'Java', '3');
INSERT INTO `course` VALUES ('8', '化学', '3');
INSERT INTO `course` VALUES ('9', 'Java', '4');
INSERT INTO `course` VALUES ('10', '物理', '5');
INSERT INTO `course` VALUES ('11', 'Python', '5');
INSERT INTO `course` VALUES ('12', '数学', '5');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_name` varchar(20) NOT NULL COMMENT '学生姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '张三');
INSERT INTO `student` VALUES ('2', '李四');
INSERT INTO `student` VALUES ('3', '王五');
INSERT INTO `student` VALUES ('4', '小明');
INSERT INTO `student` VALUES ('5', '小红');
