package com.ang.storemanageservice.service;

import com.ang.storemanageservice.common.page.PageList;
import com.ang.storemanageservice.common.utils.RestResult;
import com.ang.storemanageservice.entity.StoreGoods;
import com.ang.storemanageservice.req.StoreGoodsReq;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
* StoreGoods Service层接口
*/
public interface StoreGoodsService extends IService<StoreGoods> {
    /**
     *插入StoreGoods对象
     *@param storeGoods
    */
    public void insertStoreGoods(StoreGoods storeGoods);

    /**
     *更新StoreGoods对象
     *@param storeGoods
    */
    public void updateStoreGoodsById(StoreGoods storeGoods);

    /**
     *获取单个StoreGoods对象
     *@param param
     *@return
    */
    public StoreGoods getStoreGoods(Map<String, Object> param);

    /**
     *获取StoreGoods列表
     *@param param
     *@return
    */
    public List<StoreGoods> listStoreGoods(Map<String, Object> param);


    /**
     * 获取分页页面列表
     *
     * @param storeGoodsReq
     * @return {@link PageList}<{@link StoreGoods}>
     */
    PageList<StoreGoods> pageList(StoreGoodsReq storeGoodsReq);

    /**
     * 插入实体
     *
     * @param storeGoods
     * @return {@link RestResult}
     */
    public RestResult insertStoreGoodsByEntity(StoreGoods storeGoods);
}