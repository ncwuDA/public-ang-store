package com.ang.storemanageservice.common.page;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 分页数据请求对象
 *
 * @author angang
 * @date 2022/08/30
 */
@Data
@ApiModel(description = "分页数据请求对象")
public class PageProperty {

    @ApiModelProperty(value = "页码" , name = "pageNum")
    private int pageNum = 1;

    @ApiModelProperty(value = "每页行数" , name = "pageSize")
    private int pageSize = 20;
}
