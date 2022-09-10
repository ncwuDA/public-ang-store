package com.ang.storemanageservice.entity;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
/**
* StoreGoods PO实体类，除非数据库增减字段，否则不允许擅自增加或删除属性
*/
@Data
public class StoreGoods {

	@TableId(value = "goods_id", type = IdType.AUTO)
	private Integer goodsId;

	private String goodsName;

	private String goodsType;

	private BigDecimal goodsPrice;

	private Integer goodsNum;

	private Integer goodsInitialNum;

	private String goodsSupplier;

	@TableField(fill = FieldFill.INSERT)
	private Date createTime;

	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Date updateTime;

}
