
CREATE DATABASE /*!32312 IF NOT EXISTS*/`freedomfly` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `freedomfly`;


DROP TABLE IF EXISTS `airinfo`;

CREATE TABLE `airinfo` (
  `air_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `air_num` varchar(50) NOT NULL COMMENT '航班编号',
  `airline` varchar(50) NOT NULL COMMENT '航空公司',
  `air_type` varchar(20) NOT NULL COMMENT '航班类型',
  `air_space` varchar(20) NOT NULL COMMENT '舱位类型',
  `from_city` varchar(50) NOT NULL COMMENT '起飞城市',
  `from_time` date NOT NULL COMMENT '起飞时间',
  `land_city` varchar(50) NOT NULL COMMENT '降落城市',
  `land_time` varchar(50) NOT NULL COMMENT '降落时间',
  `price` double NOT NULL COMMENT '金额',
  `type` int(11) NOT NULL DEFAULT '1' COMMENT '往返类型',
  `specialPassengers` int(11) DEFAULT '1' COMMENT '特殊乘客',
  `air_food` int(11) DEFAULT '1' COMMENT '航空餐',
  `state` int(11) NOT NULL COMMENT '状态',
  `create_time` date NOT NULL COMMENT '创建时间',
  `update_time` date NOT NULL COMMENT '最后一次更新时间',
  PRIMARY KEY (`air_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `dingdinfo`;

CREATE TABLE `dingdinfo` (
  `dingd_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单ID',
  `d_num` varchar(50) NOT NULL COMMENT '订单编号',
  `state` varchar(50) NOT NULL COMMENT '订单状态',
  `price` double NOT NULL COMMENT '金额',
  `consign` int(11) DEFAULT '1' COMMENT '是否托运',
  `price_type` varchar(50) NOT NULL COMMENT '支付方式',
  `evaluate` varchar(1000) DEFAULT NULL COMMENT '评价',
  `create_time` date NOT NULL COMMENT '创建时间',
  `update_time` date NOT NULL COMMENT '最后一次修改时间',
  PRIMARY KEY (`dingd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `quanxian`;

CREATE TABLE `quanxian` (
  `qx_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '权限id',
  `qx_name` varchar(100) NOT NULL COMMENT '权限名',
  `qx_remarks` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`qx_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `user_name` varchar(20) NOT NULL COMMENT '用户名',
  `pwd` varchar(20) NOT NULL COMMENT '密码',
  `user_photo` varchar(100) DEFAULT NULL COMMENT '头像',
  `id_card` varchar(18) DEFAULT NULL COMMENT '身份证号',
  `name` varchar(20) NOT NULL COMMENT '真实姓名',
  `phone_number` int(11) NOT NULL COMMENT '电话号码',
  `alipay` varchar(50) DEFAULT NULL COMMENT '支付宝',
  `we_chat` varchar(50) DEFAULT NULL COMMENT '微信',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `create_time` date NOT NULL COMMENT '创建时间',
  `update_time` date NOT NULL COMMENT '最后一次更新时间',
  `air_id` int(11) DEFAULT NULL COMMENT '航班ID',
  `dingd_id` int(11) DEFAULT NULL COMMENT '订单ID',
  `qx_id` int(11) DEFAULT NULL COMMENT '权限ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


