package com.ang.storemanageservice.service;

import com.ang.storemanageservice.entity.StoreGoodsType;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
* StoreGoodsType Service层接口
*/
public interface StoreGoodsTypeService extends IService<StoreGoodsType> {
    /**
     *插入StoreGoodsType对象
     *@param storeGoodsType
    */
    public void insertStoreGoodsType(StoreGoodsType storeGoodsType);

    /**
     *更新StoreGoodsType对象
     *@param storeGoodsType
    */
    public void updateStoreGoodsTypeById(StoreGoodsType storeGoodsType);

    /**
     *获取单个StoreGoodsType对象
     *@param param
     *@return
    */
    public StoreGoodsType getStoreGoodsType(Map<String, Object> param);

    /**
     *获取StoreGoodsType列表
     *@param param
     *@return
    */
    public List<StoreGoodsType> listStoreGoodsType(Map<String, Object> param);
}