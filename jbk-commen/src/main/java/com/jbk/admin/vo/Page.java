package com.jbk.admin.vo;

/**
 * Created by Administrator on 2017/9/4.
 */
public class Page {
    private int page;
    private int rows;
    //private String totalPage;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
    public int getTotalPage() {
        return (page+rows-1)/page;
    }
}
