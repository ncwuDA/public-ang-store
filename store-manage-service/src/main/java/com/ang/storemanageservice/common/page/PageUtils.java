package com.ang.storemanageservice.common.page;

/**
 * 分页工具类
 *
 * @author angang
 * @date 2022/08/30
 */
public class PageUtils {
    /**
     * 获得记录开始位置
     * 超出最大页数返回最后一页
     *
     * @param count    数
     * @param pageSize 页面大小
     * @param pageNum  页面num
     * @return int
     */
    public static int getStart(int pageNum, int count, int pageSize) {

        if ((pageNum - 1) * pageSize >= count) {

            if (count % pageSize > 0) {
                pageNum = count / pageSize + 1;
            } else {
                pageNum = count / pageSize;
            }
        }
        if (pageNum < 1) {
            pageNum = 1;
        }

        return (pageNum - 1) * pageSize;
    }

    /**
     * 获得记录开始位置
     * 超出最大页数返回0
     *
     * @param pageNum  页面num
     * @param count    数
     * @param pageSize 页面大小
     * @return int
     */
    public static int getStartOver(int pageNum, int count, int pageSize) {
        if ((pageNum - 1) * pageSize >= count) {
            return 0;
        }
        if (pageNum < 1) {
            pageNum = 1;
        }

        return (pageNum - 1) * pageSize;
    }

    /**
     * 获得记录结束位置
     * 超出最大页数返回最后一页
     *
     * @param pageNum  页面num
     * @param count    数
     * @param pageSize 页面大小
     * @return int
     */
    public static int getEnd(int pageNum, int count, int pageSize) {

        if (pageNum < 1) {
            pageNum = 1;
        }
        if (count < 0) {
            count = 0;
        }
        int end = 0;
        if (count - (pageNum - 1) * pageSize >= pageSize) {
            end = getStart(pageNum, pageSize) + pageSize;
        } else {
            end = count;
        }
        return end;

    }

    /**
     * 获得记录结束位置
     * 超出最大页数返回0
     *
     * @param pageNum  页面num
     * @param count    数
     * @param pageSize 页面大小
     * @return int
     */
    public static int getEndOver(int pageNum, int count, int pageSize) {
        if (pageNum < 1) {
            pageNum = 1;
        }
        if (count < 0) {
            count = 0;
        }
        if ((pageNum - 1) * pageSize >= count) {
            return 0;
        }
        int end = 0;
        if (count - (pageNum - 1) * pageSize >= pageSize) {
            end = getStart(pageNum, pageSize) + pageSize;
        } else {
            end = count;
        }
        return end;
    }

    public static int getStart(int pageNum, int pageSize) {
        if (pageNum < 1) {
            pageNum = 1;
        }
        return (pageNum - 1) * pageSize;
    }

}
