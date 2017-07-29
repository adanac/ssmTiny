/*
SQLyog Enterprise v12.09 (64 bit)
MySQL - 5.6.36 : Database - ssm
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssm` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `ssm`;

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `student_id` int(11) NOT NULL AUTO_INCREMENT,
  `student_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=utf8;

/*Table structure for table `task` */

DROP TABLE IF EXISTS `task`;

CREATE TABLE `task` (
  `sys_no` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '内部主键',
  `task_no` varchar(32) NOT NULL COMMENT '任务号',
  `task_name` varchar(50) DEFAULT NULL COMMENT '任务名称',
  `task_status` int(10) NOT NULL DEFAULT '1' COMMENT '状态：\r\n1.初始 \r\n2.已释放 \r\n3.已指派 \r\n4.已完成 \r\n5.作废',
  `task_type` int(1) NOT NULL COMMENT '任务类型:1上架 2拣选 3移动 4补货 5盘点 6加工',
  `task_owner` varchar(50) DEFAULT NULL COMMENT '执行人',
  `task_desc` varchar(500) DEFAULT NULL COMMENT '任务描述',
  `yn` int(1) DEFAULT '1' COMMENT '是否有效：1是 0否',
  `ts` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '时间戳',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `create_pin` varchar(50) DEFAULT '' COMMENT '创建人',
  `update_pin` varchar(50) DEFAULT '' COMMENT '更新人',
  PRIMARY KEY (`sys_no`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `teacher_id` int(11) NOT NULL AUTO_INCREMENT,
  `teacher_name` varchar(20) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10004 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Table structure for table `user_data` */

DROP TABLE IF EXISTS `user_data`;

CREATE TABLE `user_data` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `sex` tinyint(1) DEFAULT NULL COMMENT '性别:0-女,1-男',
  `age` int(3) unsigned DEFAULT NULL COMMENT '年龄',
  `cardid` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '身份证',
  `qq` varchar(15) COLLATE utf8_bin DEFAULT NULL COMMENT 'qq号',
  `phone` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '手机或电话',
  `address` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
