package com.ang.storemanageservice.controller;

import com.ang.storemanageservice.common.page.PageList;
import com.ang.storemanageservice.common.utils.RestResult;
import com.ang.storemanageservice.common.utils.ResultCode;
import com.ang.storemanageservice.entity.StoreGoods;
import com.ang.storemanageservice.req.StoreGoodsReq;
import com.ang.storemanageservice.service.StoreGoodsService;
import com.ang.storemanageservice.service.StoreGoodsTypeService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@Api(tags = "商品管理")
@RestController
@RequestMapping("/goods")
public class StoreGoodsController {

    @Autowired
    private StoreGoodsService storeGoodsService;

    @Autowired
    private StoreGoodsTypeService storeGoodsTypeService;

    @ApiOperation("新增商品")
    @PostMapping("/insert")
    public RestResult insert(@RequestBody StoreGoods storeGoods) {
        if (storeGoods == null) return RestResult.fail(ResultCode.DATA_IS_WRONG);
        return storeGoodsService.insertStoreGoodsByEntity(storeGoods);
    }

    @ApiOperation("删除商品")
    @PostMapping("/deleteById")
    public RestResult deleteById(@RequestBody StoreGoods storeGoods) {
        if (storeGoods.getGoodsId() == null) return RestResult.fail(ResultCode.DATA_IS_WRONG);
        storeGoodsService.removeById(storeGoods);
        return RestResult.successNoData(ResultCode.SUCCESS);
    }

    @ApiOperation("修改商品")
    @PostMapping("/updateById")
    public RestResult updateById(@RequestBody StoreGoods storeGoods) {
        if (storeGoods.getGoodsId() == null) return RestResult.fail(ResultCode.DATA_IS_WRONG);
        storeGoods.setUpdateTime(new Date());
        storeGoodsService.updateById(storeGoods);
        return RestResult.successNoData(ResultCode.SUCCESS);
    }

    @ApiOperation("获取商品类别")
    @PostMapping("/goodsType")
    public RestResult goodsType() {
        return RestResult.success(storeGoodsTypeService.list(new QueryWrapper<>()),ResultCode.SUCCESS);
    }

    @ApiOperation("分页获取商品")
    @PostMapping("/pageList")
    public RestResult pageList(@RequestBody StoreGoodsReq storeGoodsReq) {
        if (storeGoodsReq == null) return RestResult.fail(ResultCode.DATA_IS_WRONG);
        PageList<StoreGoods> pageList = storeGoodsService.pageList(storeGoodsReq);
        return RestResult.success(pageList,ResultCode.SUCCESS);
    }

}