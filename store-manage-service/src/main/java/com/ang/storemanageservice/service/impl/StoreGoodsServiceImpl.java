package com.ang.storemanageservice.service.impl;

import com.ang.storemanageservice.common.page.PageList;
import com.ang.storemanageservice.common.page.PageUtils;
import com.ang.storemanageservice.common.utils.RestResult;
import com.ang.storemanageservice.common.utils.ResultCode;
import com.ang.storemanageservice.dao.StoreGoodsDao;
import com.ang.storemanageservice.entity.StoreGoods;
import com.ang.storemanageservice.req.StoreGoodsReq;
import com.ang.storemanageservice.service.StoreGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * StoreGoods Service层实现
 */
@Service
public class StoreGoodsServiceImpl extends ServiceImpl<StoreGoodsDao, StoreGoods> implements StoreGoodsService {
    @Autowired
    private StoreGoodsDao storeGoodsDao;

    /**
     * 插入StoreGoods对象
     *
     * @param storeGoods
     */
    public void insertStoreGoods(StoreGoods storeGoods) {
        this.storeGoodsDao.insertStoreGoods(storeGoods);
    }

    /**
     * 更新StoreGoods对象
     *
     * @param storeGoods
     */
    public void updateStoreGoodsById(StoreGoods storeGoods) {
        this.storeGoodsDao.updateStoreGoodsById(storeGoods);
    }

    /**
     * 获取单个StoreGoods对象
     *
     * @param param
     * @return
     */
    public StoreGoods getStoreGoods(Map<String, Object> param) {
        return this.storeGoodsDao.getStoreGoods(param);
    }

    /**
     * 获取StoreGoods列表
     *
     * @param param
     * @return
     */
    public List<StoreGoods> listStoreGoods(Map<String, Object> param) {
        return this.storeGoodsDao.listStoreGoods(param);
    }

    @Override
    public PageList<StoreGoods> pageList(StoreGoodsReq storeGoodsReq) {
        // 当前页
        int pageNum = storeGoodsReq.getPageNum();
        // 当前页行数
        int pageSize = storeGoodsReq.getPageSize();

        Integer count = storeGoodsDao.getCount(storeGoodsReq);
        int start = PageUtils.getStart(pageNum, count, pageSize);
        storeGoodsReq.setStartRow(start);
        storeGoodsReq.setPageSize(pageSize);

        List<StoreGoods> list = storeGoodsDao.pageList(storeGoodsReq);
        return new PageList<>(pageNum, pageSize, count, list);
    }

    @Override
    public RestResult insertStoreGoodsByEntity(StoreGoods storeGoods) {
        storeGoods.setGoodsInitialNum(storeGoods.getGoodsNum());
        storeGoods.setCreateTime(new Date());
        storeGoods.setUpdateTime(new Date());
        storeGoodsDao.insertStoreGoods(storeGoods);
        return RestResult.successNoData(ResultCode.SUCCESS);
    }
}
