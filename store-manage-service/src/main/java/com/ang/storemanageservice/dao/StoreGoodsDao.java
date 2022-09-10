package com.ang.storemanageservice.dao;

import com.ang.storemanageservice.entity.StoreGoods;
import com.ang.storemanageservice.req.StoreGoodsReq;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
* StoreGoods Dao层接口
*/
@Repository
public interface StoreGoodsDao extends BaseMapper<StoreGoods> {
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
     * 获取总数
     *
     * @param storeGoodsReq
     * @return {@link Integer}
     */
    Integer getCount(StoreGoodsReq storeGoodsReq);

    /**
     * 页面列表
     *
     * @param storeGoodsReq
     * @return {@link List}<{@link StoreGoods}>
     */
    List<StoreGoods> pageList(StoreGoodsReq storeGoodsReq);
}
