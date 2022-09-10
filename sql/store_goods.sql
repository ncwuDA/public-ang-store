/*
 Navicat Premium Data Transfer

 Source Server         : 43.138.20.232
 Source Server Type    : MySQL
 Source Server Version : 50650
 Source Host           : 43.138.20.232:3306
 Source Schema         : da_store

 Target Server Type    : MySQL
 Target Server Version : 50650
 File Encoding         : 65001

 Date: 02/09/2022 16:02:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for store_goods
-- ----------------------------
DROP TABLE IF EXISTS store_goods;
CREATE TABLE store_goods  (
  goods_id int(11) NOT NULL AUTO_INCREMENT COMMENT '商品id',
  goods_name varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '商品名称',
  goods_type varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '商品类别',
  goods_price decimal(10, 2) NULL DEFAULT NULL COMMENT '商品价格',
  goods_num int(11) NULL DEFAULT NULL COMMENT '商品存货',
  goods_initial_num int(11) NULL DEFAULT NULL COMMENT '商品初始存货',
  goods_supplier varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '商品供应商',
  create_time datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  update_time datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (goods_id) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
