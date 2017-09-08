package com.jbk.util;

import java.util.List;

/**
 * Created by 刘铭 on 2017/9/7 0007.
 */
public class PageBean<T> {
    private int page;//当前页的页码
    private int pageSize;//每页显示的记录条数
    private long total;//符合条件的总记录条数
    //private int totalPages;//总页数
    private List<T> rows;//指定页码显示的内容

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public long getTotalPages() {
        return (total+pageSize-1)/pageSize;
    }
}
