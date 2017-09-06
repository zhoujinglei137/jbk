package com.jbk.admin.vo;

import java.util.List;

/**
 * Created by 姚鹏 on 2017/9/1.
 */
public class PageBean<T> {
    private int page;//当前页的页码
    private int pagesize;//每页显示的数�?
    private int total;//符合条件的数�?
    private List<T> rows;//指定页码显示的内�?
    private String url;//存放URL
    public int getTotalPages(){
        return (total+pagesize-1)/pagesize;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
