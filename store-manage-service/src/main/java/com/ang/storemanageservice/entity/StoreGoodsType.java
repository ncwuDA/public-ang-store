package com.ang.storemanageservice.entity;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
/**
* StoreGoodsType PO实体类，除非数据库增减字段，否则不允许擅自增加或删除属性
*/
@Data
public class StoreGoodsType {

	@TableId(value = "goods_type_id", type = IdType.AUTO)
	private Integer goodsTypeId;

	private String goodsTypeName;

}
