package com.ang.storemanageservice.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class StoreGoodsReq {

    private Integer goodsId;

    private String goodsName;

    private String goodsType;

    private BigDecimal goodsPrice;

    private Integer goodsNum;

    private Integer goodsInitialNum;

    private String goodsSupplier;

    @ApiModelProperty(name = "pageNum", value = "页码")
    private Integer pageNum;

    @ApiModelProperty(name = "pageSize", value = "行数")
    private Integer pageSize;

    @ApiModelProperty(name = "startRow", value = "分页开始行", hidden = true)
    private Integer startRow;

    @ApiModelProperty(name = "key", value = "商品名称查询")
    private String key;

}
