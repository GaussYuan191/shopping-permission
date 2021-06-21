/*
 Navicat MySQL Data Transfer

 Source Server         : 本地MySQL数据库
 Source Server Type    : MySQL
 Source Server Version : 50730
 Source Host           : localhost:3306
 Source Schema         : mall_tiny

 Target Server Type    : MySQL
 Target Server Version : 50730
 File Encoding         : 65001

 Date: 21/06/2021 10:54:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for oms_order
-- ----------------------------
DROP TABLE IF EXISTS `oms_order`;
CREATE TABLE `oms_order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `order_sn` varchar(64) DEFAULT NULL COMMENT '订单编号',
  `create_time` datetime DEFAULT NULL COMMENT '提交时间',
  `member_username` varchar(64) DEFAULT NULL COMMENT '用户帐号',
  `total_amount` decimal(10,2) DEFAULT NULL COMMENT '订单总金额',
  `pay_type` int(1) DEFAULT NULL COMMENT '支付方式：0->未支付；1->支付宝；2->微信',
  `source_type` int(1) DEFAULT NULL COMMENT '订单来源：0->PC订单；1->app订单',
  `status` int(1) DEFAULT NULL COMMENT '订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Records of oms_order
-- ----------------------------
BEGIN;
INSERT INTO `oms_order` VALUES (1, '202106070001', '2021-06-07 12:45:57', 'demo', 1200.00, 1, 0, 0);
INSERT INTO `oms_order` VALUES (2, '202106070002', '2021-06-07 12:47:58', 'demo', 1400.00, 2, 0, 1);
INSERT INTO `oms_order` VALUES (3, '202106070003', '2021-06-07 12:48:56', 'demo', 1600.00, 1, 0, 2);
INSERT INTO `oms_order` VALUES (4, '202106070004', '2021-06-07 12:49:20', 'demo', 1800.00, 2, 0, 3);
INSERT INTO `oms_order` VALUES (5, '202106070005', '2021-06-07 12:50:03', 'demo', 2000.00, 1, 0, 4);
INSERT INTO `oms_order` VALUES (6, '202106070006', '2021-06-07 12:50:27', 'demo', 2200.00, 1, 0, 0);
INSERT INTO `oms_order` VALUES (7, '202106070007', '2021-06-07 12:50:56', 'demo', 2400.00, 1, 0, 2);
INSERT INTO `oms_order` VALUES (8, '202106070008', '2021-06-07 12:50:59', 'demo', 2600.00, 1, 0, 3);
COMMIT;

-- ----------------------------
-- Table structure for pms_product
-- ----------------------------
DROP TABLE IF EXISTS `pms_product`;
CREATE TABLE `pms_product` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `pic` varbinary(500) DEFAULT NULL COMMENT '展示图片',
  `name` varchar(255) DEFAULT NULL,
  `brand_name` varchar(255) DEFAULT NULL,
  `price` bigint(20) DEFAULT NULL,
  `product_sn` varchar(255) DEFAULT NULL,
  `sale` bigint(20) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `nums` bigint(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='商品信息';

-- ----------------------------
-- Records of pms_product
-- ----------------------------
BEGIN;
INSERT INTO `pms_product` VALUES (1, 0x68747470733A2F2F63646E2E636E626A312E6664732E6170692E6D692D696D672E636F6D2F6D692D6D616C6C2F61623334353237326266393839346262383236396434393031333434623036382E706E67, '小米MIXFold', '小米', 9999, '2021030201', 100, '2021-06-07 21:40:01', 300);
INSERT INTO `pms_product` VALUES (2, 0x68747470733A2F2F63646E2E636E626A312E6664732E6170692E6D692D696D672E636F6D2F6D692D6D616C6C2F61313234316235613934626131373339653835663732643436353932616630652E706E67, '小米11Ultra', '小米', 5999, '2021030202', 200, '2021-06-07 21:42:05', 300);
INSERT INTO `pms_product` VALUES (3, 0x68747470733A2F2F63646E2E636E626A312E6664732E6170692E6D692D696D672E636F6D2F6D692D6D616C6C2F61316334356561646365646562323762316361666361303335393432326461392E706E673F7468756D623D3126773D33353226683D32343226663D7765627026713D3930, '小米11Pro', '小米', 4499, '2021030203', 120, '2021-06-28 00:00:00', 300);
INSERT INTO `pms_product` VALUES (4, 0x68747470733A2F2F63646E2E636E626A312E6664732E6170692E6D692D696D672E636F6D2F6D692D6D616C6C2F35366533333739623534323263623036653563386130633534363434353630362E706E673F7468756D623D3126773D33353226683D32343226663D7765627026713D3930, '小米11青春版', '小米', 2299, '2021030204', 180, '2021-06-24 00:00:00', 300);
INSERT INTO `pms_product` VALUES (5, 0x687474703A2F2F63646E2E636E626A312E6664732E6170692E6D692D696D672E636F6D2F6D692D6D616C6C2F66393134396566336261326339303235613461323163393861653739333830382E706E673F7468756D623D3126773D33353226683D32343226663D7765627026713D3930, '小米10S', '小米', 2999, '2021030205', 140, '2021-06-28 00:00:00', 300);
INSERT INTO `pms_product` VALUES (6, 0x687474703A2F2F63646E2E636E626A312E6664732E6170692E6D692D696D672E636F6D2F6D692D6D616C6C2F39363336373965616633393337333531653135343630306162333434383436302E706E673F7468756D623D3126773D33353226683D32343226663D7765627026713D3930, '小米11', '小米', 3799, '2021030206', 160, '2021-06-08 09:51:11', 300);
COMMIT;

-- ----------------------------
-- Table structure for ums_admin
-- ----------------------------
DROP TABLE IF EXISTS `ums_admin`;
CREATE TABLE `ums_admin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(64) DEFAULT NULL,
  `password` varchar(64) DEFAULT NULL,
  `icon` varchar(500) DEFAULT NULL COMMENT '头像',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `nick_name` varchar(200) DEFAULT NULL COMMENT '昵称',
  `note` varchar(500) DEFAULT NULL COMMENT '备注信息',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  `status` int(1) DEFAULT '1' COMMENT '帐号启用状态：0->禁用；1->启用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COMMENT='后台用户表';

-- ----------------------------
-- Records of ums_admin
-- ----------------------------
BEGIN;
INSERT INTO `ums_admin` VALUES (1, 'demo', '$2a$10$x/BJHGcm8YpR.k6VXYt8We3els9EeBkvUE8oZg5F1clvXlw9njXnu', NULL, '123@qq.com', '超级管理员', '123456', '2021-06-06 00:19:04', '2021-06-17 10:27:20', 1);
INSERT INTO `ums_admin` VALUES (2, 'demo1', '$2a$10$D/ECmx4yxELMlBJ8rOaZpuXVkp6DXZ0rW12d7CDgS9WSdotxNNg.S', NULL, '123@qq.com', '普通用户', '123456', '2021-06-06 00:19:24', '2021-06-10 12:51:21', 1);
INSERT INTO `ums_admin` VALUES (3, 'demo2', '$2a$10$9dAaz0AHLn6w8.KJzpfa8.yV51d4mFVvt2hI3a6U15OWHBAZOh/JS', NULL, '123@qq.com', '商品管理员', NULL, '2021-06-06 23:07:05', '2021-06-10 17:15:20', 1);
INSERT INTO `ums_admin` VALUES (4, 'demo3', '$2a$10$2nWsVumKMuX6UJrp87NhG.f83Zc59WR8Q90A2s5.phv5sXv2Qydf2', NULL, '123@qq.com', '订单管理员', NULL, '2021-06-06 23:08:16', '2021-06-09 23:59:23', 1);
INSERT INTO `ums_admin` VALUES (20, 'demo4', '$2a$10$B.CODnEZ5kwDcldtW/FgU.esL.GXEjYZo862P83/J9IeexksIIgPG', NULL, '123@qq.com', '测试用户', '测试用户', '2021-06-07 10:38:52', NULL, 1);
INSERT INTO `ums_admin` VALUES (21, 'demo5', '$2a$10$M4ewiRVPgX8VcLZfvQjRyOvu8j9/qQBhUzV8kWeZYwEBdEI9y.5c6', NULL, '123@qq.com', 'test2', '测试人员', '2021-06-08 15:29:49', '2021-06-09 23:57:40', 0);
INSERT INTO `ums_admin` VALUES (22, 'demo6', '$2a$10$C7nNNkObDWqva2SFh9SAOu23oUQURDl8vxa5f/406zWqT9PTcon3G', NULL, '123@qq.com', 'test', 'test', '2021-06-10 08:51:40', NULL, 1);
INSERT INTO `ums_admin` VALUES (23, 'demo7', '$2a$10$6lc.YH4RvJD0GIDQ2aI0W.ezUB05/kLZUcCC4VtepavMTsfz0hXNa', NULL, '123@qq.com', 'test', 'test', '2021-06-10 08:52:09', NULL, 1);
INSERT INTO `ums_admin` VALUES (24, 'demo8', '$2a$10$2z7tqimNhWoDR2wfqQBWtuN0V99jLv7iOYAMn/EfGRQP6AJ4KYyG.', NULL, '123@qq.com', 'test', 'test', '2021-06-10 08:52:40', NULL, 1);
INSERT INTO `ums_admin` VALUES (25, 'demo9', '$2a$10$Hwjz.IezF1fSu8t1b684k.Fmg.440D2oAKKhT6jDyfIleivgXPUeW', NULL, '123@qq.com', 'test', 'test', '2021-06-10 08:53:07', NULL, 1);
INSERT INTO `ums_admin` VALUES (26, 'demo10', '$2a$10$EZPT6u.h6Q6EjxMghNw0N.PsWfosAL9zxaIIsqLBk7VCRYXnRDiUa', NULL, '123@qq.com', 'test', 'test', '2021-06-10 08:53:30', NULL, 1);
INSERT INTO `ums_admin` VALUES (27, 'demo11', '$2a$10$8Uco3Pc36aq79KJ5LOmTVOI/CJm9iW/XZlGbB2oNH3..Ot1.atE5u', NULL, '123@qq.com', 'test', 'test', '2021-06-10 08:54:17', NULL, 1);
INSERT INTO `ums_admin` VALUES (28, 'demo13', '$2a$10$GBkrY93z9bcZcnTTQa8Ff.iIej/WbU8r0HBdJGnuJGd1OxUENZZAi', NULL, '123@qq.com', 'test', 'test', '2021-06-10 08:54:56', NULL, 1);
COMMIT;

-- ----------------------------
-- Table structure for ums_admin_role_relation
-- ----------------------------
DROP TABLE IF EXISTS `ums_admin_role_relation`;
CREATE TABLE `ums_admin_role_relation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `admin_id` bigint(20) DEFAULT NULL,
  `role_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8 COMMENT='后台用户和角色关系表';

-- ----------------------------
-- Records of ums_admin_role_relation
-- ----------------------------
BEGIN;
INSERT INTO `ums_admin_role_relation` VALUES (2, 2, 4);
INSERT INTO `ums_admin_role_relation` VALUES (3, 3, 1);
INSERT INTO `ums_admin_role_relation` VALUES (4, 4, 2);
INSERT INTO `ums_admin_role_relation` VALUES (49, 20, 1);
INSERT INTO `ums_admin_role_relation` VALUES (50, 1, 3);
COMMIT;

-- ----------------------------
-- Table structure for ums_menu
-- ----------------------------
DROP TABLE IF EXISTS `ums_menu`;
CREATE TABLE `ums_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_id` bigint(20) DEFAULT NULL COMMENT '父级ID',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `title` varchar(100) DEFAULT NULL COMMENT '菜单名称',
  `level` int(4) DEFAULT NULL COMMENT '菜单级数',
  `sort` int(4) DEFAULT NULL COMMENT '菜单排序',
  `name` varchar(100) DEFAULT NULL COMMENT '前端名称',
  `icon` varchar(200) DEFAULT NULL COMMENT '前端图标',
  `hidden` int(1) DEFAULT NULL COMMENT '前端隐藏',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='后台菜单表';

-- ----------------------------
-- Records of ums_menu
-- ----------------------------
BEGIN;
INSERT INTO `ums_menu` VALUES (1, 0, '2020-02-02 14:50:36', '商品', 0, 0, 'pms', 'product', 0);
INSERT INTO `ums_menu` VALUES (2, 1, '2020-02-02 14:51:50', '商品列表', 1, 0, 'product', 'product-list', 0);
INSERT INTO `ums_menu` VALUES (3, 0, '2020-02-02 16:54:07', '订单', 0, 0, 'oms', 'order', 0);
INSERT INTO `ums_menu` VALUES (4, 3, '2020-02-02 16:55:18', '订单列表', 1, 0, 'order', 'order', 0);
INSERT INTO `ums_menu` VALUES (5, 0, '2020-02-07 16:28:16', '商品管理', 0, 0, 'mms', 'sms-subject', 0);
INSERT INTO `ums_menu` VALUES (6, 5, '2020-02-07 16:28:42', '添加商品', 1, 0, 'add-product', 'shopping', 0);
INSERT INTO `ums_menu` VALUES (7, 0, '2020-02-07 16:29:13', '权限', 0, 0, 'ums', 'ums', 0);
INSERT INTO `ums_menu` VALUES (8, 7, '2020-02-07 16:29:51', '用户列表', 1, 0, 'admin', 'ums-admin', 0);
INSERT INTO `ums_menu` VALUES (9, 7, '2020-02-07 16:30:13', '角色列表', 1, 0, 'role', 'ums-role', 0);
INSERT INTO `ums_menu` VALUES (10, 7, '2020-02-07 16:30:53', '菜单列表', 1, 0, 'menu', 'ums-menu', 0);
INSERT INTO `ums_menu` VALUES (11, 7, '2020-02-07 16:31:13', '资源列表', 1, 0, 'resource', 'ums-resource', 0);
COMMIT;

-- ----------------------------
-- Table structure for ums_resource
-- ----------------------------
DROP TABLE IF EXISTS `ums_resource`;
CREATE TABLE `ums_resource` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `name` varchar(200) DEFAULT NULL COMMENT '资源名称',
  `url` varchar(200) DEFAULT NULL COMMENT '资源URL',
  `description` varchar(500) DEFAULT NULL COMMENT '描述',
  `category_id` bigint(20) DEFAULT NULL COMMENT '资源分类ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='后台资源表';

-- ----------------------------
-- Records of ums_resource
-- ----------------------------
BEGIN;
INSERT INTO `ums_resource` VALUES (1, '2021-06-08 17:09:16', '商品管理', '/mms/**', NULL, 1);
INSERT INTO `ums_resource` VALUES (2, '2021-06-08 14:43:37', '订单管理', '/order/**', '', 2);
INSERT INTO `ums_resource` VALUES (3, '2021-06-08 16:42:16', '商品列表', '/product**', '', 3);
INSERT INTO `ums_resource` VALUES (4, '2021-06-08 16:47:34', '后台用户管理', '/admin/**', '', 4);
INSERT INTO `ums_resource` VALUES (5, '2021-06-08 16:48:24', '后台用户角色管理', '/role/**', '', 4);
INSERT INTO `ums_resource` VALUES (6, '2021-06-08 16:48:48', '后台菜单管理', '/menu/**', '', 4);
INSERT INTO `ums_resource` VALUES (7, '2021-06-08 16:49:18', '后台资源分类管理', '/resourceCategory/**', '', 4);
INSERT INTO `ums_resource` VALUES (8, '2021-06-08 16:49:45', '后台资源管理', '/resource/**', '', 4);
COMMIT;

-- ----------------------------
-- Table structure for ums_resource_category
-- ----------------------------
DROP TABLE IF EXISTS `ums_resource_category`;
CREATE TABLE `ums_resource_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `name` varchar(200) DEFAULT NULL COMMENT '分类名称',
  `sort` int(4) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='资源分类表';

-- ----------------------------
-- Records of ums_resource_category
-- ----------------------------
BEGIN;
INSERT INTO `ums_resource_category` VALUES (1, '2021-06-08 10:21:44', '商品模块', 0);
INSERT INTO `ums_resource_category` VALUES (2, '2021-06-08 10:22:34', '订单模块', 0);
INSERT INTO `ums_resource_category` VALUES (3, '2021-06-08 10:22:48', '普通用户模块', 0);
INSERT INTO `ums_resource_category` VALUES (4, '2021-06-08 10:23:04', '权限模块', 0);
COMMIT;

-- ----------------------------
-- Table structure for ums_role
-- ----------------------------
DROP TABLE IF EXISTS `ums_role`;
CREATE TABLE `ums_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL COMMENT '名称',
  `description` varchar(500) DEFAULT NULL COMMENT '描述',
  `admin_count` int(11) DEFAULT NULL COMMENT '后台用户数量',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `status` int(1) DEFAULT '1' COMMENT '启用状态：0->禁用；1->启用',
  `sort` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='后台用户角色表';

-- ----------------------------
-- Records of ums_role
-- ----------------------------
BEGIN;
INSERT INTO `ums_role` VALUES (1, '商品管理员', '只能查看及操作商品', 2, '2021-06-08 16:50:37', 1, 0);
INSERT INTO `ums_role` VALUES (2, '订单管理员', '只能查看及操作订单', 1, '2021-06-08 15:53:45', 0, 0);
INSERT INTO `ums_role` VALUES (3, '超级管理员', '拥有所有查看和操作功能', 1, '2021-06-08 15:11:05', 1, 0);
INSERT INTO `ums_role` VALUES (4, '普通用户', '只用于查看商品', 1, '2021-06-08 10:57:35', 1, 0);
COMMIT;

-- ----------------------------
-- Table structure for ums_role_menu_relation
-- ----------------------------
DROP TABLE IF EXISTS `ums_role_menu_relation`;
CREATE TABLE `ums_role_menu_relation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  `menu_id` bigint(20) DEFAULT NULL COMMENT '菜单ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=192 DEFAULT CHARSET=utf8 COMMENT='后台角色菜单关系表';

-- ----------------------------
-- Records of ums_role_menu_relation
-- ----------------------------
BEGIN;
INSERT INTO `ums_role_menu_relation` VALUES (175, 4, 1);
INSERT INTO `ums_role_menu_relation` VALUES (176, 4, 2);
INSERT INTO `ums_role_menu_relation` VALUES (177, 3, 1);
INSERT INTO `ums_role_menu_relation` VALUES (178, 3, 2);
INSERT INTO `ums_role_menu_relation` VALUES (179, 3, 3);
INSERT INTO `ums_role_menu_relation` VALUES (180, 3, 4);
INSERT INTO `ums_role_menu_relation` VALUES (181, 3, 5);
INSERT INTO `ums_role_menu_relation` VALUES (182, 3, 6);
INSERT INTO `ums_role_menu_relation` VALUES (183, 3, 7);
INSERT INTO `ums_role_menu_relation` VALUES (184, 3, 8);
INSERT INTO `ums_role_menu_relation` VALUES (185, 3, 9);
INSERT INTO `ums_role_menu_relation` VALUES (186, 3, 10);
INSERT INTO `ums_role_menu_relation` VALUES (187, 3, 11);
INSERT INTO `ums_role_menu_relation` VALUES (188, 2, 3);
INSERT INTO `ums_role_menu_relation` VALUES (189, 2, 4);
INSERT INTO `ums_role_menu_relation` VALUES (190, 1, 3);
INSERT INTO `ums_role_menu_relation` VALUES (191, 1, 4);
COMMIT;

-- ----------------------------
-- Table structure for ums_role_resource_relation
-- ----------------------------
DROP TABLE IF EXISTS `ums_role_resource_relation`;
CREATE TABLE `ums_role_resource_relation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  `resource_id` bigint(20) DEFAULT NULL COMMENT '资源ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=258 DEFAULT CHARSET=utf8 COMMENT='后台角色资源关系表';

-- ----------------------------
-- Records of ums_role_resource_relation
-- ----------------------------
BEGIN;
INSERT INTO `ums_role_resource_relation` VALUES (217, 2, 2);
INSERT INTO `ums_role_resource_relation` VALUES (248, 3, 1);
INSERT INTO `ums_role_resource_relation` VALUES (249, 3, 2);
INSERT INTO `ums_role_resource_relation` VALUES (250, 3, 3);
INSERT INTO `ums_role_resource_relation` VALUES (251, 3, 4);
INSERT INTO `ums_role_resource_relation` VALUES (252, 3, 5);
INSERT INTO `ums_role_resource_relation` VALUES (253, 3, 6);
INSERT INTO `ums_role_resource_relation` VALUES (254, 3, 7);
INSERT INTO `ums_role_resource_relation` VALUES (255, 3, 8);
INSERT INTO `ums_role_resource_relation` VALUES (256, 4, 3);
INSERT INTO `ums_role_resource_relation` VALUES (257, 1, 2);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
