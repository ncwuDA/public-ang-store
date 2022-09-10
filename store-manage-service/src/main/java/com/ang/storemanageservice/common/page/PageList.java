package com.ang.storemanageservice.common.page;

import java.util.ArrayList;
import java.util.List;

/**
 * 页面列表
 *
 * @author angang
 * @date 2022/08/30
 */
public class PageList<T> {
    private int totalCount;// 总条数
    private int totalPage;// 总页数
    private int pageSize = 20;// 每页显示行数
    private int pageNum = 1;// 页码
    private List<T> list = new ArrayList<T>();

    /**
     * 构造方法，由此方法建立分页结果对象
     *
     * @param pageNum
     * @param pageSize
     * @param totalCount
     * @param list
     */
    public PageList(int pageNum, int pageSize, int totalCount, List<T> list) {
        if (pageNum > 0) {
            this.pageNum = pageNum;
        }
        if (pageSize > 0) {
            this.pageSize = pageSize;
        }
        this.totalCount = totalCount;
        if (totalCount % pageSize > 0) {
            this.totalPage = totalCount / pageSize + 1;
        } else {
            this.totalPage = totalCount / pageSize;
        }
        this.setList(list);
    }

    /**
     * 构造方法，由此方法建立分页结果对象
     *
     * @param totalCount
     * @param list
     */
    public PageList(PageProperty pageParam, int totalCount, List<T> list) {
        int pageNum = pageParam.getPageNum();
        int pageSize = pageParam.getPageSize();
        if (pageNum > 0) {
            this.pageNum = pageNum;
        }
        if (pageSize > 0) {
            this.pageSize = pageSize;
        }
        this.totalCount = totalCount;
        if (totalCount % pageSize > 0) {
            this.totalPage = totalCount / pageSize + 1;
        } else {
            this.totalPage = totalCount / pageSize;
        }
        this.setList(list);
    }


    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        if (totalCount > 0) {
            this.totalCount = totalCount;
            if (this.totalCount % this.pageSize == 0) {
                this.totalPage = totalCount / pageSize;
            } else if (this.totalCount % this.pageSize > 0) {
                this.totalPage = totalCount / pageSize + 1;
            } else {
                this.totalPage = 0;
            }
        } else {
            this.totalCount = 0;
        }
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
