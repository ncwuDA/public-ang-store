package com.ang.storemanageservice.dao;

import com.ang.storemanageservice.entity.StoreGoodsType;
import org.springframework.stereotype.Repository;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
* StoreGoodsType Dao层接口
*/
@Repository
public interface StoreGoodsTypeDao extends BaseMapper<StoreGoodsType> {
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
