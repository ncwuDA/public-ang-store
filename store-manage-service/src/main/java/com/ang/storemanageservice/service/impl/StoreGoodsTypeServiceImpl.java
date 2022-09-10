package com.ang.storemanageservice.service.impl;

import com.ang.storemanageservice.service.StoreGoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ang.storemanageservice.dao.StoreGoodsTypeDao;
import com.ang.storemanageservice.entity.StoreGoodsType;

import java.util.List;
import java.util.Map;

/**
 * StoreGoodsType Service层实现
 */
@Service
public class StoreGoodsTypeServiceImpl extends ServiceImpl<StoreGoodsTypeDao, StoreGoodsType> implements StoreGoodsTypeService {
	@Autowired
	private StoreGoodsTypeDao storeGoodsTypeDao;

    /**
     *插入StoreGoodsType对象
     *@param storeGoodsType
    */
    public void insertStoreGoodsType(StoreGoodsType storeGoodsType) {
        this.storeGoodsTypeDao.insertStoreGoodsType(storeGoodsType);
    }

    /**
    *更新StoreGoodsType对象
    *@param storeGoodsType
    */
    public void updateStoreGoodsTypeById(StoreGoodsType storeGoodsType) {
        this.storeGoodsTypeDao.updateStoreGoodsTypeById(storeGoodsType);
    }

    /**
    *获取单个StoreGoodsType对象
    *@param param
    *@return
    */
    public StoreGoodsType getStoreGoodsType(Map<String, Object> param) {
        return this.storeGoodsTypeDao.getStoreGoodsType(param);
    }

    /**
    *获取StoreGoodsType列表
    *@param param
    *@return
    */
    public List<StoreGoodsType> listStoreGoodsType(Map<String, Object> param) {
        return this.storeGoodsTypeDao.listStoreGoodsType(param);
    }
}
